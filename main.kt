// Function to display "Hello, world!"
fun displayHello() {
    println("Hello, world!")
}

// Function to print a full name
fun printfullname(firstName: String, lastName: String) {
    println("Full Name: $firstName $lastName")
}

// Function to add one to a number and return the result
fun addOne(number: Int): Int {
    return number + 1
}

fun main() {
    // Call displayHello function
    displayHello()

    // Call printfullname function
    val firstName = "John"
    val lastName = "Doe"
    printfullname(firstName, lastName)

    // Call addOne function and use the result
    val number = 5
    val result = addOne(number)
    println("The result after adding one is: $result")
}
