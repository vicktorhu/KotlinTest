package oop

import ThreeDimensionalObjects

data class Box(val width: Int, val length: Int, val height: Int) : ThreeDimensionalObjects {
    override fun getVolume(): Int {
        return length * height * width
    }

    override fun getArea(): Int {
        return 2 * (width * height) + (width * length) + (length * height)
    }

}
