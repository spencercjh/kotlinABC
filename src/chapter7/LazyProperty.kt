package chapter7

val lazyValue: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
    println("computed!")
    return@lazy "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)
}