package com.example.but;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class EX03_09_1 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myact);

        Button b2 = (Button) findViewById(R.id.button1);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EX03_09_1.this, MainActivity.class);
                startActivity(intent);
                EX03_09_1.this.finish();
            }
        } ) ;
    }
}