package com.example.gukil.azazinkisan.general.other;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gukil.azazinkisan.general.fragment.buyer.AllProduct;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.MainFragment;
import com.example.gukil.azazinkisan.general.fragment.common.SellTab;
import com.example.gukil.azazinkisan.general.FirstPageFragment;
import com.example.gukil.azazinkisan.general.fragment.common.TabsFragment;


public class RegisterFragment extends Fragment
{
    ViewGroup View;

        FragmentTransaction fragmentTransaction;

    Button Register,Cancel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View=(ViewGroup)inflater.inflate(R.layout.fragment_registerfragment,container,false);
        Register=(Button)View.findViewById(R.id.Register);
        Cancel=(Button)View.findViewById(R.id.Cancel);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.d("error","comming");
                fragmentTransaction=getFragmentManager().beginTransaction();
                SellTab sellTab= new SellTab();
                MainFragment mainFragment= new MainFragment();
                TabsFragment tabsFragment= new TabsFragment();
                AllProduct allProduct= new AllProduct();
                fragmentTransaction.replace(R.id.activity_main_layout,sellTab);
                fragmentTransaction.replace(R.id. sell_activity_layout,tabsFragment);
                fragmentTransaction.replace(R.id.bottomtabsmainlayout,mainFragment);
                fragmentTransaction.replace(R.id.main_layout,allProduct,"allProductList");
                fragmentTransaction.addToBackStack("allproductList");
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                fragmentTransaction.commit();

            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction= getFragmentManager().beginTransaction();
                FirstPageFragment firstPageFragment= new FirstPageFragment();
                fragmentTransaction.replace(R.id.main_layout,firstPageFragment,"first_page_fragment");
                fragmentTransaction.addToBackStack("first_page_fragment");
                fragmentTransaction.commit();
                for(int entry = 0; entry < getFragmentManager().getBackStackEntryCount(); entry++){
                    Log.i("hello","Found fragment: " + getFragmentManager().getBackStackEntryAt(entry).getName());
                }

            }
        });
        return View;
    }

    }
