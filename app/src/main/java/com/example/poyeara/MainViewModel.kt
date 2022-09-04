package com.example.poyeara

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.poyeara.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val livedataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()

}