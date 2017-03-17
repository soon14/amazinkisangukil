package com.example.gukil.azazinkisan.general.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gukil.azazinkisan.R;

import java.util.List;

/**
 * Created by Gukil on 28-02-2017.
 */

public class Header_RecyclerView_Adapter extends  RecyclerView.Adapter<View_Holder_header_items>
{
    List<Data> list;
    Context context;
    FragmentTransaction fragmentTransaction;

    public Header_RecyclerView_Adapter(List<Data> list, Context context, FragmentManager fragmentManager)
    {
        this.list = list;
        this.context = context;
        this.fragmentTransaction=fragmentManager.beginTransaction();
    }
@Override
    public View_Holder_header_items onCreateViewHolder(ViewGroup parent, int viewType)

    {
        View v = LayoutInflater.from(context).inflate(R.layout.header_item, parent,false);
        View_Holder_header_items holder = new View_Holder_header_items(v);
        return holder;
    }
 @Override
    public void onBindViewHolder(View_Holder_header_items holder, int position)

    {
        holder.info.setText(list.get(position).title.toString());
       holder.image.setBackgroundResource(list.get(position).image);
    }
 @Override
    public int getItemCount() {
        return list.size();
    }
}
// View Holder for Header _item Recycler Adapter
class View_Holder_header_items extends RecyclerView.ViewHolder
{

    TextView info;
   ImageView image;



    public View_Holder_header_items(final View itemView)
    {
        super(itemView);
        info = (TextView) itemView.findViewById(R.id.title_of_items);
        image=(ImageView) itemView.findViewById(R.id.item_image);


    }
}


