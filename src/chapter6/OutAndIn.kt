package chapter6


interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}