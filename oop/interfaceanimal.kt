interface Animal {
    fun makeSound()
}

class Cat : Animal {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun main() {
    val myCat = Cat()
    myCat.makeSound()
}
