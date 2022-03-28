package hanieum.firstproject.minidust.model.network

import java.time.LocalDateTime

data class coordsToAddresData(
    var status : String,
    var message : String,
    var data : AddressData
)
data class AddressData(
    var first : String,
    var alias : String,
    var second : String,
    var third : String
)

data class cityMiniDust(
    var status: String,
    var message: String,

)

data class WeatherClass(
    var status : String,
    var message : String,
    var data : Data,
)

data class Data(
    var id : Int?,
    var icon: String,
    var temperature : Int,
    var humidity : Int,
    var name : String
)

data class AllSensorInfos(
    var status: String,
    var message: String,
    var data: SensorDatas
)
data class SensorDatas(
    var createAt : LocalDateTime,
    var modifiedAt : LocalDateTime,
    var id : Int,
    var latitude: Double,
    var longitude: Double,
    var temperature: Int,
    var humidity: Int,
    var pm25: Int,
    var pm10: Int,
    var location : String
)