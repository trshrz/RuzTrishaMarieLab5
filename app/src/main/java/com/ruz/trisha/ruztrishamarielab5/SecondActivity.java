package com.ruz.trisha.ruztrishamarielab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("4ITF ", "oncreate has executed.... ");

    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnMaps) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.578428, 120.983472"));
            chooser = Intent.createChooser(i, "Select your map app");

            startActivity(chooser);
        }
    }
    public void display2(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}