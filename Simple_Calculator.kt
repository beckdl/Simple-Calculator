// Import utilities used
import java.util.Scanner

// Main function
fun main() {
    // Create a Scanner object for user input
    val scanner = Scanner(System.`in`)

    println("Welcome to the Kotlin Calculator!")
    println("===============================")

    var continueCalculation = true

    while (continueCalculation) {
        // Displaying the menu
        displayMenu()

        // Getting user choice
        print("Enter your choice (1-4): ")
        val choice = scanner.nextInt()

        // Taking inputs for calculations
        print("Enter first number: ")
        val num1 = scanner.nextDouble()
        print("Enter second number: ")
        val num2 = scanner.nextDouble()

        // Performing the calculation based on user choice
        when (choice) {
            1 -> add(num1, num2)
            2 -> subtract(num1, num2)
            3 -> multiply(num1, num2)
            4 -> divide(num1, num2)
            else -> println("Invalid choice. Please select a valid operation.")
        }

        // Asking if the user wants to continue
        println("\nDo you want to perform another calculation? (yes/no)")
        val continueResponse = scanner.next()
        if (continueResponse.equals("no", ignoreCase = true)) {
            continueCalculation = false
            println("Thank you for using the Kotlin Calculator!")
        }
    }
}

// Function to display the menu
fun displayMenu() {
    println("Menu:")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")
}

// Function to perform addition
fun add(a: Double, b: Double) {
    val result = a + b
    println("The result of adding $a and $b is $result")
}

// Function to perform subtraction
fun subtract(a: Double, b: Double) {
    val result = a - b
    println("The result of subtracting $b from $a is $result")
}

// Function to perform multiplication
fun multiply(a: Double, b: Double) {
    val result = a * b
    println("The result of multiplying $a and $b is $result")
}

// Function to perform division
fun divide(a: Double, b: Double) {
    if (b != 0.0) {
        val result = a / b
        println("The result of dividing $a by $b is $result")
    } else {
        println("Error: Division by zero is not allowed.")
    }
}