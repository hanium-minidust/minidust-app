package hanieum.firstproject.minidust.model.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface WeatherCall{
    @GET("/api/weather")
    fun current_weather(@Query("lon")lon:String,
                        @Query("lat")lat:String) : Call<WeatherClass>

    @GET("/api/map/coordsToAddress")
    fun coordsToAddress(@Query("lon")lon:String,
                        @Query("lat")lat:String) : Call<coordsToAddresData>

    @GET("/api/pollution")
    fun cityInfo(@Query("query")query:String) : Call<cityMiniDust>

    @GET("/api/sensor/{id}")
    fun getSensorInfo(@Path("id") id:Int) : Call<AllSensorInfos>
}