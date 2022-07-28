package com.chs.weathercompose.data.repository

import com.chs.weathercompose.data.mapper.toWeatherInfo
import com.chs.weathercompose.data.remote.WeatherApi
import com.chs.weathercompose.domain.repository.WeatherRepository
import com.chs.weathercompose.domain.util.Resource
import com.chs.weathercompose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    lng = lng
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error.")
        }
    }
}