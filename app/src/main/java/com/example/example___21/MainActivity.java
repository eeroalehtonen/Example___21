package com.example.example___21;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String tag = "evh_Demo: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()");


    }

    protected void onStart() {
        super.onStart();
        Log.d(tag, tag + "onStart()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(tag, tag + "onReStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.d(tag, tag + "onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.d(tag, tag + "onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.d(tag, tag + "onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, tag + "onDestroy()");
    }
}

