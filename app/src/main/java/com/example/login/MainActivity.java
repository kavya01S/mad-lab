package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mainLayout;
    private ImageView imageView;
    private EditText editTextUsername, editTextPassword, editTextEmail;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding views by their IDs
        mainLayout = findViewById(R.id.MainActivity);
        imageView = findViewById(R.id.imageView);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        button = findViewById(R.id.button);

        // Load animations
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        // Apply animations
        imageView.startAnimation(fadeIn);
        editTextPassword.startAnimation(slideUp);
        editTextEmail.startAnimation(slideUp);
        button.startAnimation(slideUp);

        // Set onClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform some action when the button is clicked
                // For example, start MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                // Get the text from the EditText fields
                String password = editTextPassword.getText().toString();
                String email = editTextEmail.getText().toString();

                // Log the input values
                Log.d("MainActivity", "Password: " + password);
                Log.d("MainActivity", "email: " + email);
            }
        });

        // Rest of your onCreate method...
    }

    // Define the onRegisterClick method outside the onCreate method
    public void onRegisterClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
