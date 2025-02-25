open class Vehicle {
    open fun start() {
        println("Vehicle is starting")
    }
}

class Bike : Vehicle() {
    override fun start() {
        println("Bike is starting with a kick")
    }
}

final class Truck {
    fun load() {
        println("Truck is loading goods")
    }
}

// class MiniTruck : Truck() {}

fun main() {
    val bike = Bike()
    bike.start()

    val truck = Truck()
    truck.load()
}
