package com.example.myapplication

import android.app.Application
import com.lokalise.sdk.Lokalise

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        Lokalise.init(this, "<change>", "<change>")
        Lokalise.isPreRelease = true
        Lokalise.updateTranslations()
    }
}
