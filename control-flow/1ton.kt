fun main() {
    print("Enter a number: ")
    val n = readLine()?.toIntOrNull() ?: 5 
    for (i in 1..n) {
        println(i)
    }
}
