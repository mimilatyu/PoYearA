package com.example.poyeara.adapters

//модель данных информации о погоде ну и еще что-написал для теста
data class WeatherModel(
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imageUrl: String,
    val hours: String
)
