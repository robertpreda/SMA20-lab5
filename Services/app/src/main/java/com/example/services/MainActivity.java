package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
    Intent batteryStatus = this.registerReceiver(null, ifilter);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Thread bThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
//                boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
//                        status == BatteryManager.BATTERY_STATUS_FULL;
//
//                int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
//                boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
//                boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
//            }
//        });
    }
}