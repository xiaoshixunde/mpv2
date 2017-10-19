package com.mei.day01_mvp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initText();
        initText();
        initText();

    }

    private void initText() {

    }

    private void initDate() {

    }

    private void initView() {
        text2 = (TextView) findViewById(R.id.text2);
    }
}
