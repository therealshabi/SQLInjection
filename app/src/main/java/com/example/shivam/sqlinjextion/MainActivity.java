package com.example.shivam.sqlinjextion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.activity_main_button);

        final DatabaseHandler db = new DatabaseHandler(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.deleteAllContacts();
                db.addContact(new Contact("Shivam","8527456771","gupta.shivam97@gmail.com","testing"));
                db.addContact(new Contact("Shahbaz","1234567890","hussain.shahbaz@gmail.com","hacked"));
                db.addContact(new Contact("Shubhankar","0123456789","gupta.shubhankar@gmail.com","research"));
                db.addContact(new Contact("Gurleen","4204204200","sethi.gurleen@gmail.com","android"));
                db.addContact(new Contact("Neelam","9711415044","gupta.neelam@gmail.com","hello"));

                Intent intent=new Intent(getBaseContext(),SqlActivity.class);
                startActivity(intent);

            }
        });

    }
}
