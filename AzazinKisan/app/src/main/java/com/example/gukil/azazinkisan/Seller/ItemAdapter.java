package com.example.gukil.azazinkisan.Seller;

import android.content.Context;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Gukil on 13-02-2017.
 */

public class ItemAdapter extends  RecyclerView.Adapter<View_Holder_items> {

   List<Data> list;
   Context context;
    FragmentTransaction fragmentTransaction;
    SnapHelper snapHelper = new GravitySnapHelper(Gravity.LEFT);

    public ItemAdapter(List<Data> list, Context context, FragmentManager fragmentManager) {
        this.list = list;
        this.context = context;
        this.fragmentTransaction=fragmentManager.beginTransaction();


    }

    @Override
    public View_Holder_items onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(context).inflate(R.layout.group, parent,false);


        View_Holder_items holder = new View_Holder_items(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder_items holder, int position)
    {
        holder.info.setText(list.get(position).title.toString());
        holder.insiderView.setHasFixedSize(true);
        List <Data>  data= fill_data();
        holder.insiderView.setLayoutManager( new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,true));
        holder.insiderView.setAdapter(new sub_item_Adpapter(data,context,fragmentTransaction));

        snapHelper.attachToRecyclerView(holder.insiderView);
        holder.info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      PurchaseFragment pur= new PurchaseFragment();
                fragmentTransaction.replace(R.id.main_layout,pur,"PurchaseFragment");
                fragmentTransaction.addToBackStack("PurchaseFraagment");
                fragmentTransaction.commit();
*/
            }
        });
    }

    @Override
    public int getItemCount() {

        return list.size();
    }
    public List<Data> fill_data()
    {
        List <Data> data = new ArrayList<>();

        data.add(new Data("Fruits",R.drawable.orange1));
        data.add(new Data("Fruits",R.drawable.strawberry));

        data.add(new Data("Fruits",R.drawable.orange1));
        data.add(new Data("Fruits",R.drawable.strawberry));

        data.add(new Data("Fruits",R.drawable.orange1));
        data.add(new Data("Fruits",R.drawable.strawberry));


        return data;
    }
}



// View Holder for Address adapeter

class View_Holder_items extends RecyclerView.ViewHolder
{
   // CardView cv;
    TextView info;
    RecyclerView insiderView;



    public View_Holder_items(final View itemView)
    {
        super(itemView);
      //  cv = (CardView) itemView.findViewById(R.id.group_item_card);
       info = (TextView) itemView.findViewById(R.id.type);
        insiderView=(RecyclerView)itemView.findViewById(R.id.inner_recycler);


    }
}


