package com.technion.android.hellome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String message;

    //button
    Button button;

    //edit text
    EditText editText;

    //toast messages
    String received_message = "Message sent: ";
    String empty_toast = "Error! You cannot send an empty message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                message = editText.getText().toString();
                if(message.isEmpty()){
                    showToast(empty_toast);
                } else {
                    showToast(received_message + message);
                }
            }
        });
    }
    private void showToast(String toast){
        Toast.makeText(MainActivity.this, toast, Toast.LENGTH_LONG).show();
    }
}
