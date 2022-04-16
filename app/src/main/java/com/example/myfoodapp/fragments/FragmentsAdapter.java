package com.example.myfoodapp.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentsAdapter extends FragmentStateAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();

        }
        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
