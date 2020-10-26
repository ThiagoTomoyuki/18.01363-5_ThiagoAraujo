package funcoes

//Declara uma funcao

fun  somarDoisNumeros(nume1:Int, nume2:Int): Int{
    return nume1+nume2
}

//Para funcoes de uma linha so

fun mult2numeros(nume1:Double,nume2: Int)= nume2*nume1

fun main(){
    println("${somarDoisNumeros(4,5)}")
    println("${mult2numeros(4.5,5)}")
}