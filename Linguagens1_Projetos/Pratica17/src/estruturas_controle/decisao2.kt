package estruturas_controle

fun main(){
    println("Informe algo:")
    val valor = readLine()
    when(valor){
        "Murilo" -> println("Achei vc")
        "Thiago" -> {
            println("Alow")
            println("Mais de uma")
        }

        else ->
            println("else")
    }
    //para valores numericos
    when(valor!!.length){
        in 1..10 -> println("ate 10 digitados")
        15 -> println("Siza=15")
        else -> println("Nada deu")
    }
}