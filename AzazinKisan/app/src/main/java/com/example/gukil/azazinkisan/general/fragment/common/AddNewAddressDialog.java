package com.example.gukil.azazinkisan.general.fragment.common;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.seller.ChooseSubProductCategory;

/**
 * Created by ICAN on 16-03-2017.
 */

public class AddNewAddressDialog extends DialogFragment {
    public  static AddNewAddressDialog newInstance() {
        return new AddNewAddressDialog();
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.recyclerview,container,false);

        return view;


    }
}