package com.example.gukil.azazinkisan.general.fragment.buyer;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.activity.AmazinActivity;
import com.example.gukil.azazinkisan.Seller.RecyclerItemClickListener;
import com.example.gukil.azazinkisan.general.adapter.Data;
import com.example.gukil.azazinkisan.general.adapter.RecyclerGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ICAN on 05-03-2017.
 */

public class AllProduct extends Fragment
{

    public static int position;
    ViewGroup view;
    RecyclerView allProductRecyclerView;
    FragmentTransaction fragmentTransaction;
    public static List<Data> data;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState)
    {
        AmazinActivity.currentLayout="allProduct";
        view = (ViewGroup) inflater.inflate(R.layout.recyclerview, container, false);
        AmazinActivity.isAllProduct=true;
        allProductRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        data= fill_with_data();
        RecyclerGridViewAdapter item = new RecyclerGridViewAdapter(data, getContext(), getFragmentManager(),"allproduct");
        allProductRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        allProductRecyclerView.setNestedScrollingEnabled(false);
        allProductRecyclerView.setAdapter(item);
        allProductRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), allProductRecyclerView,new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position)
                    {
                        AmazinActivity.isAllProduct=false;
                        AllProduct.position=position;

                        AmazinActivity.isProductDetail =true;
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        PurchaseProduct purchaseProduct = new PurchaseProduct();
                        ProductDetail productDetail = new ProductDetail();
                        fragmentTransaction.replace(R.id.sell_activity_layout, purchaseProduct);
                        fragmentTransaction.replace(R.id.purchasemainlayout, productDetail, "productdetail");
                        fragmentTransaction.addToBackStack("productdetail");
                        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        fragmentTransaction.commit();
                        for(int entry = 0; entry < getFragmentManager().getBackStackEntryCount(); entry++){
                            Log.i("hello","Found fragment: " + getFragmentManager().getBackStackEntryAt(entry).getName());
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }

                    ));
        return view;
    }

    public List<Data> fill_with_data()
    {
            List<Data> data = new ArrayList<>();
            data.add(new Data("Tomato" ,R.drawable.tomato,"30/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Potato",R.drawable.potato,"20/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Bittergourd" ,R.drawable.bittergourd,"40/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Orange",R.drawable.orange1,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("strawberry" ,R.drawable.strawberry,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("cherry",R.drawable.cherry,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("pears" ,R.drawable.pears,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("pineapple",R.drawable.pineapple,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("poirewilliam" ,R.drawable.poirewilliam,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("walnut",R.drawable.walnut,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Tomato" ,R.drawable.tomato,"30/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Potato",R.drawable.potato,"20/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Bittergourd" ,R.drawable.bittergourd,"40/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("Orange",R.drawable.orange1,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("strawberry" ,R.drawable.strawberry,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("cherry",R.drawable.cherry,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("pears" ,R.drawable.pears,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("pineapple",R.drawable.pineapple,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("poirewilliam" ,R.drawable.poirewilliam,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));
            data.add(new Data("walnut",R.drawable.walnut,"300/Kg","500 Kg","Minimum qty should be purchased 120Kg"));


            return data;

    }
}
