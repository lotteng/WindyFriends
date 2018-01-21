package com.tistory.ey2s.windyfriends;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;

/**
 * Created by 151120 on 2018-01-21.
 */

public class OptionActivity extends Activity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_option);

        findViewById(R.id.exitBT).setOnClickListener(this);
        findViewById(R.id.developBT).setOnClickListener(this);

        //볼륨조절
        SeekBar seekVolumn = (SeekBar) findViewById(R.id.volumbar);
        final AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        int nMax = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int nCurrentVolumn = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekVolumn.setMax(nMax); seekVolumn.setProgress(nCurrentVolumn);
        seekVolumn.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {



            @Override public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
            }
            @Override public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub
            }
            @Override public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // TODO Auto-generated method stub
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

        });


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.exitBT :
                this.finish();
                break;

            case R.id.developBT :
                startActivity(new Intent(this, DevelopActivity.class));
                break;
        }



    }




}
