package chapter7

open class MyClass2(name: String) {
    open var name = name
    open fun verify() {
        println("verify")
    }
}

interface MyInterface {
    fun closeData() {
        println("closeData")
    }
}

fun process(obj: MyClass2) {
    obj.verify()
    if (obj is MyInterface) {
        obj.closeData()
    }
}

fun main(args: Array<String>) {
    process(object : MyClass2("cjh"), MyInterface{
        override fun verify() {
            println("object verify")
        }
    })

}