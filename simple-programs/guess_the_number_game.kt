import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 10)
    var guess: Int?

    do {
        print("Guess a number between 1 and 10: ")
        guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Please enter a valid number.")
        } else if (guess < secretNumber) {
            println("Too low! Try again.")
        } else if (guess > secretNumber) {
            println("Too high! Try again.")
        }
    } while (guess != secretNumber)

    println("Congratulations! You guessed it right.")
}
