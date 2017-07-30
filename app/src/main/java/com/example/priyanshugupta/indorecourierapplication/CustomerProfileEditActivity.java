package com.example.priyanshugupta.indorecourierapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Priyanshu Gupta on 7/25/2017.
 */

public class CustomerProfileEditActivity extends Activity {

    TextView customerNewNameEt, customerNewEmailEt, customerNewPasswordEt, customerNewMobileEt, customerNewAddressEt, customerNewAadharEt;
    Button customerSubmitBt, customerCancelBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile_edit);

        customerNewNameEt = (TextView)findViewById(R.id.customerNewNameEt);
        customerNewEmailEt = (TextView)findViewById(R.id.customerNewEmailEt);
        customerNewPasswordEt  = (TextView)findViewById(R.id.customerNewPasswordEt);
        customerNewMobileEt = (TextView)findViewById(R.id.customerNewMobileEt);
        customerNewAddressEt = (TextView)findViewById(R.id.customerNewAddressEt);
        customerNewAadharEt = (TextView)findViewById(R.id.customerNewAadharEt);

        customerSubmitBt = (Button)findViewById(R.id.customerSubmitBt);
                customerCancelBt = (Button)findViewById(R.id.customerCancelBt);

        customerSubmitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerProfileEditActivity.this, CustomerHomeActivity.class);
            }
        });

        customerCancelBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerProfileEditActivity.this, CustomerProfileActivity.class);
            }
        });
    }
}
