package com.example.syamk.buttonimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn2;
    private TextView info;
    private boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        btn2 = (ImageButton)findViewById(R.id.btn0);
        info= (TextView)findViewById(R.id.textView);

        configurImageButton();
    }

    private void configurImageButton(){
        ImageButton btn1 =(ImageButton)findViewById(R.id.btn0);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ImageButton btn2 = (ImageButton) findViewById(R.id.btn0);
                if(!flag) {
                    btn2.setImageResource(R.drawable.turnoff);
                    info.setText("Main ligth is ON");
                    flag=true;
                }else if(flag) {
                    btn2.setImageResource(R.drawable.turnon);
                    info.setText("Main ligth is OFF");
                    flag=false;
                }else{

                }

            }
        });

    }
}
