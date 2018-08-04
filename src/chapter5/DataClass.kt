package chapter5

open class MyClass

data class User(val name: String = "蔡佳昊", var age: Int = 20) : MyClass() {
    fun process() {
        println("function in data class")
    }
}

fun main(args: Array<String>) {
    val user1 = User("蔡佳昊", 20)
    println(message = user1)
    val user2 = User("唐枫", 21)
    println(message = user2)
    println(user1 == user2)
    User().process()
    val user3 = user1.copy(name = "老蔡佳昊", age = 30)
    println(message = user3)
    val (name, age) = user3
    println("$name $age")
}