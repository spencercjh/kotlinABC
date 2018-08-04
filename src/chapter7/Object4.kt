package chapter7

class MyClass {
    private fun foo() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
//        val x2 = publicFoo().x
    }
}