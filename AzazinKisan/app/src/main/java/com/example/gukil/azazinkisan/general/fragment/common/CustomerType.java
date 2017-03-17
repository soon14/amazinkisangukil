package com.example.gukil.azazinkisan.general.fragment.common;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.Seller.Group_of_Items;


public class CustomerType extends Fragment  {

    ViewGroup view;
    CardView seller,buyer;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)

    {
            view=(ViewGroup)inflater.inflate(R.layout.customertype,container,false);
            seller=(CardView)view.findViewById(R.id.seller);
            buyer=(CardView)view.findViewById(R.id.buyer);
            seller.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fragmentTransaction=getFragmentManager().beginTransaction();
                    Group_of_Items gp= new Group_of_Items();
                    TabsFragment tab= new TabsFragment();
                    fragmentTransaction.replace(R.id.main_layout,gp,"group of items");

                    fragmentTransaction.addToBackStack("group of items");
                    fragmentTransaction.commit();
                }
            });
        buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction=getFragmentManager().beginTransaction();
                Group_of_Items gp= new Group_of_Items();
                TabsFragment tab= new TabsFragment();
                fragmentTransaction.replace(R.id.main_layout,gp,"group of items");
                fragmentTransaction.addToBackStack("group of items");

                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
