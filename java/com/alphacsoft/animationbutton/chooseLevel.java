package com.alphacsoft.animationbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseLevel extends AppCompatActivity {

    Button plus;
    Button minus;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        back = (Button) findViewById(R.id.back);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(chooseLevel.this, LevelActivity.class);
                startActivity(i);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(chooseLevel.this, LevelActivity.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
