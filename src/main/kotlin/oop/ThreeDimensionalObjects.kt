interface ThreeDimensionalObjects {
    fun getVolume(): Int
    fun getArea(): Int
    fun printAreaAndVolume() {
        println("Area: ${getArea()}")
        println("Volume: ${getVolume()}")
    }
}