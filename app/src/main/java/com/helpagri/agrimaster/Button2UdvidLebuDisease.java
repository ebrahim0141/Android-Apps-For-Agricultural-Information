package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidLebuDisease extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>লেবুজাতীয় ফসলের ক্যাংকার রোগের দমন ব্যবস্থাপনা</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "সনাক্তকারী বৈশিষ্ট্য :" +
            "ক্যাংকার রোগের আক্রমণ হলে লেবু গাছের পাতা ঝরে যায় এবং আগা মরা লক্ষণ প্রকাশ পায় সেই সাথে অপরিণত অবস্থায় ফল ঝরে যায়। খুব ছোট ছোট কিছুটা উঁচু ক্রিম রংয়ের দাগ দিয়ে রোগের লক্ষণের সূত্রপাত ঘটে। এর পর দাগটি বড় হতে থাকে এবং হালকা বাদামী রং ধারণ করে। দাগটিকে ঘিরে সাধারণত হলদে আভা দেখা যাবে এবং পাতার উভয় পৃষ্ঠে ফুলে উঠা লক্ষণ প্রকাশ পাবে। পাতা ফলের উপর দাগটি উচু-নীচু হয়ে শুকনা ক্ষত ধরণের অনেকটা ‘‘দাঁদ’’ এর মত দেখায়। পাতার তুলনায় ফলের ক্ষত বেশী গভীর হয়। তবে কচি কান্ডে আক্রমণ হলে লক্ষণ সুস্পষ্টভাবে প্রকাশ পায় সেই সাথে আগা মরা লক্ষণ দেখা যায়। পাতা, ডগা বা ফলে কচি অবস্থায় বেশী রোগ দেখা যায়।<br>" +
            "<b>দমন ব্যবস্থাপনা:</b><br>" +
            "• রোগমুক্ত বাগান হতে কলম বা চারা সংগ্রহ করে বাগান করতে হবে।<br>" +
            "• ডালপালা কমানোর জন্য জানুয়ারি-ফেব্রুয়ারী মাসে গাছের ডালপালা ছেটে (প্রুনিং) দিতে হবে। বাগান সবসময় পরিষ্কার-পরিচ্ছন্ন রাখতে হবে। <br>" +
            "• রোগাক্রান্ত বাগানে কাজ করার পর সুস্থ বাগানে কাজ করা যাবে না। বাগানে ব্যবহৃত যন্ত্রপাতি কাজ করার পূর্বে সাবান বা ডিটারজেন্ট মিশ্রিত পানিতে চুবিয়ে রেখে পরিষ্কার করে ব্যবহার করতে হবে। <br>" +
            "• আক্রান্ত ডালপালা বর্ষার আগে কেটে পুড়িয়ে ফেললে ভাল হয়। শাখা-প্রশাখার কাটা অংশে আলকাতরা বা বোর্দোপেস্ট লাগিয়ে দিতে হবে। <br>" +
            "• এ রোগের অন্যতম বাহক পোকা লিফ মাইনর দমনের জন্য ইমিডাক্লোরোপিড গ্রুপের কীটনাশক (এ্যাডমায়ার) প্রতি লিটার পানিতে ০.৫ মিলি হারে মিশিয়ে ১৫ দিন অন্তর অন্তর স্প্রে করতে হবে।<br>"+
            "<center><img src=\"file:///android_res/drawable/lebu.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_lebu_disease);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidLebuDisease.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
