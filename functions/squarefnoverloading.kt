fun square(x: Int): Int {
    return x * x
}

fun square(x: Double): Double {
    return x * x
}

fun main() {
    print("Enter an integer: ")
    val intNum = readLine()?.toIntOrNull() ?: 0
    println("Square of $intNum: ${square(intNum)}")

    print("Enter a decimal number: ")
    val doubleNum = readLine()?.toDoubleOrNull() ?: 0.0
    println("Square of $doubleNum: ${square(doubleNum)}")
}
