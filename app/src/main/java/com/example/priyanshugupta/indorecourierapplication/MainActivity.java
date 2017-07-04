package com.example.priyanshugupta.indorecourierapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Priyanshu Gupta on 7/4/2017.
 */

public class MainActivity extends Activity {

    private Button buttonCustomer, buttonDriver, buttonAdmin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCustomer = (Button)findViewById(R.id.buttonCustomer);
        buttonDriver = (Button)findViewById(R.id.buttonDriver);
        buttonAdmin = (Button)findViewById(R.id.buttonAdmin);

        buttonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Please Select Other Options", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hello World Priyanshu", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
