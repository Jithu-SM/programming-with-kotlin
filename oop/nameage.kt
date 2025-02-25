import java.util.Scanner

class Person {
    var name: String = ""
    var age: Int = 0

    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    
    val person = Person()

    print("Enter your name: ")
    person.name = scanner.nextLine()

    print("Enter your age: ")
    person.age = scanner.nextInt()

    person.displayInfo()
}
