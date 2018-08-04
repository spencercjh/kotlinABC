package chapter7

class User3(var map: MutableMap<String, Any>) {
    var name: String by map
    var age: Int by map
}

fun main(args: Array<String>) {
    var map = mutableMapOf(
            "name" to "唐枫",
            "age" to 21
    )
    val user = User3(map)
    println(message = user.name)
    println(message = user.age)
    user.name = "蔡佳昊"
    user.age = 20
    println(message = user.name)
    println(message = user.age)
}