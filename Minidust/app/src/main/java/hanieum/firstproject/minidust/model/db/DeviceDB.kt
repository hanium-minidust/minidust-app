package hanieum.firstproject.minidust.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.CoroutineScope

// database 어노테이션을 이용해 entity를 정의하고 sqlite 버전을 지정
@Database(entities = [Device::class],version = 1, exportSchema = false)
abstract class DeviceDB: RoomDatabase() {
    abstract fun deviceDao(): DeviceDao

    companion object{
        private var INSTANCE: DeviceDB? = null

        // getinstance함수는 여러 스레드가 접근하지 못하도록 synchronized를 설정
        fun getInstance(
            context: Context,
            scope: CoroutineScope
        ): DeviceDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DeviceDB::class.java,
                    "device_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }




        fun destroyInstance(){
            INSTANCE = null
        }
        // callback으로 미리 데이터를 채워놓을 수 있다

    }
}