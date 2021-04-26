package com.example.testgk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Onclick {
    ArrayList<Cloth> mCloths;
    RecyclerView rcv_Cloth;
    CustomAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCloths = new ArrayList<>(); //Chỗ hay thiếu
        rcv_Cloth = findViewById(R.id.rcv_cloth);

        //Tạo ra dữ liệu imgCloth, name, price
      mCloths.add(new Cloth(R.drawable.google, "googledev", 10));
      mCloths.add(new Cloth(R.drawable.code1, "CC", 30));
      mCloths.add(new Cloth(R.drawable.code1, "dev", 20));
      mCloths.add(new Cloth(R.drawable.google, "aodep", 40));
      mCloths.add(new Cloth(R.drawable.code1, "aoxau", 50));
      mCloths.add(new Cloth(R.drawable.google1, "googledev", 20));
      mCloths.add(new Cloth(R.drawable.code1, "gogogo", 30));
      mCloths.add(new Cloth(R.drawable.google1, "googledev", 20));


      adt = new CustomAdapter(mCloths, this);
      rcv_Cloth.setHasFixedSize(true);
      rcv_Cloth.setAdapter(adt);

      //Layout
        // layout doc VERTICAL
//      rcv_Cloth.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // layout doc ngang HORIZONTAL
//       rcv_Cloth.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
       rcv_Cloth.setLayoutManager(new GridLayoutManager(this, 2));



    }

    @Override
    public void itemClick(Cloth cloth) {
        //phần xử lý
        //Đầu tiên là mình sẽ xử lý chuyển màn hình
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //Sau đó tới xử lý gửi dữ liệu
        intent.putExtra("key1", cloth);
        //=> qua main2 xử lý

        startActivity(intent);
    }
}