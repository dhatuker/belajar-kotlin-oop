class LandTransport(weight: Float, capacity: String, speed: Float, var transportMode : String, var vehicleType : String) : Transport(weight,capacity,speed) {

    override fun default() : String{
        return "$weight $capacity $speed $vehicleType $transportMode"
    }

    override fun ship() : String {
        return "In land transport, shipment is done by $vehicleType"
    }
    override fun toString() : String{
        return "This Land Transportation's mode is $transportMode, type $vehicleType, $weight kg with $capacity capacity, and has $speed kmph"
    }
}