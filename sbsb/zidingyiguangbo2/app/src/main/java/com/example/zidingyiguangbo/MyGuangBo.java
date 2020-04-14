package com.example.zidingyiguangbo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyGuangBo extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String STR=intent.getStringExtra("西瓜");
        Log.v("接收到了","123");
        Toast.makeText(context,STR,Toast.LENGTH_SHORT).show();
    }
}
