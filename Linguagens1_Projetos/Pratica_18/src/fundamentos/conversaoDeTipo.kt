package fundamentos

fun main() {
    var num1: Double
    var num2: Int
    var result: Double
    println("Informe 2 numeros:")
    println("Numero real:")
    num1 = readLine()!!.toDouble()
    println("Numero inteiro:")
    num2 = readLine()!!.toInt()
    result = num1+num2
    println("Resultado = $result")
    println("Resultado = ${num1+num2}")
    println("Resultado= %.3f".format(result))
}