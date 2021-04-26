package com.example.testgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgCloth_Dt;
    TextView tvName_Dt;
    TextView tvPrice_Dt;
    Button btn_addTobag;
    Cloth mCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Ánh xạ
        imgCloth_Dt = findViewById(R.id.imgCloth_Dt);
        tvName_Dt = findViewById(R.id.tvNameDt);
        tvPrice_Dt = findViewById(R.id.tvPriceDt);
        //Lấy dữ liệu từ main1 gửi sang
        Intent intent = getIntent();
        if(intent != null){
            mCloth = (Cloth) intent.getSerializableExtra("key1");
            //sau khi nhận được dữ liệu thì set lại các giá trị TextView, ảnh
            imgCloth_Dt.setImageResource(mCloth.getImgCloth());
            tvName_Dt.setText(mCloth.getName());
            tvPrice_Dt.setText(mCloth.getPrice() + "");// Cái này hai sai nhé + ""
        }
    }
}