package com.mg.aroma.fetcher.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mg.aroma.fetcher.R;
import com.mg.aroma.fetcher.adapters.SwipeAdapter;
import com.mg.aroma.fetcher.model.PinModel;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwipeFragment extends Fragment {

    private ViewPager pager;
    private SwipeAdapter adapter;
    public static final String DATA_KEY = "DATA_KEY";
    public SwipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_swipe, container, false);
        Bundle args = getArguments();
        PinModel[] models = (PinModel[]) args.getParcelableArray(DATA_KEY);
        adapter = new SwipeAdapter(Arrays.asList(models),getFragmentManager());
        pager = (ViewPager) root.findViewById(R.id.pager);
        pager.setAdapter(adapter);
        return  root;
    }


}
