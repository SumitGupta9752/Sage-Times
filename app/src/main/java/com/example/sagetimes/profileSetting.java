package com.example.sagetimes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profileSetting extends AppCompatActivity {
    private Button Aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile_setting);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the HomeActivity directly
                Intent intent = new Intent(profileSetting.this, AboutUs.class);
                startActivity(intent);
                finish(); // Finish LoginActivity to prevent going back when pressing back button
            }
        });
    }
}