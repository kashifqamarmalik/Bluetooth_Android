package com.example.bluetoothbeacon

class Device(
    var name: String? = "",
    var address: String?,
    var strength: Int? = 0,
    var isConnectable: Boolean?){

    override fun toString(): String {
        return "$name / $address / $strength dBm"
    }
}
