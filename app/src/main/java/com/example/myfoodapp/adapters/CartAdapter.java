package com.example.myfoodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.CartModel;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.viewHolder> {

    List<CartModel> list;


    public CartAdapter(List<CartModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,rating,price;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.detailed_img);
            name=itemView.findViewById(R.id.detailed_name);
            rating=itemView.findViewById(R.id.detailed_rating);
            price=itemView.findViewById(R.id.textView12);
        }
    }
}
