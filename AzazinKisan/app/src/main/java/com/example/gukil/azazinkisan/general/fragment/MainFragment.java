package com.example.gukil.azazinkisan.general.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;

/**
 * Created by Gukil on 01-03-2017.
 */

public class MainFragment extends Fragment {
    ViewGroup view;
    RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        view = (ViewGroup) inflater.inflate(R.layout.main_fragment, container, false);
        /*recyclerView=(RecyclerView)view.findViewById(R.id.main_layout);
        recyclerView.setLayoutManager( new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
*/
        return view;
    }
}
