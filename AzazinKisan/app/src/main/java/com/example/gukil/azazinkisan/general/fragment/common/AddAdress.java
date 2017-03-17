package com.example.gukil.azazinkisan.general.fragment.common;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.AddressAdpater;
import com.example.gukil.azazinkisan.general.adapter.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gukil on 10-02-2017.
 */

public class AddAdress extends Fragment
{
    RecyclerView AddressView;
    ViewGroup View;
    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup Container, Bundle SavedInsatance)
    {
        View=(ViewGroup)inflater.inflate(R.layout.recyclerview,Container,false);
        AddressView=(RecyclerView)View.findViewById(R.id.recyclerView);
        List<Data> data = fill_with_data();
        AddressAdpater addressAdpater = new AddressAdpater(data,getActivity());
        AddressView.setAdapter(addressAdpater);
        AddressView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        return View;

    }
    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("132114" ,"Tagore High School","210/8 Gharaunda"));
        data.add(new Data("132114" ,"Sachdeva Crockery","313/12 Gharaunda"));
        data.add(new Data("132114" ,"Tagore High School","210/8 Gharaunda"));
        data.add(new Data("132114" ,"Sachdeva Crockery","313/12 Gharaunda"));
        data.add(new Data("132114" ,"Tagore High School","210/8 Gharaunda"));
        data.add(new Data("132114" ,"Sachdeva Crockery","313/12 Gharaunda"));
        data.add(new Data("132114" ,"Tagore High School","210/8 Gharaunda"));
        data.add(new Data("132114" ,"Sachdeva Crockery","313/12 Gharaunda"));
        return data;

    }
}
