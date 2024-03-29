package com.earmor.domain.domain

import android.content.Context
import com.tomaslab.app.R
import kotlin.random.Random

class UseCaseLoadSplashScreen {

    fun loadSplashScreen(context: Context):String{
        val array_content = context.resources.getStringArray(R.array.splash_screen_text_content)
        return array_content[Random.nextInt(array_content.count())]
    }
}