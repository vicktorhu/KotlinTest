import kotlin.math.pow

data class Cube(val side: Int) :ThreeDimensionalObjects {
    override fun getVolume():Int{
        return side.toDouble().pow(3).toInt()
    }

    override fun getArea(): Int {
        return 6 * side * side
    }

    override fun toString(): String {
        return "Cube(side=$side | area=${getArea()} | volume=${getVolume()})"
    }
}
