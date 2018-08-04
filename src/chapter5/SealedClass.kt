package chapter5

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> {
        expr.number
    }
    is Sum -> {
        eval(expr.e1) + eval(expr.e2)
    }
    NotANumber -> {
        Double.NaN
    }
}

fun main(args: Array<String>) {
    val const1 = Const(5.0)
    val const2 = Const(6.0)
    val sum = Sum(const1, const2)
    println(eval(const1))
    println(eval(const2))
    println(eval(sum))
}