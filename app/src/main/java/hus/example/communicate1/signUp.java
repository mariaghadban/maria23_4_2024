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

public class signUp extends AppCompatActivity {
    EditText username, fullname, email, password;
    Button signUp;
    TextView logintxt;

    FirebaseAuth auth;
    ProgressDialog progressDialog;
   // Database




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);

        username = findViewById(R.id.username);
        fullname = findViewById(R.id.fullname);
        password = findViewById(R.id.passid);
        signUp = findViewById(R.id.signup_btn);
        logintxt = findViewById(R.id.logintxt);
        email = findViewById(R.id.idemail);

        auth = FirebaseAuth.getInstance();

        logintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signUp.this, logIn.class));
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressDialog(signUp.this);
                progressDialog.setMessage("it will take a while");
                progressDialog.show();


                String usernamestr = username.getText().toString();
                String fullnamestr = fullname.getText().toString();
                String passwordstr = password.getText().toString();
                String emailstr = email.getText().toString();
                //chanching to srting and putting new variable to recognize it.

                if (TextUtils.isEmpty(usernamestr) || TextUtils.isEmpty(fullnamestr)
                        || TextUtils.isEmpty(emailstr) || TextUtils.isEmpty(passwordstr)) {
                    Toast.makeText(signUp.this, "somthing is missing", Toast.LENGTH_SHORT).show();
                }
                if (passwordstr.length() < 8) {
                    Toast.makeText(signUp.this, "the password should be longer", Toast.LENGTH_SHORT).show();
                }
                else{
                    signUp(usernamestr,fullnamestr,emailstr,passwordstr);

                }

            }
        });

    }
    private void signuporivate(String username,String fullname, String email, String password ){
        auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(signUp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(logIn.this, "signing in succeeded", Toast.LENGTH_SHORT).show(); //מעבר למסך ראשי
                        Intent i = new Intent(logIn.this, MainActivity.class);
                        StartActivity(i);
                    }
                        else{
                            Toast.makeText(logIn.this, "signing not succeeded", Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();


                        }


                    }
                });
    }

}