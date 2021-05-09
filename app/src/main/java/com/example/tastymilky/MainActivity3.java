package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    Button order;
    TextView bill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cb1=findViewById(R.id.five);
        cb2=findViewById(R.id.three);
        cb3=findViewById(R.id.one);
        cb4=findViewById(R.id.fl);
        cb5=findViewById(R.id.tl);
        cb6=findViewById(R.id.ol);
        order=findViewById(R.id.order);
        bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;

                if (cb1.isChecked()){
                    total=total+350;

                }
                if (cb2.isChecked()){
                    total=total+250;

                }
                if (cb3.isChecked()){
                    total=total+150;

                }
                if (cb4.isChecked()){
                    total=total+300;

                }
                if (cb5.isChecked()){
                    total=total+200;

                }
                if (cb6.isChecked()){
                    total=total+100;

                }
                bill.setText("YOUR BILL IS"+String.valueOf(total));
                Toast.makeText(MainActivity3.this, "order confirmed", Toast.LENGTH_SHORT).show();


            }
        });
    }
}