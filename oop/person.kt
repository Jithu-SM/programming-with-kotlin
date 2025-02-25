class Person(val name: String, val age: Int) {
    init {
        println("Person created: $name, Age: $age")
    }
}

class Student {
    var name: String
    var grade: Int

    constructor(name: String, grade: Int) {
        this.name = name
        this.grade = grade
        println("Student created: $name, Grade: $grade")
    }
}

fun main() {
    val person1 = Person("Alice", 25)
    val student1 = Student("Bob", 10)
}
