fun main() {
    print("Enter a number (1-7) for the day of the week: ")
    val day = readLine()?.toIntOrNull() ?: 1  
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("Day: $dayName")
}
