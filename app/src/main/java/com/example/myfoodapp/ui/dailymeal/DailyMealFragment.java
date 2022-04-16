package com.example.myfoodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DailyMealAdapter;
import com.example.myfoodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.dialy_meal_fragment,container,false);

        recyclerView=root.findViewById(R.id.daily_meal_rec);
        dailyMealModels=new ArrayList<>();
        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"breakfast","30% OFF","Description Description","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"lunch","30% OFF","Description Description","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweet,"sweet","30% OFF","Description Description","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffee,"coffee","30% OFF","Description Description","coffee"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"dinner","30% OFF","Description Description","dinner"));

        dailyMealAdapter=new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }

}