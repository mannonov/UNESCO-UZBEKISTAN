package uz.najottalim.unescouzbekistan

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import uz.najottalim.unescouzbekistan.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {

    lateinit var binding: FragmentNewsBinding
    lateinit var webView: WebView
    lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentNewsBinding.inflate(layoutInflater)

        url = "https://en.unesco.org/fieldoffice/tashkent"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_news, container, false)

        webView = binding.webView

        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                if (url.contains("unesco")) {
                    view?.loadUrl(url)
                }
                return true
            }

        }
        webView.loadUrl("https://en.unesco.org/fieldoffice/tashkent")
        return binding.root
    }

}


