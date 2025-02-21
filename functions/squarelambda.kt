val square: (Int) -> Int = { num -> num * num }

fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull() ?: 0

    println("Square of $num is: ${square(num)}")
}
