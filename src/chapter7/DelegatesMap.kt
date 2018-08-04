package chapter7

class User2(var map: Map<String, Any>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    var map = mapOf(
            "name" to "唐枫",
            "age" to 21
    )
    val user = User2(map)
    println(message = user.name)
    println(message = user.age)

}