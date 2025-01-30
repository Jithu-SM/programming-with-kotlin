fun main() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    print("Enter third number: ")
    val c = readLine()!!.toInt()

    val largest = if (a > b && a > c) a else if (b > c) b else c
    println("Largest number is $largest")
}
