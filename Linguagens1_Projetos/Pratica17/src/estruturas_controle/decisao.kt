package estruturas_controle

fun main(){
    val num = 15
    if(num%2 == 0){
        println("É par")
    }else{
        println("é impar")
    }
    //simular um ternario
    val num2 = 40
    val resultado = if (num2%2==0) "Par" else "Impar"
    println("$resultado")

    //Elvis operator
    //Deixa explicito q a variavel pode receber um valor nulo
    var nome:String ?
    nome = "Miguel"
    println(nome)
    nome = null
    println("${nome?: "Ryu"}")

}