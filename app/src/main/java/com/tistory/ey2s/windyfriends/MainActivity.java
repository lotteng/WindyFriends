package com.tistory.ey2s.windyfriends;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.makeBT).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.optionBT).setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        switch (v.getId()) {

            case R.id.makeBT :
                startActivity(new Intent(this, MakeActivity.class));

                break;


            case R.id.optionBT :
                startActivity(new Intent(this, OptionActivity.class));

                break;
        }
    }
}