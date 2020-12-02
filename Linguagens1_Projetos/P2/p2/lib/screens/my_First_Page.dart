import 'package:flutter/material.dart';
import 'package:p2/screens/Partida.dart';

class MyFirstPage extends StatefulWidget {
  
  @override
  _MyFirstPageState createState() => _MyFirstPageState();
}
final controladorID = TextEditingController();
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
            
            Navigator.push(
            context,
            MaterialPageRoute(builder: (context) =>
              Partida(controladorID.text)
            ),
          );
          }, child: Text("Procurar")),
        ]
      )
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

