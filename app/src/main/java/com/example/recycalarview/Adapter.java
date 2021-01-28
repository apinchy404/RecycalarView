package com.example.recycalarview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    String countryList[];
    int imgList[];


    public Adapter(Context context,String countryList[],int imgList[])
    {
        this.context=context;
        this.countryList=countryList;
        this.imgList=imgList;
    }





    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh= new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, final int position) {



        holder.countryName.setText(countryList[position]);
        holder.imgCountry.setImageResource(imgList[position]);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, countryList[position],Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("name",countryList[position]);
                context.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return countryList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCountry;
        TextView countryName;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            imgCountry= itemView.findViewById(R.id.img_country);
            countryName=itemView.findViewById(R.id.txt_country_name);


        }
    }
}
