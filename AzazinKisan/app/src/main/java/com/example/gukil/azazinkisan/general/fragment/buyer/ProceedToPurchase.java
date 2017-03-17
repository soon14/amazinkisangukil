package com.example.gukil.azazinkisan.general.fragment.buyer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;

/**
 * Created by ICAN on 08-03-2017.
 */

public class ProceedToPurchase extends Fragment
{
    ViewGroup view;

    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInsatnce) {
        view = (ViewGroup) inflater.inflate(R.layout.proceedtopurchase, container, false);

        return view;

    }

}