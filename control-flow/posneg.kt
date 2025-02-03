fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 0  

    if (number > 0) {
        println("$number is positive")
    } else if (number < 0) {
        println("$number is negative")
    } else {
        println("The number is zero")
    }
}
