var c1 = 22.5
var c2 = c1 * 9
var c3 = c2 / 5
var c4 = c3 + 32
c4.toInt

val e2 = 2.7255d
println( f"${e2}%.2f")

val flag = false
val result: Boolean = !flag

println("*"*5)
val orig = 128
val c: Char = orig.toChar
val s: String = c.toString
val d: Double = s(0).toDouble
val i: Int = d.toInt

println("*"*5)

val r = raw".*,(\d{3})-(\d{3})-(\d{4}),.*".r
val s = "Frank,123 Main,925-555-1943,95122"

val r(n1, n2, n3) = s
val phoneNumber = (n1.toInt, n2.toInt, n3.toInt)
