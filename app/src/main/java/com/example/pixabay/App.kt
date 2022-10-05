package com.example.pixabay

import android.app.Application
import com.example.pixabay.network.PixabayApi
import com.example.pixabay.network.RetrofitService

class App : Application() {

    companion object{
        lateinit var api: PixabayApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.getApi()

    }

}