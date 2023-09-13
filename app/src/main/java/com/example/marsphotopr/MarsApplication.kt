package com.example.marsphotopr

import android.app.Application
import com.example.marsphotopr.data.AppContainer
import com.example.marsphotopr.data.DefaultAppContainer

class MarsApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}