fun main() {

    var text = "hello world"
    var firstname ="john"
    var lastname = "david"

    println(text)
    println(text[1])
    println(firstname+lastname)
    println(firstname + " " +lastname) //space between 2 names

    // Modifying a string
    println(text.uppercase())
    println(firstname.lowercase())

    //string interpolation
    println("my fullname is $firstname $lastname ")

}