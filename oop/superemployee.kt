import java.util.Scanner

open class Employee(val name: String, val salary: Double) {
    open fun displayInfo() {
        println("Employee: $name, Salary: $$salary")
    }
}

class Manager(name: String, salary: Double, val bonus: Double) : Employee(name, salary) {
    override fun displayInfo() {
        super.displayInfo()
        println("Bonus: $$bonus")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter employee name: ")
    val name = scanner.nextLine()

    print("Enter salary: ")
    val salary = scanner.nextDouble()

    print("Enter bonus: ")
    val bonus = scanner.nextDouble()

    val manager = Manager(name, salary, bonus)
    manager.displayInfo()
}
