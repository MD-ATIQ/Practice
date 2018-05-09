package com.example.mdatiquzzaman.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView changeTV;
private EditText showet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTV=findViewById(R.id.tv);
        showet = findViewById(R.id.et);
    }

    public void ChangeText(View view) {
      String name= showet.getText().toString();
      changeTV.setText(name);
    }

    public void ClreaeText(View view) {
        changeTV.setText("");
        showet.setText("");
    }
}
