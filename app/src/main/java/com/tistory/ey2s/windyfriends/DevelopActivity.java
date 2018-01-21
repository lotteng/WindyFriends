package com.tistory.ey2s.windyfriends;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by 151120 on 2018-01-21.
 */

public class DevelopActivity extends Activity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_develop);

        findViewById(R.id.exitBT).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.exitBT:
                this.finish();
                break;
        }
    }
}
