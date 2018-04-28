package com.example.aakash.comboapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aakash.comboapp.R;


public class WithDrawFragment extends Fragment {

    private static WithDrawFragment INSTANCE = null;


    public WithDrawFragment() {
        // Required empty public constructor
    }
    public static WithDrawFragment getInstace() {
        if (INSTANCE == null) INSTANCE = new WithDrawFragment();
        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_withdraw, container, false);
    }

}
