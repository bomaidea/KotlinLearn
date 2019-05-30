package begin

fun product(a: String, b: String): Unit {
	val x = a.toIntOrNull()
	val y = b.toIntOrNull()
	

	if (x == null) {
		println("Wrong number format in a: '$a'")
		return
	}


	if (y == null) {
		println("Wrong number format in b: '$b'")
		return
	}

	println(x * y)
}

fun main(args: Array<String>) {
	product("2","2")
	product("ciao","1")
	product("1","ciao")
}
