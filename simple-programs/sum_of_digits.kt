fun sumOfDigits(num: Int): Int {
    var n = num
    var sum = 0
    while (n != 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    println("Sum of digits of $number is ${sumOfDigits(number)}")
}
