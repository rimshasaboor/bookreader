package com.example.project.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.project.MainActivity;
import com.example.project.R;

public class SplashActivity extends AppCompatActivity {


    private final int SPLASH_DELAY= 2500;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        getWindow().setBackgroundDrawable(null);
        initializeView();
        animateLogo();
        goToMainActivity();
    }

    private void initializeView(){
        imageView = findViewById(R.id.imageView2);
    }

    private void animateLogo() {
        Animation FadingInAnimation =AnimationUtils.loadAnimation(this,R.anim.fade_in);
        FadingInAnimation.setDuration(SPLASH_DELAY);
        imageView.startAnimation(FadingInAnimation);
    }

    private void goToMainActivity() {
        new Handler().postDelayed(()-> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, SPLASH_DELAY);


    }

}