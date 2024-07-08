package hus.example.communicate1.book;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import hus.example.maria23_4_2024.R;

public class PurchaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);


        ListView listView = findViewById(R.id.purchase_list_view);

    }
}