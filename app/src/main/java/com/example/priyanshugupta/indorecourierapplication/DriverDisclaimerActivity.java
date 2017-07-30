package com.example.priyanshugupta.indorecourierapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SHUBHAM JAIN on 06-Jul-17.
 */

public class DriverDisclaimerActivity extends AppCompatActivity {

    private TextView disclaimerTv;
    private Button iagreeBt,idisagreeBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        disclaimerTv =(TextView)findViewById(R.id.disclaimerTv);
        iagreeBt =(Button)findViewById(R.id.iAgreeBt);
        idisagreeBt=(Button)findViewById(R.id.iDisagreeAgreeBt);


        idisagreeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DriverDisclaimerActivity.this, "Please agree only then we can proceed further", Toast.LENGTH_SHORT).show();
            }
        });

        iagreeBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(DriverDisclaimerActivity.this, "Thank you for accepting our agreement", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DriverDisclaimerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
