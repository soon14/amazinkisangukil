package com.example.gukil.azazinkisan.general.fragment.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.seller.categoryProduct;

/**
 * Created by Gukil on 01-03-2017.
 */

public class SellTab extends Fragment
{
    ViewGroup view;
    ImageView image;
    FragmentTransaction fragmentTransaction;
    int flag=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view= (ViewGroup) inflater.inflate(R.layout.sell_tab_fragment,container,false);
        image=(ImageView) view.findViewById(R.id.sell);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(flag==0) {
                    flag=1;
                    fragmentTransaction = getFragmentManager().beginTransaction();
                    categoryProduct particularProduct = new categoryProduct();
                    fragmentTransaction.replace(R.id.main_layout, particularProduct, "particularproduct");
                    fragmentTransaction.addToBackStack("particularProduct");
                    fragmentTransaction.commit();
                }
            }
        });
        return view;

    }

}
