package com.example.priyanshugupta.indorecourierapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SHUBHAM JAIN on 05-Jul-17.
 */

public class DriverNewUserRegistratonActivity extends AppCompatActivity {


    private EditText nameEt,usernameEt,emailEt,passwordEt,mobileEt,
                        emergencymobileEt,addressEt,adhaarnoEt;
    private Button  submitBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_driver_details);

        nameEt = (EditText)findViewById(R.id.driver_new_name_Et);
        usernameEt = (EditText)findViewById(R.id.driver_new_username_Et);
        emailEt = (EditText)findViewById(R.id.driver_new_email_Et);
        passwordEt = (EditText)findViewById(R.id.driver_new_password_Et);
        mobileEt = (EditText)findViewById(R.id.driver_new_Mobile_Et);
        emergencymobileEt = (EditText)findViewById(R.id.driver_new_emergency_mobile_Et);
        addressEt= (EditText)findViewById(R.id.driver_new_address_Et);
        adhaarnoEt= (EditText)findViewById(R.id.driver_new_adhaar_Et);
        submitBt=(Button)findViewById(R.id.driver_new_details_submit_Bt);


        submitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String driverName = nameEt.getText().toString();
                String driverUserName = usernameEt.getText().toString();
                String driverEmail =  emailEt.getText().toString();
                String driverpassword = passwordEt.getText().toString();
                String drivermobile = mobileEt.getText().toString();
                String driverEmergencyMobile = emergencymobileEt.getText().toString();
                String driverAddress = addressEt.getText().toString();
                String driverAdhaarNo =adhaarnoEt.getText().toString();


             Intent intent = new Intent(DriverNewUserRegistratonActivity.this,DriverVehicleDetailsActivity.class);
                intent.putExtra("driverName",driverName);
                intent.putExtra("driverUserName",driverUserName);
                intent.putExtra("driverEmail",driverEmail);
                intent.putExtra("driverPassword",driverpassword);
                intent.putExtra("driverMobile",drivermobile);
                intent.putExtra("driverEmergencyMobile",driverEmergencyMobile);
                intent.putExtra("driverAddress",driverAddress);
                intent.putExtra("driverAdhaarNo",driverAdhaarNo);

                startActivity(intent);
                //yaha se yeh details forward krdo ya fir direct save kr do
                // age forward krna jyad better hai
                // jab driver sari formalities and entries complete kr de
                // tabhi database me entry kro




            }
        });



    }
}
