package com.example.ikarusv01;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;


import com.example.programmingknowledge.simpleloginapp.R;


public class main extends Activity implements View.OnClickListener  {


    private EditText user;
    private EditText password;
    private Button weiter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        weiter = (Button) findViewById(R.id.button2);


    }




    @Override
    public void onClick(View v) {
        weiter();
    }
    public void weiter()
    {
        Intent intent = new Intent (this,activity2.class);
        startActivity(intent);
    };
}
