package com.example.zidingyiguangbo;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("nanchang");
                intent.putExtra("西瓜","4.5");
                intent.setComponent(new ComponentName(getPackageName(),"com.example.zidingyiguangbo.MyGuangBo"));
                //Toast.makeText(MainActivity.this,"aaaa",Toast.LENGTH_LONG).show();
                sendBroadcast(intent);
            }
        });
    }
}
