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

public class CustomerNewOrderActivity extends Activity {

    private TextView customerNewOrderTv;
    private EditText customerPickAddEt, customerDeliveryAddEt, customerRecNumEt
            , customerRecAltNumEt, customerPkgWeightEt, customerPkgDetailEt;
    private Button customerSubmitBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_new_order);

        customerNewOrderTv = (TextView)findViewById(R.id.customerNewOrderTv);
        customerPickAddEt = (EditText)findViewById(R.id.customerPickAddEt);
        customerDeliveryAddEt = (EditText)findViewById(R.id.customerDeliveryAddEt);
        customerRecNumEt  = (EditText)findViewById(R.id.customerRecNumEt);
        customerRecAltNumEt = (EditText)findViewById(R.id.customerRecAltNumEt);
        customerPkgWeightEt = (EditText)findViewById(R.id.customerPkgWeightEt);
        customerPkgDetailEt = (EditText)findViewById(R.id.customerPkgDetailEt);
        customerSubmitBt = (Button)findViewById(R.id.customerSubmitBt);

        customerSubmitBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerNewOrderActivity.this, CustomerHomeActivity.class);
                startActivity(in);
            }
        });
    }
}
