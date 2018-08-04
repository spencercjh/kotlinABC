package chapter7

import kotlin.reflect.KProperty

public fun <T> delegate(initializer: () -> T): Delegate3<T> = Delegate3(initializer)

class MyClass7() {
    var name: String by delegate {
        println("MyClass1.name初始化函数调用")
        return@delegate "<MyClass1>"
    }
}

class MyClass8() {
    var name: String by delegate {
        println("MyClass2.name初始化函数调用")
        return@delegate "MyClass2"
    }
}

class Delegate3<T>(initializer: () -> T) {
    var name: String = ""
    var className = initializer()
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("$className.get已经被调用")
        return name
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$className.set已经被调用")
        name = value
    }
}

fun main(args: Array<String>) {
    var c1 = MyClass7()
    var c2 = MyClass8()
    c1.name = "蔡佳昊"
    c2.name = "唐枫"
    println(c1.name)
    println(c2.name)
}