package com.example.gukil.azazinkisan.general.fragment.seller;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;

import java.util.List;

/**
 * Created by ICAN on 16-03-2017.
 */

public class BankDetail extends DialogFragment {
    public static BankDetail newInstance() {
        return new BankDetail();
    }
    View view;
    Button submit,cancel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.bankdetail, container, false);
        getDialog().setTitle("Choose your Product Type");
        submit=(Button)view.findViewById(R.id.submit);
        cancel=(Button)view.findViewById(R.id.cancel);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });
        return view;
    }

}

