package com.example.shivam.sqlinjextion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProtectionIntroActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protection_intro);

        textView=(TextView)findViewById(R.id.activity_protection_intro_textView1);
        textView1=(TextView)findViewById(R.id.activity_protection_intro_textView2);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),ProtectionPasswordActivity.class);
                startActivity(intent);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),ProtectionUsernameActivity.class);
                startActivity(intent);
            }
        });
    }
}
