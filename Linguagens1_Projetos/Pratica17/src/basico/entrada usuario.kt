package basico

fun main(){
    println("Informe um nome:")
    var nome = readLine()   //le oq o usuario escreve ate ele apertar enter
    println("Ola $nome")
    println("Informe 2 numeros")
    val num1 = readLine()!!.toDouble()
    val num2 = readLine()!!.toDouble()
    println("Resultado da some $num1 com o $num2 é igual a ${num1+num2}")
}