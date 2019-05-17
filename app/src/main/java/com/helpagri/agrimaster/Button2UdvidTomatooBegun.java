package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidTomatooBegun extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>টমেটো ও বেগুনের ব্যাকটেরিয়া জনিত ঢলে পড়া</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>সনাক্তকারী বৈশিষ্ট্য :</b>" +
            "• আক্রান্ত গাছের পাতা সবুজ অবস্থাতেই ঝিমুতে শুরু করে এবং গাছটি সবুজ অবস্থাতেই মারা যায়। গাছ তুলে ছুরি দিয়ে গোড়া কেটে কাচেঁর গ্লাসের পানিতে কাটা প্রান্ত ডুবালে দেখা যাবে দুধের মত সাদা সুতার মত ব্যাক্টেরিয়া অবিরত বের হচ্ছে।<br>" +
            "<b>দমন ব্যবস্থাপনা</b><br>" +
            "রোগ প্রতিরোধী জাত যথা বারি বেগুন ৮ এর চাষ করা। উক্ত বেগুন গাছ কে রুটস্টক হিসেবে ব্যবহার করে বেগুন ও টমেটোর জোড় কলম করা। এই রোগে আক্রান্ত জমিতে ভাসানো সেচ দেওয়া বন্ধ করতে হবে এবং জমে থাকা পানি নিশ্কাশনের ব্যবস্থা থাকতে হবে। মাটিতে স্ট্যাবল ব্লিচিং পাউডার ২০ কেজি প্রতি হেক্টরে চারা রোপণের পূর্বে প্রয়োগ করতে হবে। শস্য পর্যায় অবলম্বন করতে হবে।<br>" +
            "<center><img src=\"file:///android_res/drawable/tomatoo1.gif\" width=\"150\" height=\"100\" /></center>" +
            "<center>কৃমি আক্রান্ত পটল গাছ ও শিকড় (ছবি-১)</center><br>" +
            "<center><img src=\"file:///android_res/drawable/tomatoo2.gif\" width=\"150\" height=\"100\" /></center>" +
            "<center>কৃমি আক্রান্ত পটল গাছ ও শিকড় (ছবি-২)</center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_tomatoo_begun);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidTomatooBegun.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
