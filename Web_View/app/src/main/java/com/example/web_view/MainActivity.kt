package com.example.web_view

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(webview != null){
            val webviewsetting  = webview.settings
//            Used for enabling JavaScript in the webview
            webviewsetting.javaScriptEnabled = true
            webview.webViewClient = WebViewClient()
            webview.webChromeClient = WebChromeClient()
            webview.webViewClient =object:WebViewClient(){
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    super.onPageStarted(view, url, favicon)
                    progressBar.visibility = View.VISIBLE
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    progressBar.visibility = View.GONE
                }
            }
            webview.loadUrl("https://www.google.com")
        }
    }

    override fun onBackPressed() {
        if(webview.canGoBack())
            webview.goBack()
        else
            super.onBackPressed()
    }
}
