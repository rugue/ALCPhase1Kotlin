package com.ruguethedeveloper.alcphase1

import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        //Reference to the WebView
        val aboutALCWebView = findViewById<WebView>(R.id.about_alc_webview)

        //create an instance of the new WebViewClient for the WebView
        aboutALCWebView.webViewClient = object : WebViewClient() {

            //Overrides onReceivedSslError which helps Ignore SSL certificate errors
            override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        }
        //loads the page
        aboutALCWebView.loadUrl("https://andela.com/alc/")
    }

}
