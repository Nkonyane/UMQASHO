package com.example.wendy.umqasho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {


    Animation animFadeIn, ZoomIn, Zoomin2, animBounceIn, animSlideUp;
    private ImageView popup1, popup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        popup1 = (ImageView) findViewById(R.id.popup1);
        popup2 = (ImageView) findViewById(R.id.popup2);

//        FadeIntMethod();
        ZoomInMethod();
        BounceInMethod();
    }


    public void SlideInUpMethod() {


        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_animation);
        popup2.startAnimation(animSlideUp);


    }

    public void ZoomInMethod() {


        ZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        popup1.startAnimation(ZoomIn);

    }
    public void ZoomInMethod2() {

        Zoomin2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_popupfive);
        popup2.startAnimation(Zoomin2);

    }

    public void BounceInMethod() {

        animBounceIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);
        popup2.startAnimation(animBounceIn);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LOGIN.class));
            }
        }, 3000);


    }
}
