package chapter7

open class MyClass1(name: String) {
    open var name = name
    open fun verify() {
        println("verify")
    }
}

fun process(obj: MyClass1) {
    obj.verify()
}

fun main(args: Array<String>) {
    process(object : MyClass1("cjh") {
        override fun verify() {
            println("object verify")
        }
    })
}