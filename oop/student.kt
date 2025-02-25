import java.util.Scanner

class Student(val name: String, val mark: Int) {
    fun display() {
        println("Student Name: $name, Mark: $mark")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter student name: ")
    val name = scanner.nextLine()

    print("Enter student mark: ")
    val mark = scanner.nextInt()

    val student = Student(name, mark)
    student.display()
}
