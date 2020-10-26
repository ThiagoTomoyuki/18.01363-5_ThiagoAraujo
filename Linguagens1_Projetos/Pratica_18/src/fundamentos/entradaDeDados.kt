package fundamentos

fun main() {
    println("Informe seu nome:")
    var nome = readLine()
    println("Nome informado: $nome")
    println("Tamanho: ${nome!!.length}")
}