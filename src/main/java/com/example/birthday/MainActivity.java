package com.example.birthday;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // لجعل التطبيق يعمل بالوضع الليلي (تغيير تلقائي)
        // إذا بدك إياه ليلي حطي MODE_NIGHT_YES وإذا بدك إياه نهار حطي MODE_NIGHT_NO
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        setContentView(R.layout.activity_main);
    }
}