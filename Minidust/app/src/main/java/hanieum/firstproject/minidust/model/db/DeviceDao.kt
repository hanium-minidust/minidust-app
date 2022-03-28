package hanieum.firstproject.minidust.model.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DeviceDao {
    @Query("SELECT id, devicename,location FROM device")
    fun myDeviceList(): LiveData<List<Device>>

    @Query("SELECT * FROM device")
    fun getAll(): LiveData<List<Device>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(device: Device)

    @Query("UPDATE device SET devicename=:name Where id=:id")
    fun updateName(id:String, name:String)

    @Delete
    fun delete(device: Device)

    @Query("DELETE FROM device")
    fun deleteAll()
}