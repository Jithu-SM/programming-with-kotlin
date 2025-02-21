fun countVowels(str: String): Int {
    val vowels = "AEIOUaeiou"
    return str.count { it in vowels }
}

fun main() {
    print("Enter a string: ")
    val input = readLine() ?: ""

    val vowelCount = countVowels(input)
    println("Number of vowels: $vowelCount")
}
