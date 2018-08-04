package chapter4

/*kotlin可以拓展Java Api或Kotlin Api*/
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun ArrayList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

class MyClass {
    var a = 1
}

/*kotlin可以拓展自己写的类*/
fun MyClass.test() {

}

fun Thread.foo(t: String) {
    println(t)
}

/*属性也可以拓展*/
private var MyClass.b: Int
    get() = b
    set(value) {
        b = value
    }

