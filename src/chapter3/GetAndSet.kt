package chapter3

class GetAndSet {
    val onlyRead: String
        get() = "Bill"

    var readAndWrite: Int = 20
        get() = field
        set(x) {
            field = x;
        }

    fun getValue0() = onlyRead

    fun getValue1(): String = onlyRead;

    fun getValue2(): String {
        return onlyRead
    }

}