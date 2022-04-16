package com.example.myfoodapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.viewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_hoorizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.textView.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00 - 23:00", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00 - 23:00", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00 - 23:00", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:00 - 23:00", "4.9", "Min - $35"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza5, "Pizza5", "10:00 - 23:00", "4.9", "Min - $35"));

            updateVerticalRec.callBAck(position, homeVerModels);
            check = false;
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
                if (position == 0) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.pizza5, "Pizza 5", "10:00 - 23:00", "4.9", "Min - $35"));

                    updateVerticalRec.callBAck(position, homeVerModels);
                } else if (position == 1) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Burger 1", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger 2", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger3, "Burger 3", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger 4", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.burger5, "Burger 5", "10:00 - 23:00", "4.9", "Min - $35"));

                    updateVerticalRec.callBAck(position, homeVerModels);
                } else if (position == 2) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.fries1, "fries 1", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries2, "fries 2", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries3, "fries 3", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries4, "fries 4", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.fries5, "fries 5", "10:00 - 23:00", "4.9", "Min - $35"));

                    updateVerticalRec.callBAck(position, homeVerModels);
                } else if (position == 3) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "ice cream 1", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "ice cream 2", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "ice cream 3", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream4, "ice cream 4", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream5, "ice cream 5", "10:00 - 23:00", "4.9", "Min - $35"));

                    updateVerticalRec.callBAck(position, homeVerModels);
                } else if (position == 4) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "sandwich 1", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "sandwich 2", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "sandwich 3", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "sandwich 4", "10:00 - 23:00", "4.9", "Min - $35"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sandwich5, "sandwich 5", "10:00 - 23:00", "4.9", "Min - $35"));

                    updateVerticalRec.callBAck(position, homeVerModels);
                }
            }
        });

        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select=false;
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            textView = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
