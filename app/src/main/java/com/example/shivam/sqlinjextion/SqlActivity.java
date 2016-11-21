package com.example.shivam.sqlinjextion;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SqlActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button protection;
    private EditText editText;
    ImageView imageView;
    String value="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        protection=(Button)findViewById(R.id.activity_sql_protectionButton);
        editText=(EditText)findViewById(R.id.activity_sql_editText);
        imageView = (ImageView) findViewById(R.id.imgView);


        final DatabaseHandler db = new DatabaseHandler(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               value=editText.getText().toString();
                List<Contact> contactList = db.query(value);
                String text="";
                for(Contact cn: contactList){
                    text += "\n Id: " + cn.getId() + "\n Name: " + cn.getName() + "\n Phone: " + cn.getPhoneNumber() + "\n EmailAddress: " + cn.getEmailAddress() + "\n Password: "+cn.getPassword();
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

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getBaseContext());
                builder.setMessage("Hello");
                builder.setCancelable(true);
                builder.setPositiveButton("OK",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
