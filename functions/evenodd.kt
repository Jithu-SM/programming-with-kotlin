fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull() ?: 0

    if (isEven(num)) {
        println("$num is Even")
    } else {
        println("$num is Odd")
    }
}
