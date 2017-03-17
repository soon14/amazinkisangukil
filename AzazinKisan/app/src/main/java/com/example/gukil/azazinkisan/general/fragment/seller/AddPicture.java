package com.example.gukil.azazinkisan.general.fragment.seller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;

/**
 * Created by Gukil on 10-02-2017.
 */

public class AddPicture extends Fragment {
    ViewGroup View;
    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInsatnce)
    {
        View=(ViewGroup)inflater.inflate(R.layout.addpicture,container,false);

        return View;
    }
}
