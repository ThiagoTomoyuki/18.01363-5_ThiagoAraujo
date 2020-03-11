//1- Rock
//2- Paper
//3- Scissor
//4- Lizard
//5- Spoke

//0= Jogador 1
//1= Jogador 2
//2= Empate

public class Jogo2 {
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
        }else if(((J1.Jogada.Escolha) == 1) && ((J2.Jogada.Escolha) == 4)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 4) && ((J2.Jogada.Escolha) == 1)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 4) && ((J2.Jogada.Escolha) == 5)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 5) && ((J2.Jogada.Escolha) == 4)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 5) && ((J2.Jogada.Escolha) == 3)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 3) && ((J2.Jogada.Escolha) == 5)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 3) && ((J2.Jogada.Escolha) == 4)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 4) && ((J2.Jogada.Escolha) == 3)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 4) && ((J2.Jogada.Escolha) == 2)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 2) && ((J2.Jogada.Escolha) == 4)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 2) && ((J2.Jogada.Escolha) == 5)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 5) && ((J2.Jogada.Escolha) == 2)){
            return 1;
        }else if(((J1.Jogada.Escolha) == 5) && ((J2.Jogada.Escolha) == 1)){
            return 0;
        }else if(((J1.Jogada.Escolha) == 1) && ((J2.Jogada.Escolha) == 5)){
            return 1;
        }else{
            return 4;
        }
}
}





