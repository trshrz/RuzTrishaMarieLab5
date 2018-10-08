package com.ruz.trisha.ruztrishamarielab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class Service extends IntentService {

    public Service(){
        super("Service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "Service is running in the background!");
    }
}
