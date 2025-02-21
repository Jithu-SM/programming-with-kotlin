fun reverseString(str: String): String {
    return str.reversed()
}

fun main() {
    print("Enter a string: ")
    val input = readLine() ?: ""

    val reversed = reverseString(input)
    println("Reversed String: $reversed")
}
