package com.example.priyanshugupta.indorecourierapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Priyanshu Gupta on 7/11/2017.
 */

public class CustomerRegistrationActivity extends Activity {

    private TextView customerEnterNewDetailTv;
    private EditText customerNewNameEt, customerNewEmailEt, customerNewPasswordEt, customerNewMobileEt, customerNewAddressEt, customerNewAadharEt;
    private Button customerNewDetailSubmitBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_registration);

        customerEnterNewDetailTv = (TextView)findViewById(R.id.customerEnterNewDetailTv);
        customerNewNameEt = (EditText)findViewById(R.id.customerNewNameEt);
        customerNewEmailEt = (EditText)findViewById(R.id.customerNewEmailEt);
        customerNewPasswordEt = (EditText)findViewById(R.id.customerNewPasswordEt);
        customerNewMobileEt = (EditText)findViewById(R.id.customerNewMobileEt);
        customerNewAddressEt = (EditText)findViewById(R.id.customerNewAddressEt);
        customerNewAadharEt = (EditText)findViewById(R.id.customerNewAadharEt);
        customerNewDetailSubmitBt = (Button)findViewById(R.id.customerNewDetailSubmitBt);

        customerNewDetailSubmitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerRegistrationActivity.this, CustomerHomeActivity.class);
                startActivity(in);
            }
        });
    }
}
