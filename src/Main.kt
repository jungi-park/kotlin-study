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
    var l: String? ="ABC"

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
}
