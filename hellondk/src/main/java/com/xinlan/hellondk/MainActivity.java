package com.xinlan.hellondk;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

/**
 * panyi
 *
 *
 */
public class MainActivity extends FragmentActivity {
    private TextView text;

    static {
        System.loadLibrary("sayhello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        text.setText(NativeBridge.sayHello());
    }
}//end class
