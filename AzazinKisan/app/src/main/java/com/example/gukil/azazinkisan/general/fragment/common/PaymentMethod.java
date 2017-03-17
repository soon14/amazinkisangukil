package com.example.gukil.azazinkisan.general.fragment.common;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.seller.BankDetail;
import com.example.gukil.azazinkisan.general.fragment.seller.ChooseSubProductCategory;
import com.example.gukil.azazinkisan.general.fragment.seller.EWalletPayment;
import com.example.gukil.azazinkisan.general.fragment.seller.categoryProduct;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by ICAN on 09-03-2017.
 */

public class PaymentMethod extends Fragment implements View.OnClickListener

{
    ViewGroup view;
    DialogFragment dialogFragment;
    TextView viewmethods;
    HashMap<String,String> paymentMethod = new HashMap<>();
    CheckBox paytm,bankTransaction,freecharge,oxygen,citrus,statebank;
    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInsatnce) {

        view = (ViewGroup) inflater.inflate(R.layout.paymentmethod, container, false);
        paytm=(CheckBox)view.findViewById(R.id.paytm);
        bankTransaction =(CheckBox)view.findViewById(R.id.banktransaction);
        freecharge=(CheckBox)view.findViewById(R.id.freecharge);
        oxygen=(CheckBox)view.findViewById(R.id.oxygen);
        citrus=(CheckBox)view.findViewById(R.id.citrus);
        statebank=(CheckBox)view.findViewById(R.id.statebankbuddy);
        paytm.setOnClickListener(this);
        oxygen.setOnClickListener(this);
        statebank.setOnClickListener(this);
        citrus.setOnClickListener(this);
        freecharge.setOnClickListener(this);
        bankTransaction.setOnClickListener(this);

        return view;
        
    }
    @Override
    public void onClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.banktransaction:
                if (checked) {

                    dialogFragment  = BankDetail.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }

                break;

            case R.id.paytm:
                if (checked) {
                    dialogFragment  = EWalletPayment.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }

            break;

            case R.id.citrus:
                if (checked) {
                    dialogFragment  = EWalletPayment.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }

                break;
            case R.id.freecharge:
                if (checked) {
                    dialogFragment  = EWalletPayment.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }

                break;
            case R.id.statebankbuddy:
                if (checked) {
                    dialogFragment  = EWalletPayment.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }

                break;
            case R.id.oxygen:
                if (checked) {
                    dialogFragment  = EWalletPayment.newInstance();
                    dialogFragment.show(getFragmentManager(), "dialog");
                }
                break;



        }
    }
}
