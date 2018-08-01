package chapter3

interface Interface {
    fun fun1()

    fun fun2(): Int

    fun fun3(): String {
        return "sadasd"
    }
}

class implement : Interface {
    override fun fun2(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fun1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}