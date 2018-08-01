package chapter3

open class Extends2 {
    open fun fun1() {}
}

abstract class Abstract : Extends2() {
    abstract override fun fun1()
}