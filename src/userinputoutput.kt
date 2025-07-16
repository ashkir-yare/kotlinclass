import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter your fullname :")
    var fullname =readln()
    println("fullname : $fullname")

    println("how old are you(in years? :")
    var age = read.nextInt()
    println("age : $age")

    println("enter weight (in kg) :")
    var weight =read.nextDouble()
    println("weight : $weight")

    println()
    println("summery of your information")
    println("fullnmae : $fullname")
    println("age : $age years old")
    println("weight : $weight kg")
    println("----thank you !!!---")



}