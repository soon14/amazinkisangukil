package com.example.gukil.azazinkisan.general.fragment.seller;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.common.AddNewAddressDialog;


public class SubmitProductDetail extends Fragment
{

    ViewGroup view;
    ImageView addAdressButton;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState)
    {

        view = (ViewGroup) inflater.inflate(R.layout.submitproduct, container, false);
        addAdressButton = (ImageView) view.findViewById(R.id.AddaddressButton);
        addAdressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = AddNewAddressDialog.newInstance();
                dialogFragment.show(getFragmentManager(), "address dialog");
            }
        });
        return view;


    }
}
