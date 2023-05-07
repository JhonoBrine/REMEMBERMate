package com.example.remembermate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class mainLogin extends Activity implements View.OnClickListener {

    FloatingActionButton test_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        test_btn = (FloatingActionButton) findViewById(R.id.test_btn);
        test_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.test_btn:
                Intent intent_mainHome = new Intent(this, mainHome.class);
                startActivity(intent_mainHome);
                break;
        }
    }
}