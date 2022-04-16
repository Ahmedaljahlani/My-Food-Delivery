package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DetailedDailyAdapter;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailsDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_daily_meal);

        String type=getIntent().getStringExtra("type");

        recyclerView=findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList=new ArrayList<>();
        dailyAdapter=new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);


        if (type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Breakfast","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Breakfast","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Breakfast","description","4.4","40","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweet);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Sweet","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Sweet","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.breakfast,"Sweet","description","4.4","40","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
}