package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);


        ImageView sideArrow = findViewById(R.id.sidearrow);
        sideArrow.setOnClickListener(v -> {
            // Navigate back to MainActivity (which hosts side nav)
            Intent intent = new Intent(ProfileActivity.this, SideFragment.class);
            finish(); // Ends this activity
        });

    }

}
