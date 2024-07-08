package hus.example.communicate1.book;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import hus.example.communicate1.user.user;
import hus.example.maria23_4_2024.R;

class ProfileActivity extends AppCompatActivity {

    private user currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);


        TextView usernameTextView = findViewById(R.id.username_text_view);
        String username = getCurrentUser().getUsername();
        usernameTextView.setText(username);


    }


    public user getCurrentUser() {
        return currentUser;
    }
}