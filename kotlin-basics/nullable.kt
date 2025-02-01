fun main() {
    var name: String? = "John"  // Nullable type
    println(name?.length)  // Safe call operator: prints length if 'name' is not null

    name = null
    println(name?.length ?: "Name is null")  // Elvis operator: provides default value if 'name' is null

    // Uncommenting the next line will throw an exception because we assert that 'name' is non-null
    // println(name!!.length)  // Non-null assertion
}
