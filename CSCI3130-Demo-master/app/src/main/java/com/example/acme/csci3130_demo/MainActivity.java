package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Hello, World!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to change center textview field to a user's input in the top editview when button is clicked
    public void changeText(View v) {
        // Identify the input location
        EditText edit = (EditText)findViewById(R.id.txtInput);
        // Identify the textView to be altered
        TextView tView = (TextView)findViewById(R.id.txtOutput);
        // Convert text entered in the editText field to a String
        String ret = edit.getText().toString();
        // Set the text of the textView to the strong entered in the editView
        tView.setText(ret);
    }
}
