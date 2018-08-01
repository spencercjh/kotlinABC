package chapter3

class InnerClass {
    inner class InnerClass1 {
        inner class InnerClass2 {
            fun f() {

            }
        }
    }

    val demo = InnerClass().InnerClass1().InnerClass2().f()
}

