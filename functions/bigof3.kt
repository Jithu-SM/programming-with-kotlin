fun findMax(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Enter second number: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    print("Enter third number: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    val max = findMax(num1, num2, num3)
    println("The largest number is: $max")
}
