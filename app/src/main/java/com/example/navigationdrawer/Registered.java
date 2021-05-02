package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.navigationdrawer.R.id.et_name;

public class Registered extends AppCompatActivity {

    String[] name0, name1, name2, name3, name4, name5, name6, name7, name8;
    TextView textView, textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        button= (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                textView = (TextView) findViewById(R.id.textView);
                textView1 = (TextView) findViewById(R.id.textView1);
                textView2 = (TextView) findViewById(R.id.textView2);
                textView3 = (TextView) findViewById(R.id.textView3);
                textView4 = (TextView) findViewById(R.id.textView4);
                textView5 = (TextView) findViewById(R.id.textView5);
                textView6 = (TextView) findViewById(R.id.textView6);
                textView7 = (TextView) findViewById(R.id.textView7);
                textView8 = (TextView) findViewById(R.id.textView8);
                textView9 = (TextView) findViewById(R.id.textView9);
                textView10 = (TextView) findViewById(R.id.textView10);



                textView2.setText(getText(name0));
                textView3.setText(getText(name1));
                textView4.setText(getText(name2));
                textView5.setText(getText(name3));
                textView6.setText(getText(name4));
                textView7.setText(getText(name5));
                textView8.setText(getText(name6));
                textView9.setText(getText(name7));
                textView10.setText(getText(name8));

            }

            private int getText(String[] name0) {
                return 0;
            }
        });
    }
}
