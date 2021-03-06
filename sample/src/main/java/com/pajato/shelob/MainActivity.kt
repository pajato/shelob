package com.pajato.shelob

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions

@ContainerOptions(CacheImplementation.NO_CACHE)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
