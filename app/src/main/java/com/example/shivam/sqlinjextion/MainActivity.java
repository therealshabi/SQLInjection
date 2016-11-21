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
                db.addContact(new Contact("Shivam","8527456771","gupta.shivam97@gmail.com"));
                db.addContact(new Contact("Shweta","9968547388","gupta.shweta@gmail.com"));
                db.addContact(new Contact("Shuchita","9990173746","gupta.shuchita@gmail.com"));
                db.addContact(new Contact("Manoj","9810612322","gupta.manoj@gmail.com"));
                db.addContact(new Contact("Neelam","9711415044","gupta.neelam@gmail.com"));

                Intent intent=new Intent(getBaseContext(),SqlActivity.class);
                startActivity(intent);

            }
        });

    }
}
