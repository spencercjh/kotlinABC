package chapter3

class Constructor(firstName: String) {
    var firstName = firstName

    init {
        println(firstName)
    }

    /*第二构造器必须显式地去调用第一构造器*/
    constructor(id: Int) : this("123")

    /*这个第二构造器显式地调用了上面那个第二构造器，间接调用了第一构造器*/
    constructor() : this(20)

    constructor(firstName: String, id: Int) : this(firstName)
}
