package com.ruz.trisha.ruztrishamarielab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnActivity2;
    Button Maps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, Service.class);
        startService(i);

        btnActivity2 = findViewById(R.id.btnActivity2);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayActivity2(v);
            }
        });

        Maps = findViewById(R.id.btnMaps);

        Maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayMap(v);
            }
        });


    }


    public void displayActivity2(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
        finish();
    }


    public void displayMap(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnMaps){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.5901252 + ","+ 121.036629));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
    }
}
