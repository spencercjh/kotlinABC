package chapter9

fun double1(x: Int): Int {
    return 2 * x
}

val result = double1(2)

infix fun String.div(str: String): String {
    return this.replace(str, "")
}

/*fun main(args: Array<String>) {
    var str = "Hello World"
    println(str div "l" div "o")
}*/

fun double2(x: Int): Int = 2 * x

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

fun main(args: Array<String>) {
    var list = asList(1, 2, 3, 4, '1', "2asddsad")
    println(list)
}

fun foo1() {
    fun foo2() {
        fun foo3() {

        }
    }
}