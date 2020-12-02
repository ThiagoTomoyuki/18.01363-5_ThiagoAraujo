import 'package:flutter/material.dart';
import 'package:p2/models/Account.dart';
import 'package:p2/models/Matches.dart';
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
    
    account.id= dados1.id;
    account.accountId=dados1.accountId;
    account.puuid= dados1.puuid;
    account.name= dados1.name;
    account.summonerLevel=dados1.summonerLevel;
    var requisicao2=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matchlists/by-account/"+account.accountId+"?endIndex=10&api_key="+_api_key);
    var dados2 = Matches.fromJson(await requisicao2.getData());
    // ignore: unnecessary_statements
    List<int> listGameId=[
      dados2.matches[0].gameId,
      dados2.matches[1].gameId,
      dados2.matches[2].gameId,
      dados2.matches[3].gameId,
      dados2.matches[4].gameId,
      dados2.matches[5].gameId,
      dados2.matches[6].gameId,
      dados2.matches[7].gameId,
      dados2.matches[8].gameId,
      dados2.matches[9].gameId,
    ];
    var requisicao3=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[0].toString()+"?api_key="+_api_key);
    var match1 = Matche.fromJson(await requisicao3.getData());
    var requisicao4=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[1].toString()+"?api_key="+_api_key);
    var match2 = Matche.fromJson(await requisicao4.getData());
    var requisicao5=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[2].toString()+"?api_key="+_api_key);
    var match3 = Matche.fromJson(await requisicao5.getData());
    var requisicao6=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[3].toString()+"?api_key="+_api_key);
    var match4 = Matche.fromJson(await requisicao6.getData());
    var requisicao7=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[4].toString()+"?api_key="+_api_key);
    var match5 = Matche.fromJson(await requisicao7.getData());
    var requisicao8=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[5].toString()+"?api_key="+_api_key);
    var match6 = Matche.fromJson(await requisicao8.getData());
    var requisicao9=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[6].toString()+"?api_key="+_api_key);
    var match7 = Matche.fromJson(await requisicao9.getData());
    var requisicao10=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[7].toString()+"?api_key="+_api_key);
    var match8 = Matche.fromJson(await requisicao10.getData());
    var requisicao11=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[8].toString()+"?api_key="+_api_key);
    var match9 = Matche.fromJson(await requisicao11.getData());
    var requisicao12=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matches/"+listGameId[9].toString()+"?api_key="+_api_key);
    var match10 = Matche.fromJson(await requisicao12.getData());
    List<Matche> allMatches=[
      match1,
      match2,
      match3,
      match4,
      match5,
      match6,
      match7,
      match8,
      match9,
      match10,
    ];
    Navigator.push(
            context,
            MaterialPageRoute(builder: (context) =>
              Partida(allMatches)
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

