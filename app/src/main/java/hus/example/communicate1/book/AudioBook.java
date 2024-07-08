package hus.example.communicate1.book;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

 class AudioBookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_book);

        // Retrieve audio book data from intent or backend
        // Example:
        String audioBookTitle = getIntent().getStringExtra("title");
        setTitle(audioBookTitle);

        // Initialize views and display audio book details
        TextView titleTextView = findViewById(R.id.title_text_view);
        titleTextView.setText(audioBookTitle);

        // Add listeners for playback, purchase, etc.
    }
}