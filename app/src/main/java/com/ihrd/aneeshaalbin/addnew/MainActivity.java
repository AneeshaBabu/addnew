package com.ihrd.aneeshaalbin.addnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    String s1,s2,s3;
    int a1,a2,a3;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.numone);
        ed2=(EditText)findViewById(R.id.numtwo);
        ed3=(EditText)findViewById(R.id.numthree);
        ed4=(EditText)findViewById(R.id.result);
        b=(Button)findViewById(R.id.biggest);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                s1=ed1.getText().toString();
              s2=ed2.getText().toString();
              s3=ed3.getText().toString();
              a1=Integer.parseInt(s1);
              a2=Integer.parseInt(s2);
              a3=Integer.parseInt(s3);
                if((a1>a2)&&(a1>a3))
                {
                    ed4.setVisibility(View.VISIBLE);
                    ed4.setText(s1);
                }
                else if((a2>a1)&&(a2>a3))
                {
                    ed4.setVisibility(View.VISIBLE);
                    ed4.setText(s2);
                }
                else
                {
                    ed4.setVisibility(View.VISIBLE);
                    ed4.setText(s3);
                }
            }
        });
    }
}
