package chapter7

open class MyClass3() {
    open fun test() {}
}

fun process(obj: MyClass3) {
    obj.test()
}

fun main(args: Array<String>) {
    var n = 20;
    process(object : MyClass3() {
        override fun test() {
            if (n == 20) {
                println("success")
                n++
                println("$n")
            } else {
                println("failed")
            }
        }
    })
}