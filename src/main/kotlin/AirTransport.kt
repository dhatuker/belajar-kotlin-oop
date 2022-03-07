class AirTransport(weight: Float, capacity: String, speed: Float, var aircraftType : String, var airlineName : String) : Transport(weight,capacity,speed) {
    override fun default() : String{
        return "$weight $capacity $speed $aircraftType $airlineName"
    }
    override fun ship() : String {
        return "In air transport, shipment is done by $aircraftType"
    }
    override fun toString() : String{
        return "This Air Transportation's line is $airlineName, type $aircraftType, $weight kg with $capacity capacity, and has $speed kmph"
    }
}