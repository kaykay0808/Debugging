package com.kay.debugging

import android.app.Application
import timber.log.Timber
import timber.log.Timber.Forest.plant


class ApplicationStuff : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            plant(Timber.DebugTree())
        }
    }
}