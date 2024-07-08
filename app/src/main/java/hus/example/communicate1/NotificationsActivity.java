package hus.example.communicate1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import hus.example.maria23_4_2024.R;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);


        ListView listView = findViewById(R.id.notifications_list_view);

    }
}
