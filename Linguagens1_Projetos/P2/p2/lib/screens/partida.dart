import 'package:flutter/material.dart';
import 'package:p2/models/Account.dart';
import 'package:p2/models/Matches.dart';
import 'package:p2/models/Campeao.dart';
import 'package:p2/utilites/IdsChampions.json';

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
          Text("Partidas recentes (Últimas 15 jogadas) ",style:TextStyle(fontSize: 20)),
          Expanded(
            child: ListView.builder(
              itemBuilder: (context, index) {
                final item = allMatches[index];
                return Container(
                        child: ListTile(
                          title:Text(""),
                          subtitle: SizedBox(child: Image.network("https://streamie.com.br/wp-content/uploads/2018/02/img-kaisa-capa.png"),height: 50,width: 100),
                        ),
                );
              },
              itemCount: allMatches.length,
            ),
          )
        ]
      )
    );
  }
}