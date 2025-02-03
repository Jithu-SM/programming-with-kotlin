fun main() {
    var guess: Int

    do {
        print("Guess the number (1-10): ")
        guess = readLine()?.toIntOrNull() ?: 0
    } while (guess != 7)

    println("Congratulations! You guessed the correct number.")
}
