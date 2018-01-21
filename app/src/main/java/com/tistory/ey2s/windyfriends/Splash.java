package com.tistory.ey2s.windyfriends;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by 151120 on 2018-01-15.
 */

public class Splash extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MediaPlayer bgm = MediaPlayer.create(this, R.raw.bgm_3pm);
        bgm.setLooping(true);
        bgm.start();



        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

}
