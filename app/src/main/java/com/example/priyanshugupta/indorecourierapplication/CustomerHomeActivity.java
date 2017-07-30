package com.example.priyanshugupta.indorecourierapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Priyanshu Gupta on 7/11/2017.
 */

public class CustomerHomeActivity extends Activity {

    private TextView customerHomeTv;
    private Button customerNewOrderBt, customerOrderStatusBt, customerProfileBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        customerHomeTv = (TextView)findViewById(R.id.customerHomeTv);
        customerNewOrderBt = (Button)findViewById(R.id.customerNewOrderBt);
        customerOrderStatusBt = (Button)findViewById(R.id.customerOrderStatusBt);
        customerProfileBt = (Button)findViewById(R.id.customerProfileBt);

        customerNewOrderBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(CustomerHomeActivity.this, CustomerNewOrderActivity.class);
                startActivity(in);
            }
        });

    }

}
