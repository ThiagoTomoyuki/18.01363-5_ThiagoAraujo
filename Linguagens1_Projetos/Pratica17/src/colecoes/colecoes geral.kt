package colecoes

fun main(){
    //Array
    val meuVetor = arrayOf(1,2,3)
    println(meuVetor)
    val item: Int
    for (item in meuVetor){
        println(item)
    }
    println("Tamanho do array:${meuVetor.size}")
    println("Primeiro elemento:${meuVetor[0]}")
    println("Maior valor::${meuVetor.max()}")
    //Lista
    //Onjeto lista não é mutavel
    val minhaLista = listOf("Oi","Ola","Hi")
    println(minhaLista)

    val minhaListaQmuda = mutableListOf("Oi","Ola","Hi")
    println(minhaListaQmuda)
    minhaListaQmuda.add("Hello")
    println(minhaListaQmuda)

}