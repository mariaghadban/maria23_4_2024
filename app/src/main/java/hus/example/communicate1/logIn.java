package hus.example.communicate1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import hus.example.maria23_4_2024.R;

public class logIn extends AppCompatActivity {

    EditText email,password;
    Button login;
    TextView signup_text;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        email=findViewById(R.id.idemail);
        password = findViewById(R.id.passid);
        login = findViewById(R.id.login_btn);
        signup_text = findViewById(R.id.signup_btn);

        auth = FirebaseAuth.getInstance();

        signup_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartActivity(new Intent(logIn.this, signUp.class))
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog pd = new ProgressDialog(signUp.this);
                pd.setMessage("it will take a while");
                pd.show();


                String passwordstr = password.getText().toString();
                String emailstr = email.getText().toString();
                //chanching to srting and putting new variable to recognize it.

                if (TextUtils.isEmpty(emailstr) || TextUtils.isEmpty(passwordstr)) {
                    Toast.makeText(signUp.this, "somthing is missing", Toast.LENGTH_SHORT).show();
                }
                else {
                    auth.signInWithEmailAndPassword(emailstr,passwordstr)
                            .addOnCompleteListener(logIn.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        FirebaseAuth.getInstance().signOut();
                                    }
                                }
                            });
                }

            }
        });

    }
}