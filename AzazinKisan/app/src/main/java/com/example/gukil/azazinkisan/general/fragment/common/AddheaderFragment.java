package com.example.gukil.azazinkisan.general.fragment.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;
import com.example.gukil.azazinkisan.general.adapter.Header_RecyclerView_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gukil on 28-02-2017.
 */

public class AddheaderFragment extends Fragment
{

    ViewGroup View;
    RecyclerView recyclerView;
    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInsatnce) {
        View = (ViewGroup) inflater.inflate(R.layout.header, container, false);
        recyclerView =(RecyclerView)View.findViewById(R.id.header_recycler_view);
        List<Data> data = fill_with_data();
        Header_RecyclerView_Adapter header_adapter = new Header_RecyclerView_Adapter(data,getActivity(),getFragmentManager());
        recyclerView.setAdapter(header_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        return View;

    }
    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));


        return data;

    }
}
