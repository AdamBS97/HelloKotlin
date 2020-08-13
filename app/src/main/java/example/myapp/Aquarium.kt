package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    var volume: Int
    get() = width * height * length / 1000 //1000 cm^3 = 1l
    set(value) {
        height = (value * 1000) / (width * length)
    }

    init{
        println("aquarium initialising")
    }

    constructor(numberOfFish: Int) : this() {
        // 2000 cm^3 per fish + extra room so water does not spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " + "Length: $length cm " + "Height: $height cm")
        println("Volume: $volume l")
    }
}