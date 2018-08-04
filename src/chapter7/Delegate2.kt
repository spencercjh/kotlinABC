package chapter7

import kotlin.reflect.KProperty

class Delegate {
    var name: String = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        val className = thisRef.toString().substringBefore('@')
        println("$className.get已经被调用")
        return name;
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        val className = thisRef.toString().substringBefore('@')
        println("$className.set已经被调用")
        name = value
    }

}

class MyClass5() {
    var name: String by Delegate()
}

class MyClass6() {
    var name: String by Delegate()
}

fun main(args: Array<String>) {
    val c1 = MyClass5()
    val c2 = MyClass6()
    c1.name = "cjh"
    c2.name = "tf"
    println(message = c1.name)
    println(message = c2.name)
}