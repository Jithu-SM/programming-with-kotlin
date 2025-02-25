import java.util.Scanner

interface Animal {
    fun makeSound()
}

class Dog(val name: String) : Animal {
    override fun makeSound() {
        println("$name says Woof!")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter dog's name: ")
    val dogName = scanner.nextLine()

    val dog = Dog(dogName)
    dog.makeSound()
}
