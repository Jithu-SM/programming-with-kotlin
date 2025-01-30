fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    if (isPrime(number)) {
        println("$number is a prime number")
    } else {
        println("$number is not a prime number")
    }
}
