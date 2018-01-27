package com.example.rsess.guess_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InterruptedIOException;

public class MainActivity extends AppCompatActivity {
    private EditText txtInput;
    private TextView txtOutPut;
    private Button btnGuess;
    private int Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        // 取得隨機亂數
        Value = (int)(Math.random() * 10000);
    }

    private void Init()
    {
        txtInput = findViewById(R.id.txtInput);
        txtOutPut = findViewById(R.id.txtOutput);
        txtOutPut.setCursorVisible(false);
        txtOutPut.setFocusable(false);
        txtOutPut.setFocusableInTouchMode(false);

        btnGuess = findViewById(R.id.btnBuess);

        btnGuess.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}
