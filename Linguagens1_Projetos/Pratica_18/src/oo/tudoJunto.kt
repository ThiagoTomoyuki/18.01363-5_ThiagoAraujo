package oo

class Animal(val nome:String,var peso:Double){
    override fun toString(): String {
        return "Animal(nome='$nome',peso=$peso)"
    }

}

fun main() {
    val animal1 = Animal("fido",34.0)
    val animal2 = Animal("Thor",12.0)
    println(animal1)
    println(animal2)
    animal1.peso = 24.0
    println(animal1)
}