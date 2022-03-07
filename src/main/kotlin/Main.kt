fun main() {
    println("==============================================================")
    println("")
    val air = AirTransport(12.3f ,"200 kg", 300.2f, "SuperCarrier", "DhAir")

    println(air.toString())
    air.load()
    println(air.ship())
    air.unload()

    println("")
    println("==============================================================")
    println("")
    val land = LandTransport(12.3f ,"10000 kg", 60.6f, "Same Day Arrival", "Truck")

    println(land.toString())
    land.load()
    println(land.ship())
    land.unload()

    println("")
    println("==============================================================")
    println("")

    //agak questionable but okay lah
    val T:Transportation<Transport> = Transportation(air)
    println(T.value)
    println(T.value.default())
    val U:Transportation<Transport> = Transportation(land)
    println(U.value)
    println(U.value.default())
}
