package com.example.testgk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    ArrayList<Cloth> mCloths;
    private Onclick onclick;

    public CustomAdapter(ArrayList<Cloth> mCloths, Onclick onclick) {
        this.mCloths = mCloths;
        this.onclick = onclick;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cloth, parent,false);
        return new ViewHolder(view);
    }


    @Override
    public int getItemCount() {
        return mCloths.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //khai báo
        Cloth mcloth;
        ImageView imgCloth;
        TextView tvName, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Ánh xạ
            imgCloth = itemView.findViewById(R.id.imgCloth);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);

            //Bắt xự kiện item click
            imgCloth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onclick.itemClick(mcloth);
                }
            });

        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                Cloth cloth = mCloths.get(position);
                holder.mcloth = mCloths.get(position);
                holder.imgCloth.setImageResource(cloth.getImgCloth());
                holder.tvName.setText(cloth.getName());
                holder.tvPrice.setText(cloth.getPrice()+ ""); // Chỗ hay sai nhớ + ""

    }

}
