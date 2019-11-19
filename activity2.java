package com.example.ikarusv01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.programmingknowledge.simpleloginapp.R;

public class activity2 extends Activity implements View.OnClickListener{


    private Button weiter1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);


        weiter1 = (Button) findViewById(R.id.button2);


    }
    @Override
    public void onClick(View v) {
        weiter1();
    }
    public void weiter1()
    {
        Intent intent = new Intent (this,Pflegepersonal.class);
        startActivity(intent);
    };

}
