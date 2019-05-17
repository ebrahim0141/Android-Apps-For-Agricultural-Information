package com.helpagri.agrimaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Button41Activity extends AppCompatActivity {

    private WebView webView;
    String myText="<html><body><center><h1>প্রশ্ন/উত্তর/মতামত</h1></center>" +
            "<h2>প্রশ্ন</h2>" +
            "<big> বিষয় :<b>লাউ গাছের সমস্যা।</b><br/>" +
            "<b>বিস্তারিত বিবরণ :</b> সার আমার লাউ গাছের সব কটি লাউই ছোট অবস্তাই আকাবাকা হয় এবং কিচুটা বড় হবার পর পচে যায়।<br/>" +
            "<h2>উত্তর/মতামত</h2>" +
            "লাউ ফল হলুদ হয়ে পচে ২টি কারনে<br/>" +
            "ক) মাছি পোকার আক্রমনের ফলে সেক্ষেত্রে ফল নরম হয়ে পচে যাবে এবং ভিতরে পোকার কীড়া দেখা যাবে।<br/>" +
            "খ) পরাগায়নের সমস্যা হলে অর্থাৎ পর্যাপ্ত পরিমান পুরুষ ফুল না থাকলে ফল নির্দিষ্ট সময় পর হলুদ হয়ে শুকিয়ে পচে যাবে। তখন ফর শক্ত থাকবে।<br/>" +
            "মাছি পোকা দমনের জন্য ফেরোম্যান ট্যাপ এবং পরাগায়নের সমস্যা সমাধানের জন্য পুরুষ ফুল দিয়ে স্ত্রী ফুলের পরাগায়ন করিয়ে দিতে হবে। (হাতের সাহায্যে)<br/>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button41);

        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);
    }
}
