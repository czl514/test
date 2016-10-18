package org.crazyit.activityjump;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by AiQinCai on 2015/6/30.
 */

public class NextNextActivity extends Activity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.next_next_activity);
        Log.v("onCreate3", "onCreate3 is called");
        this.button=(Button)findViewById(R.id.button2);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(NextNextActivity.this, MainActivity.class);
                //intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            //������д���ؼ�
                    Intent intent = new Intent();
                    intent.setClass(NextNextActivity.this, NextActivity.class);
                   // intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                   //intent.setFlags(intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);

            return true;
        } else
            return super.onKeyDown(keyCode, event);
    }
}