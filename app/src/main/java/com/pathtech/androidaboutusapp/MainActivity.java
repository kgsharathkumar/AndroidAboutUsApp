package com.pathtech.androidaboutusapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("About Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        FancyAboutPage fancyAboutPage=findViewById(R.id.fancyaboutpage);
        //fancyAboutPage.setCoverTintColor(Color.BLUE); //Optional
        fancyAboutPage.setCover(R.drawable.coverimg);
        fancyAboutPage.setName("Sharathkumar K G");
        fancyAboutPage.setDescription("Android Developer | Android App, Web and Software Developer.");
        fancyAboutPage.setAppIcon(R.drawable.pathtech);
        fancyAboutPage.setAppName("Path Tech");
        fancyAboutPage.setVersionNameAsAppSubTitle("1.2.3");
        fancyAboutPage.setAppDescription("Proficient with Core Java, Android, Android SDK, Android Framework, Python, Robot, Django framework, Webservices. Worked on Cloud technologies like Docker.\n");
        fancyAboutPage.addEmailLink("sharu.smarter@gmail.com");
        fancyAboutPage.addFacebookLink("https://www.facebook.com/shashanksinghal02");
        fancyAboutPage.addTwitterLink("https://twitter.com/shashank020597");
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in//");
        fancyAboutPage.addGitHubLink("https://github.com/kgsharathkumar");

    }
}
