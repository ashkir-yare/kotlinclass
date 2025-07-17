fun main() {

    //standard-library functions/built-in functions
    var result = Math.sqrt(81.0)
    println("the result is is $result")

    var number = Math.round(67.8)
    println(number)

    school()
    divide()
    student("joe", age = 56, "male")
    student("jane", age = 20, "male")
    student("ann", age = 37, "female")

}

//user defined functions
fun school(){
    println("emobilis")
}

fun divide (){
    var num1 =56
    var num2 =7
    println(num1/num2)
}

//parameter and argument
fun student(name:String, age : Int, gender:String){
    println("$name $age $gender")
}