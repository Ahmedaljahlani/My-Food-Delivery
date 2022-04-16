package com.example.myfoodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.List;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.viewHilder> {

    List<DetailedDailyModel> list;

    public DetailedDailyAdapter(List<DetailedDailyModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHilder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new viewHilder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull viewHilder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.price.setText(list.get(position).getPrice());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHilder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,price,description,rating,timing;
        public viewHilder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.detailed_img);
            name=itemView.findViewById(R.id.detailed_name);
            price=itemView.findViewById(R.id.detailed_price);
            description=itemView.findViewById(R.id.detailed_des);
            rating=itemView.findViewById(R.id.detailed_rating);
            timing=itemView.findViewById(R.id.detailed_timing);
        }
    }
}
