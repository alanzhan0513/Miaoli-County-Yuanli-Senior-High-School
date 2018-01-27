package com.example.rsess.guess_number;

import android.service.notification.NotificationListenerService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InterruptedIOException;

public class MainActivity extends AppCompatActivity {
    private EditText txtInput;
    private TextView txtOutPut;
    private Button btnGuess;
    private String[] Secret;
    private int A;
    private int B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化變數
        Init();
        // 產生隨機亂數
        Random();
    }

    private void Random()
    {
        Boolean Success = false;
        Boolean Break = false;

        while (!Success)
        {
            // 取得隨機亂數
            int Random = (int) (Math.random() * 10000);
            // 將 數值 轉乘 字串
            String strRandom = String.valueOf(Random);
            // 避免轉型時，0消失
            if (strRandom.length() < 4)
            {
                continue;
            }
            // 將 字串 轉乘 陣列
            Secret = strRandom.split("");
            // 自我檢查 數值是否有重複
            Break = false;
            for (int i = 1; i < 5; i++)
            {
                for (int j = 1; j < 5; j++)
                {
                    if (i == j)
                    {
                        continue;
                    }
                    if (Secret[i].equals(Secret[j]))
                    {
                        Break = true;
                        break;
                    }
                }
                if (Break)
                {
                    break;
                }
                if (i == 4)
                {
                    Success = true;
                }
            }
            Log.d("Ans", strRandom);
        }
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
                CheckInput();
            }
        });

    }

    private void CheckInput()
    {
        // 取得輸入字串
        String Input = txtInput.getText().toString();
        // 檢查字串長度是否為四個字
        if (Input.length() != 4)
        {
            // 如果不等於四個字，提醒使用者，中斷本次猜數字。
            txtOutPut.setText("輸入必須為四位數數值");
            return;
        }
        // 將A 與 B 歸零
        A = 0;
        B = 0;
        // 將字串切割成Array
        String[] Split = Input.split("");
        // 檢查有幾個A
        for (int i = 1; i < 5; i++)
        {
            if (Split[i].equals(Secret[i]))
            {
                A++;
            }
            else
            {
                for (int j = 1; j < 5; j++)
                {
                    if (i == j)
                    {
                        continue;
                    }
                    if (Split[i].equals(Secret[j]))
                    {
                        B++;
                    }
                }
            }
        }
        // 如果為四個A 恭喜猜成功
        if (A == 4)
        {
            txtOutPut.setText(Input + "恭喜答對");
            return;
        }
        txtOutPut.setText(A + "A" + B + "B");
    }
}
