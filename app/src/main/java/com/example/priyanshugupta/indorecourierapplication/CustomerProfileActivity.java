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

public class CustomerProfileActivity extends Activity {

    TextView customerNewNameTv, customerNewEmailTv, customerNewPasswordTv, customerNewMobileTv, customerNewAddressTv, customerNewAadharTv;
    Button customerNewDetailSubmitBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.;

        customerNewNameTv = (TextView)findViewById(R.id.customerNewNameTv);
                customerNewEmailTv = (TextView)findViewById(R.id.customerNewEmailTv);
        customerNewPasswordTv  = (TextView)findViewById(R.id.customerNewPasswordTv);
                customerNewMobileTv = (TextView)findViewById(R.id.customerNewMobileTv);
        customerNewAddressTv = (TextView)findViewById(R.id.customerNewAddressTv);
                customerNewAadharTv = (TextView)findViewById(R.id.customerNewAadharTv);
        customerNewDetailSubmitBt = (Button)findViewById(R.id.customerNewDetailSubmitBt);

        customerNewDetailSubmitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerProfileActivity.this, CustomerProfileEditActivity.class);
            }
        });
    }
}
