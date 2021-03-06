package com.irvingryan.verifycodeview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.simpleUse).setOnClickListener(this);
        findViewById(R.id.customUse).setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simpleUse:
                startActivity(new Intent(this, VerifyOtpActivity.class));
                break;
            case R.id.customUse:
                startActivity(new Intent(this, CustomParamsActivity.class));
                break;
        }
    }
}
