package com.example.priyanshugupta.indorecourierapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by SHUBHAM JAIN on 06-Jul-17.
 */

public class DriverHomeActivity extends AppCompatActivity {

private Button profileBt,availableorderBt,confirmedorderBt,completedorderBt;
    private TextView welcomeTv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_home);
        welcomeTv =(TextView) findViewById(R.id.driverhomeTv);
        profileBt=(Button)findViewById(R.id.driverProfileBt);
        availableorderBt=(Button)findViewById(R.id.driverAvailableOrderBt);
        confirmedorderBt=(Button)findViewById(R.id.driverConfirmedOrderBt);
        completedorderBt=(Button)findViewById(R.id.driverCompletedOrderBt);


        profileBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverHomeActivity.this,DriverProfileActivity.class);
                startActivity(intent);
            }
        });

        availableorderBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverHomeActivity.this,DriverAvailableOrderActivity.class);
                startActivity(intent);
            }
        });

        confirmedorderBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverHomeActivity.this,DriverConfirmedOrdersActivity.class);
                startActivity(intent);
            }
        });
        completedorderBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverHomeActivity.this,DriverCompletedOrdersActivity.class);
                startActivity(intent);
            }
        });
    }
}
