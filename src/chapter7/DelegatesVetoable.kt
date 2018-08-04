package chapter7

import kotlin.properties.Delegates

class User1 {
    var name: String by Delegates.vetoable("Mike") { property, oldValue, newValue ->
        run {
            println("旧值$oldValue，新值$newValue,类型$property")
            return@run "唐枫" == newValue
        }
    }
}

fun main(args: Array<String>) {
    val user1 = User1()
    user1.name = "蔡佳昊"
    println(message = user1.name)
    user1.name = "唐枫"
    println(message = user1.name)
}