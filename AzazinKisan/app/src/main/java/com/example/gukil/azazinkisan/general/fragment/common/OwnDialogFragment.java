package com.example.gukil.azazinkisan.general.fragment.common;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.gukil.azazinkisan.R;

/**
 * Created by Gukil on 11-02-2017.
 */

public class OwnDialogFragment extends DialogFragment {
    ViewGroup View;
    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup Conatiner, Bundle SaveInsatance)
    {
        View=(ViewGroup)inflater.inflate(R.layout.addressdialogfragment,Conatiner,false);
        return View;
    }
}
