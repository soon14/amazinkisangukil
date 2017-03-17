package com.example.gukil.azazinkisan.general.fragment.buyer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.activity.AmazinActivity;

/**
 * Created by ICAN on 06-03-2017.
 */

public class PurchaseProduct extends Fragment {
    ViewGroup view;
    Button addToCart,buyNow;
    FragmentTransaction fragmentTransaction;

    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInsatnce)
    {
        view=(ViewGroup)inflater.inflate(R.layout.purchaseproduct,container,false);
        addToCart=(Button)view.findViewById(R.id.cart);
        buyNow=(Button)view.findViewById(R.id.buynow);
        buyNow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                AmazinActivity.isBuyClicked=true;

                fragmentTransaction=getFragmentManager().beginTransaction();
                ProceedToPurchase proceedToPurchase = new ProceedToPurchase();
                fragmentTransaction.replace(R.id.activity_main_layout,proceedToPurchase,"Proceed to Purchase");
                fragmentTransaction.addToBackStack("purchaseproduct");
                for(int entry = 0; entry < getFragmentManager().getBackStackEntryCount(); entry++){
                    Log.i("hello","Found fragment: " + getFragmentManager().getBackStackEntryAt(entry).getName());
                }
                fragmentTransaction.commit();

            }
        });
        return  view;

    }
}

