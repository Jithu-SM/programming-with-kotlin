fun main() {
    while (true) {
        print("Enter a number (negative to stop): ")
        val num = readLine()?.toIntOrNull() ?: 0

        if (num < 0) {
            println("Loop stopped")
            break
        }

        println("You entered: $num")
    }
}
