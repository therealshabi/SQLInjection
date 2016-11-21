package com.example.shivam.sqlinjextion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class SqlActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button protection;
    private EditText editText;
    String value="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        protection=(Button)findViewById(R.id.activity_sql_protectionButton);
        editText=(EditText)findViewById(R.id.activity_sql_editText);

        final DatabaseHandler db = new DatabaseHandler(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               value=editText.getText().toString();
                List<Contact> contactList = db.query(value);
                String text="";
                for(Contact cn: contactList){
                    text += "\n Id: " + cn.getId() + "\n Name: " + cn.getName() + "\n Phone: " + cn.getPhoneNumber() + "\n EmailAddress: " + cn.getEmailAddress() + "\n";
                }
                textView.setText(text);
            }
        });

        protection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),ProtectionIntroActivity.class);
                startActivity(intent);
            }
        });
    }
}
