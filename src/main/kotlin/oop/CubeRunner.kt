import oop.Box

fun main() {
    val cube = Cube(9)
    println(cube.toString())
    println("Side: ${cube.side}")
    cube.printAreaAndVolume()

    val box = Box(6, 4, 7)
    println(box.toString())
    box.printAreaAndVolume()
}