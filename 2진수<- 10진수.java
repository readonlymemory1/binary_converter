package com.example.binary_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static  EditText bn;
    static Button button;
    static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            bn = (EditText) findViewById(R.id.BN);
            button = findViewById(R.id.button);
            textView = (TextView) findViewById(R.id.textView);

            int binary;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a = Integer.parseInt(bn.getText().toString());
                    String as = Integer.toBinaryString(a);
                    textView.setText(as);
                }
            });
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "에러", Toast.LENGTH_SHORT).show();
        }
    }
}

