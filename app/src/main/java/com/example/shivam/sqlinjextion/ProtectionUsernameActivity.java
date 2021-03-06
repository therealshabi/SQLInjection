package com.example.shivam.sqlinjextion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ProtectionUsernameActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protection_username);

        button=(Button)findViewById(R.id.activity_protection_username_button);
        textView=(TextView)findViewById(R.id.activity_protection_username_textView);
        editText=(EditText)findViewById(R.id.activity_protection_username_editText);

        textView.setText(" ");
        final DatabaseHandler db=new DatabaseHandler(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=editText.getText().toString();
                if(value.contains("'='"))
                {
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                }
                else {
                    List<Contact> contactList = db.queryUsername(value);
                    String text = "";
                    for (Contact cn : contactList) {
                        text += "\n Id: " + cn.getId() + "\n Name: " + cn.getName() + "\n Phone: " + cn.getPhoneNumber() + "\n EmailAddress: " + cn.getEmailAddress() + "\n";
                    }
                    textView.setText(text);
                }
            }
        });
    }
}
