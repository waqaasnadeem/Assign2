package com.example.wiki.assign2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Button signBtn = (Button)findViewById(R.id.signBtnRel);
        final CheckBox check = (CheckBox)findViewById(R.id.checkBoxRel);

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked()) {
                    //show toast displaying information.
                    //String name = findViewById(R.id.editText2.);
                    //String name = (String) R.id.editText2;
                    //String password = “123”;

                    Toast.makeText(getApplicationContext()," Great All Good", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RelativeActivity.this, MainActivity.class));

                } else {
                    //show dialogue
                    Toast.makeText(getApplicationContext()," Please Check Terms ans Conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
