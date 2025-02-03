fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull() ?: 2  

    var i = 1
    while (i <= 10) {
        println("$num x $i = ${num * i}")
        i++
    }
}
