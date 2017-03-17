package com.example.gukil.azazinkisan.general.fragment.buyer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
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

//public class SimilarProduct extends Activity {

//    public void onCreate(Bundle SavedInstanceStae){
//super.onCreate(SavedInstanceStae);
//        setContentView(R.layout.defaultrecyclerview);

public class SimilarProduct extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.recyclerview, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        List<Data> data = fill_with_data();
        RecyclerGridViewAdapter similarItems = new RecyclerGridViewAdapter(data, getContext(), getFragmentManager(),"similarproduct");

        recyclerView.setAdapter(similarItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"carrot"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 5, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 5, R.drawable.carrot,"Carrot"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 4, R.drawable.pistachio,"pistachio"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 1, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"Carrot"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"carrot"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 5, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 5, R.drawable.carrot,"Carrot"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 4, R.drawable.pistachio,"pistachio"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 1, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"Carrot"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"carrot"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 5, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 5, R.drawable.carrot,"Carrot"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 4, R.drawable.pistachio,"pistachio"));
        data.add(new Data("100 Pieces", "400 Pieces", "30/Piece", 1, R.drawable.flower,"flowers"));
        data.add(new Data("100 Kg", "400 Kg", "30/Kg", 3, R.drawable.carrot,"Carrot"));
        return data;

    }
}




