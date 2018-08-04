package chapter7

class MyClass4() {
    companion object Factory {
        @JvmStatic
        fun create(): MyClass4 = MyClass4()
    }
}

fun main(args: Array<String>) {
    val myClass1 = MyClass4.create()
    println(myClass1)
    val myClass2=MyClass4.create()
    println(myClass2)
}