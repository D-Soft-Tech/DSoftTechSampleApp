package com.dsofttech.dprefssampleapp

import android.app.Application
import com.dsofttech.dprefs.utils.DPrefs

class DPrefsTestApp : Application() {
    override fun onCreate() {
        super.onCreate()
        DPrefs.initializeDPrefs(applicationContext)
    }
}
