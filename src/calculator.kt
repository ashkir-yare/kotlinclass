import java.util.Scanner
import kotlin.time.Clock

fun main() {
    var read = Scanner(System.`in`)


    println("Enter first number")
    var num1 = read.nextInt()

    println("Enter operator ('+', '-', '/', '*', ")
    var operator = readln()

    println("Enter second number")
    var num2 = read.nextInt()

    var result = when(operator){
        "-" -> num1 - num2
        "+" -> num1 + num2
        "*" -> num1 * num2
        "/" -> num1 / num2

        else -> "Invalid Operator"
    }
    println("The result is $result")




}