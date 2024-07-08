package hus.example.communicate1.book;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);


        TextView usernameTextView = findViewById(R.id.username_text_view);
        String username = getCurrentUser().getUsername();
        usernameTextView.setText(username);


    }


}