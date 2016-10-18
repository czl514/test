package org.crazyit.activityjump;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class NextActivity extends Activity {

    private Button button;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
       // intent.addFlags(intent.FLAG_ACTIVITY_SINGLE_TOP);
        Log.v("onNewIntent2", "onNewIntent2 is called");
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        Log.v("onCreate2", "onCreate2 is called");

        this.button = (Button) this.findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(NextActivity.this, NextNextActivity.class);
                startActivity(intent);
            }
        });
    }
}