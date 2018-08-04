package chapter8

interface Product {
    var area: String
    fun sell(name: String)
}

class MobilePhone : Product {
    override var area: String = ""

    override fun sell(name: String) {
        println(message = "销售$area")
    }

    override fun toString(): String {
        return this.area
    }

}

fun mobilePhoneArea(name: String): String {
    return "$name 美国"
}

fun processProduct(product: Product, area: (name: String) -> String): Product {
    product.area = area("iPhone")
    return product
}

fun main(args: Array<String>) {
    var product = MobilePhone()
    processProduct(product = product, area = ::mobilePhoneArea)
    println(product)
}