package com.example.androidwordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Counter counter = new Counter();
    EditText yourText;
    TextView wordsInText;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yourText = findViewById(R.id.yourText);
        myButton = ((Button)findViewById(R.id.button));
        wordsInText = findViewById(R.id.wordsInText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = yourText.getText().toString();
                wordsInText.setText("zodziu skaicius:" + counter.countWords(temp));
            }
        });
    }
}
