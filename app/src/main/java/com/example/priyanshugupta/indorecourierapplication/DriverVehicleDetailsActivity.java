package com.example.priyanshugupta.indorecourierapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SHUBHAM JAIN on 05-Jul-17.
 */

public class DriverVehicleDetailsActivity extends AppCompatActivity {

    private EditText vehicleNoEt,ownerNameEt,ownerMobileNumberEt,
            ownerAddressEt,vehiclenameEt;
    private Button submitVehicleBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_vehicle_of_driver);

        vehicleNoEt = (EditText)findViewById(R.id.driver_vehicle_number_Et);
        ownerNameEt = (EditText)findViewById(R.id.driver_vehicle_Owner_name_Et);
       ownerMobileNumberEt = (EditText)findViewById(R.id.driver_vehicle_Owner_mobile_Et);
        ownerAddressEt = (EditText)findViewById(R.id.driver_vehicle_owner_address_Et);
        vehiclenameEt = (EditText)findViewById(R.id.driver_vehicle_name_Et);
        submitVehicleBt =(Button)findViewById(R.id.driver_vehicle_details_submit_Bt);

        Intent intent = getIntent();
        String driverName = intent.getStringExtra("driverName");
        String driverUserName = intent.getStringExtra("driverUserName");
        String driverEmail = intent.getStringExtra("driverEmail");
        String driverpassword = intent.getStringExtra("driverPassword");
        String drivermobile = intent.getStringExtra("driverMobile");
        String driverEmergencyMobile = intent.getStringExtra("driverEmergencyMobile");
        String driverAddress = intent.getStringExtra("driverAddress");
        String driverAdhaarNo =intent.getStringExtra("driverAdhaarNo");

        submitVehicleBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String vehicleNumber = vehicleNoEt.getText().toString();
                String ownerName = ownerNameEt.getText().toString();
                String ownerMobile = ownerMobileNumberEt.getText().toString();
                String ownerAddress =  ownerAddressEt.getText().toString();
                String vehicleName =  vehiclenameEt.getText().toString();

                //ab yaha pe click ke bad ek disclaimer appear hona chahiye
                //CHECHBOX OR BUTTOM -> i agree the terms and conditions of the agreement
                //uske bad hi data base me entry hogi
            }
        });

    }
}
