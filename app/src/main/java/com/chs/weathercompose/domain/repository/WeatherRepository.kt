package com.chs.weathercompose.domain.repository

import com.chs.weathercompose.domain.util.Resource
import com.chs.weathercompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo>
}