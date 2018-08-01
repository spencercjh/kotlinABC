/*
kotlin的包可以和实际物理存储没有关系
package chapter2.spencercjh
*/

package chapter2

/*
kotlin和java一样需要import其他包中的文件
import chapter3.*
*/

/**
 * @date 2018年8月1日
 * @author spencercjh
 */


/*kotlin的函数可以不写在类中*/
fun main(args: Array<String>) {

}

/*kotlin不用写分号，常量用val，变量用var，数据类型可以省略也可以写在变（常）量名之后*/
fun test1() {
    var n: Int = 30
    var ok: Int
    val m: Int = 20
    ok = 123
    var k = 100

}

/*kotlin支持块注释嵌套*/
/*
    /*

     */
 */

/*kotlin的函数返回值类型写在参数表之后*/
fun add(x: Int, y: Int): Int {
    return x + y
}

/*kotlin的函数没有返回值的时候返回值类型可以写Unit也可以省略*/
fun process(m: Int): Unit {
    println(m * m)
}


/*kotlin的数据类型都是大小字母开头的*/
fun basicType() {
    var m: Int = 20
    var price: Double = 20.4
    var flag: Boolean = true;
    val v1: Int = 100
    val v2: Double = 20.4
    var short: Short
    var float: Float
    var long: Long
    var byte: Byte
}

/*kotlin不支持数据类型之间的相互隐式转换*/
fun typeConverse1() {
    var m = 20
    val n: Byte = 10
//    m = n
    val x: Long = 20
    var value: Short = 20
//    m = value
//    value=m
    var double: Double = 10.0
//    m=double
//    double=m
}

/*kotlin支持不同数据类型之间的显式转换*/
fun typeConverse2() {
    var m = 20
    val n: Byte = 10
    val x: Long = 20
    val value: Short = 20
    m = n.toInt()
    m = x.toInt()
    m = value.toInt()
}

/*kotlin支持在数字类型中加入分隔符，分隔符不会影响数值*/
fun numberSeparator() {
    val bigNumber1 = 1_000_000_000
    val bigNumber2 = 100_0000_0000
}

/*kotlin不支持数据类型的隐式转换，所以char不能和int放在一起比较*/
fun kotlinChar(c: Char) {
    /*if (c == 97) {

    }*/
    if (c == 'c') {

    }
}

/*kotlin中需要使用Char.toInt()才能得到ASCII值*/
fun calculateASCII(c: Char): Int {
    when (c) {
        in '0'..'9' -> {
            return c.toInt() - '0'.toInt()
        }
        in 'a'..'z' -> {
            return c.toInt() - 'a'.toInt()
        }
        in 'A'..'Z' -> {
            return c.toInt() - 'A'.toInt()
        }
        else -> {
            return 0
        }
    }
}

/*kotlin的数组花样繁多*/
fun kotlinArray() {
    fun fun1(i: Int): Int {
        return i * i;
    }

    val array1 = arrayOf(1, 2, 3, 4)
    val array2 = arrayOf(1, 2, 3, 'a')
    val array3 = arrayOfNulls<Int>(10)
    val array4 = Array(10, { i: Int -> (i * i).toString() })
    val array5 = Array(10, { i: Int -> fun1(i) })
    val array6 = intArrayOf(20, 10, 40, 123, 123, 13, 213, 3)
    val array7 = doubleArrayOf(0.4, 0.1)
    var array8 = arrayListOf(123, 123, 123, 213, 1, 313)
}

/*基本的字符串使用*/
fun kotlinString() {
    val string1: String = "hello world"
    val string2 = "hello world"
    val string3 = "as\tdsadsad\n" +
            "s\tdasdad\n" +
            "asdsad\tadsd";
}

/*这有点像jquery*/
fun stringTemplate() {
    val i = 10
    val string1 = "i = $i "
    val string2 = "$string1 .length=${string1.length}"
}

/*kotlin可以的if-else语句可以作为表达式使用*/
fun kotlinIf() {
    var a = 20
    var b = 30
    val max = if (a > b) a else b
    val min = if (a > b) {
        a
    } else {
        b
    }
}

/*kotlin使用when替代了switch*/
fun kotlinWhen(x: Int) {
    fun getValue(x: Int): Int {
        return x
    }
    when (x) {
        1, 2, 3, 4 -> {
            //do something
        }
        in 5..9 -> {
            //do something
        }
        !in 10..15 -> {
            //do something
        }
        getValue(x) -> {
            //do something
        }
        else -> {
            //do something
        }
    }
}

/*kotlin遍历数组 循环和java一样 do-while while for*/
fun traverseArray() {
    val array = arrayOf(1, 2, 21, 1, "asda", 'a')
    for (item: Any in array) {
        println(item)
    }
    for (i in array.indices) {
        println(array[i])
    }
    for ((index, value) in array.withIndex()) {
        println(index.toString() + " " + value.toString())
    }
}