package com.example.priyanshugupta.indorecourierapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Priyanshu Gupta on 7/10/2017.
 */

public class CustomerLoginActivity extends Activity {

    private TextView welcomeCustomerTv;
    private EditText customerEmailEt, customerPasswordEt;
    private Button customerLoginBt, customerNewUserBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        welcomeCustomerTv = (TextView)findViewById(R.id.welcomeCustomerTv);
        customerEmailEt = (EditText)findViewById(R.id.customerEmailEt);
        customerPasswordEt = (EditText)findViewById(R.id.customerPasswordEt);
        customerLoginBt = (Button)findViewById(R.id.customerLoginBt);
        customerNewUserBt = (Button)findViewById(R.id.customerNewUserBt);

    }
}
