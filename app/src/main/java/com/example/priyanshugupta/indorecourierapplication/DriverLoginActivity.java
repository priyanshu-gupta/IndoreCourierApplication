package com.example.priyanshugupta.indorecourierapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SHUBHAM JAIN on 05-Jul-17.
 */

public class DriverLoginActivity extends AppCompatActivity {

    private EditText usernameEt,passwordEt;
    private Button loginBt,newuserBt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        usernameEt =(EditText)findViewById(R.id.driver_username_Et);
        passwordEt=(EditText)findViewById(R.id.driver_password_Et);
        loginBt=(Button)findViewById(R.id.driver_login_Bt);
        newuserBt=(Button)findViewById(R.id.driver_new_User_Bt);

        loginBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //YAHA PE dB SE CHECK HOGA VALID TO FORWARD HOGA DROVER HOME PR

            }
        });


        newuserBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverLoginActivity.this,DriverNewUserRegistratonActivity.class);
                startActivity(intent);
                    // isse new user pe forward ho jayega
            }
        });
    }
}
