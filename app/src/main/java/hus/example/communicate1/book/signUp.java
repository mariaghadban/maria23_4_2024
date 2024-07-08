package hus.example.communicate1.book;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import hus.example.maria23_4_2024.R;

class SignUpActivity extends AppCompatActivity {

    private EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        usernameEditText = findViewById(R.id.username_edittext);
        emailEditText = findViewById(R.id.email_edittext);
        passwordEditText = findViewById(R.id.password_edittext);
        confirmPasswordEditText = findViewById(R.id.confirm_password_edittext);
        signUpButton = findViewById(R.id.sign_up_button);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String username = usernameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();

        // Validate input fields
        if (TextUtils.isEmpty(username)) {
            Toast.makeText(getApplicationContext(), "Enter username!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(getApplicationContext(), "Enter valid email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.length() < 6) {
            Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPassword)) {
            Toast.makeText(getApplicationContext(), "Passwords do not match!", Toast.LENGTH_SHORT).show();
            return;
        }

        // If all validations are passed, proceed with registration (add your own logic here)
        // Example: Register user using Firebase Authentication or your preferred method

        // For demonstration purposes, navigate to HomeActivity after successful registration
        startActivity(new Intent(SignUpActivity.this, HomeActivity.class));
        finish();
    }
}
