package com.pajato.shelib

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import kotlinx.android.extensions.CacheImplementation
import kotlinx.android.extensions.ContainerOptions

/** Provide an activity to present a URL in a web view widget. */
@ContainerOptions(CacheImplementation.NO_CACHE)
class WebViewActivity : AppCompatActivity() {

    /** Provide support for starting the web view activity. */
    companion object {

        const val URL_KEY = "urlKey"

        /** Return an intent that has encapsulated the web view properties. */
        fun newIntent(context: Context, url: String) =
                Intent(context, WebViewActivity::class.java).apply {
                    putExtra(URL_KEY, url)
                }
    }

    /** Create the initial content for the activity. */
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        // Instantiate and initialize the web view, then establish the content.
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
        webView.settings.builtInZoomControls = true
        webView.loadUrl(intent.getStringExtra(URL_KEY))
        setContentView(webView)
    }
}
