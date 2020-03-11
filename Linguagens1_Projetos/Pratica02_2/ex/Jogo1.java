//1- Pedra
//2- Papel
//3- Tesoura

//0= Jogador 1
//1= Jogador 2
//2= Empate

public class Jogo1 {
    int Batalha( Jogador J1, Jogador J2){
        if((J1.Jogada.Escolha) == (J2.Jogada.Escolha)){
            return 2;
        }else if(((J1.Jogada.Escolha) == 1) && ((J2.Jogada.Escolha) == 2)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 1) && ((J2.Jogada.Escolha) == 3)){
            return 0;        
        }else if(((J1.Jogada.Escolha) == 2) && ((J2.Jogada.Escolha) == 3)){
            return 1;        
        }else if(((J1.Jogada.Escolha) == 2) && ((J2.Jogada.Escolha) == 1)){
            return 0;        
        }else if(((J1.Jogada.Escolha) == 3) && ((J2.Jogada.Escolha) == 1)){
            return 1;        
        }else if(((J1.Jogada.Escolha) == 3) && ((J2.Jogada.Escolha) == 2)){
            return 0;        
        }else{
            return 4;
        }
    }
}




