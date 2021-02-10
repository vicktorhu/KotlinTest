import kotlin.math.sqrt
import kotlin.system.measureTimeMillis

fun main() {
    val limit = 200000

    var result1: ArrayList<Int> = ArrayList()
    println(measureTimeMillis {
        for (i in 2 until limit) {
            if (isPrime(i)) {
                result1.add(i)
            }
        }
    })
//    println(result1.toString())

    var result2: ArrayList<Int> = ArrayList()
    println(measureTimeMillis {
        for (i in 2 until limit) {
            if (isPrimeDiv(i)) {
                result2.add(i)
            }
        }
    })
//    println(result2.toString())

    var result3: ArrayList<Int> = ArrayList()
    println(measureTimeMillis {
        for (i in 2 until limit) {
            if (isPrimeNoSqrt(i)) {
                result3.add(i)
            }
        }
    })
//    println(result3.toString())
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

fun isPrimeDiv(input: Int): Boolean {
    var isPrime = true
    for (i in 2 until (input / 2) + 1) {
        if (input % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

fun isPrimeNoSqrt(input: Int): Boolean {
    var isPrime = true
    for (i in 2 until input) {
        if (input % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}