class Person (val name : String , val age : Int){
}

fun main() {
    println("Hello Kotlin!")
    ags(arrayListOf("Good", "Hello" , "morning"))
    val name = NoneInput("hajin")
    println(name.args)
    val person = Person("jin", 13)
    println(person.name)
    println(person.age)
}

fun ags (args : ArrayList<String>){
    println(args[0])
    println(args[1])
    println(args[2])
}
