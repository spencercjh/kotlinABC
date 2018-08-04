package chapter7

fun main(args: Array<String>) {
    val adHoc = object {
        var x: Int = 1
        var y: Int = 2
    }
    println(message = adHoc.x + adHoc.y)
}