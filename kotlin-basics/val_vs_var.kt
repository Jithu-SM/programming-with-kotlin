fun main() {
    val name = "John"  // Read-only variable
    var age = 30       // Mutable variable

    println("Name: $name")
    println("Age: $age")

    // Uncommenting the next line will result in an error because 'name' is a val (immutable)
    // name = "Alice"  

    age = 31  // This works because 'age' is a var (mutable)
    println("Updated Age: $age")
}
