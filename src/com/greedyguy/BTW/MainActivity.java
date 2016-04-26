package com.greedyguy.BTW;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
    private Button btnService, btnBle, btnWifi;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnService = (Button)findViewById(R.id.service_btn);
        btnBle = (Button)findViewById(R.id.bluetooth_btn);
        btnWifi = (Button)findViewById(R.id.wifi_btn);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bluetooth_btn:
                break;
            case R.id.service_btn:
                break;
            case R.id.wifi_btn:
                break;
        }
    }
}
