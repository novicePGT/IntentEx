package com.example.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    RadioButton radio1, radio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        radio1 = (RadioButton) findViewById(R.id.radio1) ;
        radio2 = (RadioButton) findViewById(R.id.radio2);
        //위젯을 변수에 대입
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio1.isChecked() == true) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                    //Intent 생성자의 첫 번쨰 파라미터 getApplicationContext()는 메인 클래스 컨텍스를 반환
                } else {
                    if (radio2.isChecked() == true) {
                        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                        startActivity(intent);
                        //Intent(<MainActivity지칭>,<갈 곳의 클래스명을 지정>.class
                    }
                }
            }
        });

    }
}