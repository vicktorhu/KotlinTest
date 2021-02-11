import kotlin.math.sqrt

fun main() {
    repeat(1000){
        if (isPrime(it)) println(it)
    }
}

fun isPrime(input: Int): Boolean {
    var isPrime = true
    for (i in 2..sqrt(input.toDouble()).toInt()) {
        if (input % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}
