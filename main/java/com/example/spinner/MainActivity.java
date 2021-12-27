package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너 테스트");

        final String[] movie = { "쿵푸팬더", "짱구는 못말려", "아저씨", "아바타", "대부",
                                 "국가대표","토이스토리3", "마당을 나온 암탉", "죽은 시인의 사회", "서유기" };

        //스피너문제풀이
        final Integer[] posterID = { R.drawable.mov21, R.drawable.mov22, R.drawable.mov23,
                                     R.drawable.mov24, R.drawable.mov25, R.drawable.mov26,
                                     R.drawable.mov27, R.drawable.mov28, R.drawable.mov29,
                                     R.drawable.mov30 };

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                                                                android.R.layout.simple_spinner_item,
                                                                movie);
        spinner.setAdapter(adapter);

        //스피너의 아이템 선택시 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

//                ImageView iv1 = new ImageView(MainActivity.this);
                ImageView iv1 = findViewById(R.id.iv1);
                iv1.setImageResource(posterID[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}