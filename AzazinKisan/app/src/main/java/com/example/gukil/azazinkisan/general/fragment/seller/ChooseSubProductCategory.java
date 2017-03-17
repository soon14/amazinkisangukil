package com.example.gukil.azazinkisan.general.fragment.seller;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.Seller.RecyclerItemClickListener;
import com.example.gukil.azazinkisan.general.adapter.Data;
import com.example.gukil.azazinkisan.general.adapter.RecyclerGridViewAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ICAN on 15-03-2017.
 */

public class ChooseSubProductCategory extends DialogFragment
{
    static ChooseSubProductCategory newInstance() {
        return new ChooseSubProductCategory();
    }
    RecyclerView subCategoryRecyclerView;
    View view;
    FragmentTransaction fragmentTransaction;
    public static List<Data> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        data= fill_with_data();
        view=inflater.inflate(R.layout.recyclerview,container,false);
        getDialog().setTitle("Choose your Product Type");

        RecyclerGridViewAdapter item = new RecyclerGridViewAdapter(data, getActivity(),getFragmentManager(),"subcategory");
        subCategoryRecyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);
        subCategoryRecyclerView.setBackgroundResource(R.drawable.background4);
        subCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        subCategoryRecyclerView.setAdapter(item);
        subCategoryRecyclerView.addOnItemTouchListener
                (
                new RecyclerItemClickListener(getContext(), subCategoryRecyclerView,new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        fragmentTransaction=getFragmentManager().beginTransaction();
                        SubmitProductDetail submitProductDetail= new SubmitProductDetail();
                        fragmentTransaction.replace(R.id.activity_main_layout,submitProductDetail,"submitproductdetail");
                        fragmentTransaction.addToBackStack("submitproductdetail");
                        fragmentTransaction.commit();
                        getDialog().dismiss();
                    }




                    @Override
                    public void onLongItemClick(View view, int position) {

                    }




                }));


        return view;
    }

    private List<Data> fill_with_data()
    {

        List<Data> data = new ArrayList<>();

        data.add(new Data( R.drawable.tomato,"Tomato"));
        data.add(new Data(R.drawable.potato,"Potato"));
        data.add(new Data(R.drawable.bittergourd,"Bittergourd"));
        data.add(new Data(R.drawable.orange1,"Orange"));
        data.add(new Data( R.drawable.strawberry,"strawberry"));
        data.add(new Data( R.drawable.tomato,"Tomato"));
        data.add(new Data(R.drawable.potato,"Potato"));
        data.add(new Data(R.drawable.bittergourd,"Bittergourd"));
        data.add(new Data(R.drawable.orange1,"Orange"));
        data.add(new Data( R.drawable.strawberry,"strawberry"));

        data.add(new Data( R.drawable.tomato,"Tomato"));
        data.add(new Data(R.drawable.potato,"Potato"));
        data.add(new Data(R.drawable.bittergourd,"Bittergourd"));
        data.add(new Data(R.drawable.orange1,"Orange"));
        data.add(new Data( R.drawable.strawberry,"strawberry"));
        data.add(new Data( R.drawable.tomato,"Tomato"));
        data.add(new Data(R.drawable.potato,"Potato"));
        data.add(new Data(R.drawable.bittergourd,"Bittergourd"));
        data.add(new Data(R.drawable.orange1,"Orange"));
        data.add(new Data( R.drawable.strawberry,"strawberry"));
        return data;
    }
}

