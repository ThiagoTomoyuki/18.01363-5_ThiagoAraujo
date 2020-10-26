package estruturas

fun somarDoisNumerosInt(num1:Int ,num2 : Int) = num1+num2
fun somarDoisNumerosValorPadrao(num1:Int=5 ,num2 : Int=6) = num1+num2
fun somarDoisNumerosValorPadrao2(num1:Int=0 ,num2 : Int=0):Int{
    return num1+num2
}

fun main() {
    val num1 = 10
    val num2 = 25
    println("Retorno da soma: ${somarDoisNumerosInt(num1,num2)}")
    println("Retorno da soma: ${somarDoisNumerosValorPadrao(num1,num2)}")
    println("Retorno da soma: ${somarDoisNumerosValorPadrao(num1)}")
    println("Retorno da soma: ${somarDoisNumerosValorPadrao(num2= num2)}")
    println("Retorno da soma: ${somarDoisNumerosValorPadrao2(num1=num1,num2= num2)}")
    println("Retorno da soma: ${somarDoisNumerosValorPadrao2(num2= num2,num1=num1   )}")
}