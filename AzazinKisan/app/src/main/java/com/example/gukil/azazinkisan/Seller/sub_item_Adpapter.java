
package com.example.gukil.azazinkisan.Seller;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.adapter.Data;

import java.util.Collections;
import java.util.List;


public class sub_item_Adpapter extends  RecyclerView.Adapter<View_Holder_Sub_items>
{
        List<Data> list = Collections.emptyList();
        Context context;
        FragmentTransaction fragmentTransaction;
        public sub_item_Adpapter(List<Data> list, Context context, FragmentTransaction fragmentTransaction) {
            this.list = list;
            this.context = context;
            this.fragmentTransaction=fragmentTransaction;
        }

        @Override
        public View_Holder_Sub_items onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(context).inflate(R.layout.items, parent, false);
            View_Holder_Sub_items holder = new View_Holder_Sub_items(v);
            return holder;
        }


    @Override
        public void onBindViewHolder(View_Holder_Sub_items holder, int position) {
            holder.info.setText(list.get(position).title);
            holder.images.setImageResource(list.get(position).image);
        holder.images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }



// View Holder for Address adapeter

    class View_Holder_Sub_items extends RecyclerView.ViewHolder
    {
        CardView cv;
        TextView info;
        ImageView images;



            public View_Holder_Sub_items(View itemView) {
            super(itemView);

            info = (TextView) itemView.findViewById(R.id.product_titile);
            images=(ImageView)itemView.findViewById(R.id.product_image);

        }
    }




