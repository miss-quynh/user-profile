package com.example.android.userprofile;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView photo;
    TextView name;
    TextView birthday;
    TextView country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.name);
        birthday = (TextView) findViewById(R.id.birthday);
        country = (TextView) findViewById(R.id.country);

        name.setText("Quynh Nguyen");
        birthday.setText("01/20/1994");
        country.setText("Philippines");
    }
}
