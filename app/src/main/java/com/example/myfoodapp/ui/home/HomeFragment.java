package com.example.myfoodapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.HomeHorAdapter;
import com.example.myfoodapp.adapters.HomeVerAdappter;
import com.example.myfoodapp.adapters.UpdateVerticalRec;
import com.example.myfoodapp.databinding.FragmentHomeBinding;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    //////////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdappter homeVerAdappter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);


        ////////////////////////Horizontal RecyclerView;
        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza, "Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger, "HamBurger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes, "Fried"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream, "Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich, "Sandwich"));

        homeHorAdapter = new HomeHorAdapter(this, getActivity(), homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));


        //////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        homeVerAdappter = new HomeVerAdappter(getActivity(), homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdappter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(true);

        return root;
    }

    @Override
    public void callBAck(int position, ArrayList<HomeVerModel> list) {
        homeVerAdappter = new HomeVerAdappter(getContext(), list);
        homeVerAdappter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdappter);
    }
}