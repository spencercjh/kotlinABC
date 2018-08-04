package chapter8

val max1 = { a: String, b: String -> run { a.length < b.length } }

val max2: (String, String) -> Boolean = { a, b -> a.length < b.length }

val max3 = fun(a: String, b: String): Boolean {
    return a.length < b.length
}

val sum1 = { a: Int, b: Int -> a + b }

val sum2: (Int, Int) -> Int = { a, b -> a + b }

val sum3 = fun(x: Int, y: Int): Int {
    return x + y
}