package begin

fun bigger(a: Int, b: Int): Int {
	if (a > b) {
		return a
	} else {
		return b
	}
}

fun smaller(a: Int, b: Int) = if (a < b) a else b

fun main(args: Array<String>) {
	val a: Int = 2
	val b: Int = 6

	if (bigger(a,b) != smaller(a,b)) {
		println("OK")
	}
}
