package hanieum.firstproject.minidust.model.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Device (@PrimaryKey var id: Long?,
                   @ColumnInfo(name = "devicename") var deviceName: String?,
                   @ColumnInfo(name = "location") var location: String?,
                   @ColumnInfo(name = "userOwnerId") var userOwnerId: String?,
                   @ColumnInfo(name = "latitude") var latitude: Double?,
                   @ColumnInfo(name = "longitude") var longitude: Double?,
                   @ColumnInfo(name = "temperature") var temperature: Int?,
                   @ColumnInfo(name = "humidity") var humidity: Int?,
                   @ColumnInfo(name = "pm25") var pm25: Int?,
                   @ColumnInfo(name = "pm10") var pm10: Int?
)
