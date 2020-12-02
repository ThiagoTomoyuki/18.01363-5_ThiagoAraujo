import 'package:flutter/material.dart';
import 'package:p2/models/Account.dart';
import 'package:p2/utilites/network_helper.dart';

// ignore: must_be_immutable
class Partida extends StatelessWidget {
  String nomeInvocador;
  Account account = new Account();
  Partida(this.nomeInvocador);
  @override
  Widget build(BuildContext context) {
    accountResponse();
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(title:Text("Historico de partidas"),backgroundColor: Colors.blueAccent),
      body:Column(
        children: [
          Center(),
          SizedBox(width:300,height: 200,child:Image.asset("assets/dices/logoLOL.png")),
          Text("Partidas recentes (Últimas 15 jogadas) de ",style:TextStyle(fontSize: 20)),
        ]
      )
    );
  }
  void accountResponse() async {
  const api_key="RGAPI-b56a8197-d3c1-45f2-b158-3025f9885caa";
  var requisicao = NetworkHelper(url:"https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+nomeInvocador+"?api_key="+api_key);
  var dados1 = Account.fromJson(await requisicao.getData());
  
  account.id= dados1.id;
  account.accountId=dados1.accountId;
  account.puuid= dados1.puuid;
  account.name= dados1.name;
  account.summonerLevel=dados1.summonerLevel;
  requisicao=NetworkHelper(url:"https://br1.api.riotgames.com/lol/match/v4/matchlists/by-account/"+account.accountId+"?endIndex=15&api_key="+api_key);
  var dados2 = Account.fromJson(await requisicao.getData());
  print(dados2);
  }   
}

