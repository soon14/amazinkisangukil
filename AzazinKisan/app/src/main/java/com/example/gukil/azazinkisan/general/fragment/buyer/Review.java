package com.example.gukil.azazinkisan.general.fragment.buyer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;
import com.example.gukil.azazinkisan.general.adapter.RecyclerGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gukil on 02-02-2017.
 */

public class Review extends Fragment {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recyclerview, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        List<Data> data = fill_with_data();
        RecyclerGridViewAdapter review = new RecyclerGridViewAdapter(data, getContext(), getFragmentManager(),"review");
        recyclerView.setAdapter(review);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true));
        return rootView;
    }

    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("Product is good and i got delivery on time" ,R.drawable.userlogo,3,"Demo"));
        data.add(new Data("Product is   very good  in quality" ,R.drawable.profile,5,"Demo"));
        data.add(new Data("Product is awesome thanks to amizin " ,R.drawable.userlogo,5,"Demo"));
        data.add(new Data("Product is good and i got delivery on time" ,R.drawable.userlogo,3,"Demo"));
        data.add(new Data("Product is   very good  in quality" ,R.drawable.customer,5,"Demo"));
        data.add(new Data("Product is awesome thanks to amizin " ,R.drawable.userlogo,5,"Demo"));
        data.add(new Data("Product is good and i got delivery on time" ,R.drawable.userlogo,3,"Demo"));
        data.add(new Data("Product is   very good  in quality" ,R.drawable.customer,5,"Demo"));
        data.add(new Data("Product is awesome thanks to amizin " ,R.drawable.userlogo,5,"Demo"));
        return data;

    }

}

