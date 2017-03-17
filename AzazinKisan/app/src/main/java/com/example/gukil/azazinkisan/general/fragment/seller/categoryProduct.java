package com.example.gukil.azazinkisan.general.fragment.seller;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.Seller.RecyclerItemClickListener;
import com.example.gukil.azazinkisan.general.adapter.Data;
import com.example.gukil.azazinkisan.general.adapter.RecyclerGridViewAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.example.gukil.azazinkisan.R.id.recyclerView;

/**
 * Created by Gukil on 01-03-2017.
 */

public class categoryProduct extends Fragment {
    ViewGroup view;
    public static int position;

    RecyclerView categoryProductRecycleview;

    public static  List<Data> data;
    @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
            view = (ViewGroup) inflater.inflate(R.layout.recyclerview, container, false);

        // recycler view
        categoryProductRecycleview = (RecyclerView) view.findViewById(recyclerView);
        data = fill_with_data();

        // Adapter

        RecyclerGridViewAdapter item = new RecyclerGridViewAdapter(data, getContext(), getFragmentManager(),"productcategory");
        categoryProductRecycleview.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        categoryProductRecycleview.setAdapter(item);
        categoryProductRecycleview.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), categoryProductRecycleview,new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        categoryProduct.position = position;
                        DialogFragment dialogFragment = ChooseSubProductCategory.newInstance();
                        dialogFragment.show(getFragmentManager(), "dialog");

                    }




                    @Override
                    public void onLongItemClick(View view, int position) {

                    }




        }));


//        categoryProductRecycleview.setOnScrollChangeListener(new View.OnScrollChangeListener()
//        {
//            @Override
//            public void onScrollChange(View view, int i, int i1, int i2, int i3)
//            {
//
//            }
//        });


        categoryProductRecycleview.setOnScrollListener(new RecyclerView.OnScrollListener() {
                                             @Override
                                             public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                                                 super.onScrollStateChanged(recyclerView, newState);


                                                 Snackbar.make(container,"StateChanged",Toast.LENGTH_LONG).show();

                                             }

                                         });




      /*   group_item_recycler_view.addOnItemTouchListener(
                 new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
                     @Override public void onItemClick(View view, int position) {

                         fragmentTransaction=getFragmentManager().beginTransaction();
                         Sub_Items subitems= new Sub_Items();
                         fragmentTransaction.replace(R.id.main_layout,subitems,"Sub  items");
                         fragmentTransaction.addToBackStack("Sub items");
                         fragmentTransaction.commit();
                     }
                 })
         );
*/
        return view;
    }

    public List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));
        data.add(new Data("vegetables" ,R.drawable.vegigroup));
        data.add(new Data("Fruits",R.drawable.fruitsgroup));
        data.add(new Data("Spices" ,R.drawable.spicesgroup));
        data.add(new Data(" Dry Fruits",R.drawable.dryfruit1));



        return data;

    }
}
