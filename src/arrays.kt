fun main() {

    var language = arrayOf("kotlin","javascript","java")

    println(language[1])

    //reassignment element
    language[1] = "python"
    println(language[1])

    //looping through an array
    for (lang in language){
        println(lang)
    }

    //size of an array
    println(language.size)

}