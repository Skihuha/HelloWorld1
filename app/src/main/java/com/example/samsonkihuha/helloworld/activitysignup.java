package com.example.samsonkihuha.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activitysignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitysignup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button Btnsignup= findViewById():(R.id.button_send);
        Btnsignup.setOnClickListener():new View.OnClickListener()(
            public void onClick:View v){
            Intent homepageintent=new Intent(activitysignup.this,activityhome.class);
                    startActivity(homepageintent);
        }
        EditText Firstname=(EditText)findViewById(R.firstname);
        EditText lastname=(EditText)findViewById(R.lastname);
        EditText email=(EditText)findViewById(R.email);
        EditText phone=(EditText)findViewById(R.namephone);





        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

            }
        });
    }

}
