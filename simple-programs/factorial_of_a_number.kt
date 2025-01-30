fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    println("Factorial of $num is ${factorial(num)}")
}
