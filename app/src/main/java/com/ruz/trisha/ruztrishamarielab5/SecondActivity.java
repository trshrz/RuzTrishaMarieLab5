package com.ruz.trisha.ruztrishamarielab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnActivity1;
    Button Maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, Service.class);
        startService(i);


        btnActivity1 = findViewById(R.id.btnActivity1);

        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayActivity1(v);
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

    public void displayActivity1(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void displayMap(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btnMaps){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.6325372 + ","+ 120.9824703));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
    }
}
