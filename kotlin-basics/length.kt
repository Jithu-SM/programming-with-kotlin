fun main() {
    print("Enter your name: ")
    val inputName: String? = readLine() 

    val nameLength = inputName?.length ?: "Unknown" 

    println("The length of the entered name is: $nameLength")
}
