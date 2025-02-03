fun main() {
    print("Enter a number: ")
    val n = readLine()?.toIntOrNull() ?: 5 
    for (i in 2..n step 2) {
        print("$i ")
    }
}
