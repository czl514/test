package org.crazyit.activityjump;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;

public class MainActivity extends Activity {

    private Button button;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = (Button) this.findViewById(R.id.button);
        this.button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NextActivity.class);
               // intent.addFlags(intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        Log.v("onCreate1", "onCreate1 is called");

        processExtraData();
    }


    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("onNewIntent1", "onNewIntent1 is called");
        setIntent(intent);//must store the new intent unless getIntent() will return the old one
        processExtraData();
    }

    private void processExtraData(){
        Intent intent=new Intent();
        //use the data received here
    }
}


