package com.example.gukil.azazinkisan.general.fragment.seller;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gukil.azazinkisan.R;

/**
 * Created by ICAN on 16-03-2017.
 */

public class EWalletPayment extends DialogFragment
{
    public static EWalletPayment newInstance() {
        return new EWalletPayment();
    }
    View view;
    Button submit,cancel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)

    {
        view = inflater.inflate(R.layout.ewalletpaymentdetail, container, false);
        getDialog().setTitle("Choose your Product Type");
        submit=(Button)view.findViewById(R.id.submitwalletdetail);
        cancel=(Button)view.findViewById(R.id.cancelewallet);
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
