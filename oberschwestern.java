package com.example.ikarusv01;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;



import com.example.programmingknowledge.simpleloginapp.R;

public class oberschwestern extends Activity implements View.OnClickListener{

    private Button visite;
    private Button patienten;
    private Button med;
    private Button pfleger;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oberschwestern);

        visite = (Button) findViewById(R.id.visite);
        patienten = (Button) findViewById(R.id.patienten);
        med = (Button) findViewById(R.id.med);
        pfleger = (Button) findViewById(R.id.pfleger);


    }
    @Override
    public void onClick(View v) {
        visite();
    }
    public void visite()
    {
        Intent intent = new Intent (this,Pflegepersonal.class);
        startActivity(intent);
    };


}
