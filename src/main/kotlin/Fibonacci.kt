fun main() {
    var a = 0
    var b = 1
    repeat(30){
        var c = a + b
        println(c)
        a = b
        b = c
    }
}