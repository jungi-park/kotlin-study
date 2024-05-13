//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    var 는 읽기/쓰기 가능
    var i: Int = 10
//    val 은 읽기만 가능
    val j: Int = 10

    i = 20
//    j = 20

    println(i)
    println(j)

//    타입 뒤에 ? 를 붙여야 null 사용가능
    var a: Int = 10
    var b: Int? = 10

//    a =null
    b = null

    println(a)
    println(b)

    var k: String = "ABC"
    var l: String? = "ABC"

//    k = null
    l = null

    println(k)
    println(l)

//    타입추론 -> 변수에 들어오는 값을 보고 타입을 알아서 지정해줌
    val z = "ABC"
    val x = 1
    val c = 1L
    val v = 1.0
    val n = 1.0f

    println("z = " + z::class)
    println("x = " + x::class)
    println("c = " + c::class)
    println("v = " + v::class)
    println("n = " + n::class)

    val priceA: Int = 100
    val priceB: Int = 200

    if (priceA >= priceB) {
        println("priceA = $priceA")
    } else {
        println("priceB = $priceB")
    }

    val price: Int = 100

    if (price in arrayOf(100, 200, 300)) {
        println("contain")
    } else {
        println("not contain")
    }

    when (price) {
        100 -> println("1. price = $price")
        200 -> println("2. price = $price")
        300 -> println("3. price = $price")
        else -> println("4. Not")
    }

//    in 100..199
    when (price) {
        in 100..199 -> println("1. 100 ~ 199")
        in 200..299 -> println("2. 200 ~ 299")
        in 300..399 -> println("3. 300 ~ 399")
        else -> println("4. Not")
    }

    val price1: Int = 100
    val price2: Int = 200

    val price3 = sumPrice(price1, price2)
    println("price3 = $price3")

    val item = Item("book", 10_000)
    println("Item name is ${item.name}, price is ${item.price}")

    val itemTrade = ItemTradeImpl("bookTrade", 10_000)
    println("Item name is ${itemTrade.name}, price is ${itemTrade.price}")
    itemTrade.buy()
    itemTrade.sell()
}

fun sumPrice(price1: Int, price2: Int): Int = price1 + price2

class Item(
    val name: String,
    val price: Int
)

enum class Color {
    RED,
    GREEN,
    BLUE
}

interface ItemTrade {
    fun buy()
    fun sell()
}

class ItemTradeImpl(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}