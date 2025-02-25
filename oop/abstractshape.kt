import java.util.Scanner

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter width: ")
    val width = scanner.nextDouble()

    print("Enter height: ")
    val height = scanner.nextDouble()

    val rectangle = Rectangle(width, height)
    println("Area of Rectangle: ${rectangle.area()}")
}
