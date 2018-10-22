package com.example.wiki.assign2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import org.w3c.dom.Text;


public class ConstraintActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        Button signBtn = findViewById(R.id.signBtnConst);
        final CheckBox check = findViewById(R.id.checkBoxConst);

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check.isChecked()) {
                    //show toast displaying information.
                    //String name = findViewById(R.id.editText2.);
                    //String name = (String) R.id.editText2;
                    //String password = “123”;

                    Toast.makeText(getApplicationContext()," Great All Good", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ConstraintActivity.this, MainActivity.class));


                } else {
                    //show dialogue
                    Toast.makeText(getApplicationContext()," Please Check Terms ans Conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
