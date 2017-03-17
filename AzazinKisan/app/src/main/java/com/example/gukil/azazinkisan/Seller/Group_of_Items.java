package com.example.gukil.azazinkisan.Seller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;

import java.util.ArrayList;
import java.util.List;

public class Group_of_Items extends Fragment
{

   RecyclerView group_item_recycler_view;


    ViewGroup view;
     @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    view=(ViewGroup)inflater.inflate(R.layout.recyclerview,container,false);
    group_item_recycler_view=(RecyclerView)view.findViewById(R.id.recyclerView);
    List<Data> data = fill_with_data();
    ItemAdapter Groups = new ItemAdapter(data,getContext(),getFragmentManager());
         group_item_recycler_view.setLayoutManager( new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,true));
         group_item_recycler_view.setAdapter(Groups);

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

    private List<Data> fill_with_data()
    {
        List<Data> data = new ArrayList<>();

        data.add(new Data("Fruits"));
        data.add(new Data("vegetables"));
        data.add(new Data("Species"));
        return data;
    }
}

