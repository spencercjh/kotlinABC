package chapter7

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Mike") { property, oldValue, newValue ->
        run {
            println("旧值$oldValue，新值$newValue,类型$property")
        }
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "蔡佳昊"
    user.name = "唐枫"
}