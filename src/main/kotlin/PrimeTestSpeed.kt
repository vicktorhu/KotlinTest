import kotlin.math.sqrt
import kotlin.system.measureTimeMillis

fun main() {
    val limit = 200000
    // new codes with higher order functions
    println(getExecTime(limit) { input: Int -> isPrimeSqrt(input) })
    println(getExecTime(limit) { input: Int -> isPrimeDiv(input) })
    println(getExecTime(limit) { input: Int -> isPrimeClassic(input) })

// Old codes
//    val result1: ArrayList<Int> = ArrayList()
//    println("Result 1: " + measureTimeMillis {
//        repeat(limit) {
//            if (isPrimeSqrt(it)) result1.add(it)
//        }
//    } + "ms")
//
//    val result2: ArrayList<Int> = ArrayList()
//    println("Result 2: " + measureTimeMillis {
//        repeat(limit) {
//            if (isPrimeDiv(it)) result2.add(it)
//        }
//    } + "ms")
//
//    val result3: ArrayList<Int> = ArrayList()
//    println("Result 3: " + measureTimeMillis {
//        repeat(limit) {
//            if (isPrimeClassic(it)) result3.add(it)
//        }
//    } + "ms")
}

fun getExecTime(limit: Int, primeFx: (Int) -> Boolean): Long {
    val result: ArrayList<Int> = ArrayList()
    return measureTimeMillis {
        repeat(limit) {
            if (primeFx(it)) result.add(it)
        }
    }
}

fun isPrimeSqrt(input: Int): Boolean {
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

fun isPrimeClassic(input: Int): Boolean {
    var isPrime = true
    for (i in 2 until input) {
        if (input % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}