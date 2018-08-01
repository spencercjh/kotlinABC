package chapter3

/*kotlin类不支持静态方法和成员，支持全局函数和变量*/
class Singleton private constructor() {
    public var value: Singleton? = null

    private object mHolder {
        val INSTANCE = Singleton();
    }

    companion object Factory {
        fun getInstance(): Singleton {
            return mHolder.INSTANCE;
        }
    }
}