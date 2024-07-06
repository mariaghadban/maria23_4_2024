package hus.example.communicate1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import hus.example.maria23_4_2024.R;

public class StartActivity extends AppCompatActivity {

    Button login,signup;
    FirebaseUser firebaseUser;

    @Override
    protected void onStart() {
        super.onStart();

        firebaseUser= FirebaseAuth.getInstance().getCurrentUser();

        // if user not null
         if(firebaseUser !=null){
             new StartActivity(new Intent(StartActivity.this, MainActivity.class));
             finish();
         }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =findViewById(R.id.login_btn);
        signup =findViewById(R.id.signup_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new StartActivity(new Intent(StartActivity.this, MainActivity.class));

            }
        });

    }
}