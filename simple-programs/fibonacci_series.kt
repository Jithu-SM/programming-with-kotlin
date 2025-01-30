fun main() {
    print("Enter the number of terms: ")
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    println("Fibonacci Series:")
    for (i in 1..n) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}
