import 'package:flutter/material.dart';
import 'package:p2/models/Matches.dart';
import 'package:p2/models/Partida2.dart';

// ignore: must_be_immutable
class Partida extends StatelessWidget {
  List<Matche> allMatches;
  String nomeInvocador;
  Partida2 partida = new Partida2();
  Partida({Key key,@required this.partida, @required this.nomeInvocador}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    print("Cheguei");

    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(title:Text("Historico de partidas"),backgroundColor: Colors.blueAccent),
      body:Column(
        children: [
          SizedBox(width:300,height: 200,child:Image.asset("assets/dices/logoLOL.png")),
          // Text("Partidas recentes (Últimas 15 jogadas) de "+nomeInvocador,style:TextStyle(fontSize: 20)),
          Text("Última Partida jogada por "+nomeInvocador,style:TextStyle(fontSize: 30)),
          Expanded(
            child: Row(children: [
              Center(child: Column(
                children:[
                  Text("Duração do jogo(em segundos): "+partida.gameDuration.toString(),style: TextStyle(fontSize: 25, color: Colors.black)),
                  Text("O modo do jogo foi: "+partida.gameMode.toString(),style: TextStyle(fontSize: 25, color: Colors.black)),
                  Text("O tipo do jogo foi: "+partida.gameType.toString(),style: TextStyle(fontSize: 25, color: Colors.black)),
                  Text("O time azul: "+partida.teams[0].win.toString(),style: TextStyle(fontSize: 25, color: Colors.black)),
                  Text("O time vermelho: "+partida.teams[1].win.toString(),style: TextStyle(fontSize: 25, color: Colors.black)),
                  
                ]
              ),
              ),
            ]
            ),
          )
        ]
      )
    );
  }
}