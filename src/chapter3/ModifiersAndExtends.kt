package chapter3

/*kotlin中默认类是不能继承的，父类中的方法也是默认不能重写的*/
open class Modifiers {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    public val d = 4
    val e = 5

    private inner class class1

    protected inner class class2

    public inner class class3

    internal inner class class4

    open fun test() {

    }
}

class Extends : Modifiers() {
    var f = e
    protected override val b = 6

    override fun test() {

    }
}