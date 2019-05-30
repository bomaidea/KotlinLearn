package begin

fun sum(a: Int, b: Int): Int {
	return a + b
}

fun printSum(a: Int, b: Int): Unit {
	println("sum of $a and $b is ${a + b}")
}

fun sub(a: Int, b: Int) = a - b

fun main(args: Array<String>) {
	println("sum: " + sum(1, 1))
	printSum(1, 1)
	println("sub: " + sub(1, 1))
}
