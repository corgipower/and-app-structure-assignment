package com.lambdaschool.android.organization.application

import android.app.Application
import com.lambdaschool.android.organization.model.Product

class LambdaApplication : Application() {
    public val appProduct = Product()

    override fun onCreate() {
        super.onCreate()

        // Note: You could do all kinds of app-initialization here. Crash-reporting tools,
        // Firebase, Stetho or anything else. You'll learn more about those later in the course.
    }
}