import java.util.Scanner

open class Vehicle(val brand: String, val model: String) {
    open fun displayInfo() {
        println("Brand: $brand, Model: $model")
    }
}

class Car(brand: String, model: String, val year: Int) : Vehicle(brand, model) {
    override fun displayInfo() {
        super.displayInfo()
        println("Year: $year")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter car brand: ")
    val brand = scanner.nextLine()

    print("Enter car model: ")
    val model = scanner.nextLine()

    print("Enter car year: ")
    val year = scanner.nextInt()

    val car = Car(brand, model, year)
    car.displayInfo()
}
