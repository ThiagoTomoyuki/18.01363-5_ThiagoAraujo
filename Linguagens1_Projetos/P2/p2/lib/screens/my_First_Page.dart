import 'package:flutter/material.dart';
import 'package:p2/models/Account.dart';
import 'package:p2/models/Matches.dart';
import 'package:p2/models/Partida2.dart';
import 'package:p2/screens/Partida.dart';
import 'package:p2/utilites/network_helper.dart';

class MyFirstPage extends StatefulWidget {
  @override
  _MyFirstPageState createState() => _MyFirstPageState();
}
final controladorID = TextEditingController();
Account account = new Account();
Matches matches = new Matches();

class _MyFirstPageState extends State<MyFirstPage> {
  @override
  Widget build(BuildContext context) { 
    
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(title:Text("League of Legends"),backgroundColor: Colors.blueAccent),
      body:Column(
        children: [
          SizedBox(width:300,height: 200,child:Image.asset("assets/dices/logoLOL.png")),
          Padding(
            padding: const EdgeInsets.all(9.0),
            child: Text("League of Legends(LOL) é um jogo que esta a muito tempo no mercado e ele é um dos jogos mais jogados da atualidade, com isso em mente, esse app mostra seu historico de partidas.",style:TextStyle(fontSize: 20)),
          ),
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Image.asset("assets/dices/fotoInicio.jpg"),
          ),
          txtField(controladorID),
          FlatButton(onPressed: ()async{
            accountResponse();
            
          }, child: Text("Procurar")),
        ]
      )
    );

    
  }
  accountResponse() async {
    const _api_key="RGAPI-0d8f8edd-a702-4caf-b8a0-327101de606e";
    var requisicao1 = NetworkHelper(url:"https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+controladorID.text.toString()+"?api_key="+_api_key);
    var dados1 = Account.fromJson(await requisicao1.getData());
    // List<int> listGameId;
    // List<Matche> allMatches;
    account.id= dados1.id;
    account.accountId=dados1.accountId;
    account.puuid= dados1.puuid;
    account.name= dados1.name;
    account.summonerLevel=dados1.summonerLevel;
    var requisicao2=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matchlists/by-account/"+account.accountId.toString()+"?endIndex=10&api_key="+_api_key);
    var dados2 = Matches.fromJson(await requisicao2.getData());
    var requisicao3=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+dados2.matches[0].gameId.toString()+"?api_key="+_api_key);
    var partida = Partida2.fromJson(await requisicao3.getData());
    print(dados2.matches[0].champion);
    // ignore: unnecessary_statements
    // for(var i in dados2.matches){
    //   listGameId.add(i.gameId);
    // }

    // for(var i in listGameId){
    //   var requisicao3=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[i].toString()+"?api_key="+_api_key);
    //   var match = Matche.fromJson(await requisicao3.getData());
    //   allMatches.add(match);
    // }
    print("antes");
    Navigator.push(
            context,
            MaterialPageRoute(builder: (context) =>
              // Partida(allMatches)
              
              Partida(partida:partida,nomeInvocador:controladorID.text)
            ),
    );
  } 
}
  

 Widget txtField(TextEditingController nomeInvocador){

  return Padding(
    padding: EdgeInsets.all(40.0),
    child: TextField(
      controller: nomeInvocador,
      decoration: InputDecoration(
      hintText: "Nick do LOL",
      labelText: "Coloque o nome do Invocador:",
      border: const OutlineInputBorder(),
      ),
    ),
  );
 }

