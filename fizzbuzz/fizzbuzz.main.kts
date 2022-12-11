fun fizzBuzz(n: Int): String {
    return when (Pair(n % 3 == 0, n % 5 == 0)) {
        Pair(true, true) -> "FizzBuzz"
        Pair(true, false) -> "Fizz"
        Pair(false, true) -> "Buzz"
        else -> n.toString()
    }
}

(1..100).forEach {
    println(fizzBuzz(it))
}
