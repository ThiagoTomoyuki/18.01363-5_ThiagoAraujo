import 'package:flutter/material.dart';
import 'package:p2/models/Account.dart';
import 'package:p2/models/Matches.dart';

// ignore: must_be_immutable
class Partida extends StatelessWidget {
  List<Matche> allMatches;
  Account account = new Account();
  Matches matches = new Matches();
  Partida(this.allMatches);
  @override
  Widget build(BuildContext context) {
    print(allMatches[0].champion);
    
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(title:Text("Historico de partidas"),backgroundColor: Colors.blueAccent),
      body:Column(
        children: [
          SizedBox(width:300,height: 200,child:Image.asset("assets/dices/logoLOL.png")),
          Text("Partidas recentes (Últimas 15 jogadas) de "+account.name,style:TextStyle(fontSize: 20)),
          Expanded(
            child: Row(children: [
              Column(
                children:[
                  Text("Nome campeao"),
                  SizedBox(width:100,height: 50,child: Image.network("https://pyre-media-2.s3.sa-east-1.amazonaws.com/1fc06b12-a8b8-4dbb-a692-9111bc084e7cleague-of-legends-maracanazinho.png"))
                ]
              ),
              Column(
                children:[
                  Text("KDA"),
                  
                ]
              ),
              Column(
                children:[
                  Text("DATA"),
                ]
              ),
              Column(
                children:[
                  Text("WON"),
                ]
              ),
              

            ],),
          )
        ]
      )
    );
  }
}