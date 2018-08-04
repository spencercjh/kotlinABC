package chapter7

interface Base {
    fun print() {}
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b {
    fun getName(): String = "Bill"
}

fun main(args: Array<String>) {
    val b = BaseImpl(20)
    Derived(b).print()
}