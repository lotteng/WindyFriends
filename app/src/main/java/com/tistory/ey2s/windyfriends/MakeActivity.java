package com.tistory.ey2s.windyfriends;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by 151120 on 2018-01-15.
 */

public class MakeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make);


        //Grid 추가
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));


        //Home 버튼 클릭시 메인화면으로
        ImageButton makeButton = (ImageButton) findViewById(R.id.home);

        makeButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });





    }


}
