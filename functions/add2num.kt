fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Enter second number: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    val result = addNumbers(num1, num2)
    println("Sum: $result")
}
