package com.example.gukil.azazinkisan.general.adapter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.gukil.azazinkisan.R;

import java.util.List;

/**
 * Created by Gukil on 01-03-2017.
 */

public class RecyclerGridViewAdapter extends  RecyclerView.Adapter<View_Holder_Particular_items> {

    List<Data> list;
    Context context;
    FragmentTransaction fragmentTransaction;
  static   String layout;

    public RecyclerGridViewAdapter(List<Data> list, Context context, FragmentManager fragmentManager,String layout) {
        this.list = list;
        this.context = context;
        this.fragmentTransaction=fragmentManager.beginTransaction();
        this.layout=layout;
    }

    @Override
    public View_Holder_Particular_items onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        View_Holder_Particular_items holder=null;
        switch (layout)
        {
            case "productcategory":

                v = LayoutInflater.from(context).inflate(R.layout.items, parent,false);
                holder  = new View_Holder_Particular_items(v);
                break;

            case"allproduct":
                v= LayoutInflater.from(context).inflate(R.layout.allproductlist, parent,false);
                holder = new View_Holder_Particular_items(v);
                break;
            case"similarproduct":
                v= LayoutInflater.from(context).inflate(R.layout.similar_products1, parent,false);
                holder = new View_Holder_Particular_items(v);
                break;
            case"review":
                v= LayoutInflater.from(context).inflate(R.layout.review, parent,false);
                holder = new View_Holder_Particular_items(v);
                break;
            case "subcategory":
                v= LayoutInflater.from(context).inflate(R.layout.choose_sub_category, parent,false);
                holder = new View_Holder_Particular_items(v);
                break;
        }


        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder_Particular_items holder, int position)
    {
        if(layout=="productcategory")
        {
        holder.info.setText(list.get(position).title.toString());
        holder.image.setImageResource(list.get(position).image);}
        if(layout=="allproduct")
        {
            holder.info.setText(list.get(position).title.toString());
            holder.image.setImageResource(list.get(position).image);
            holder.price.setText(list.get(position).priceperunit.toString());
            holder.qty.setText(list.get(position).qtyavailable.toString());
            holder.texthint.setText(list.get(position).texthint.toString());
        }
        if(layout=="similarproduct") {
            holder.quantity.setText(list.get(position).quantity.toString());
            holder.price.setText(list.get(position).price.toString());
            holder.ratingbar.setRating(list.get(position).ratingbarvalue);
            holder.image.setImageResource(list.get(position).imageId);
            holder.Itemname.setText(list.get(position).itemname.toString());
        }
        if(layout=="review") {
            holder.review.setText(list.get(position).review.toString());
            holder.clientname.setText(list.get(position).clientname.toString());
            holder.ratingbar.setRating(list.get(position).ratingbarvalue);
            holder.image.setImageResource(list.get(position).imageId);
        }
        if(layout=="subcategory")
        {
        holder.sub_image.setBackgroundResource(list.get(position).subImage);
         holder.sub_title.setText(list.get(position).subTitle.toString());
        }
    }

    @Override
    public int getItemCount() {

        return list.size();
    }
}



// View Holder for Address adapeter

class View_Holder_Particular_items extends RecyclerView.ViewHolder
{
    // CardView cv;
    TextView info,price,qty,texthint,quantity,Itemname,clientname,review,sub_title;
    RatingBar ratingbar;
   ImageView image,sub_image;




    public View_Holder_Particular_items(final View itemView)
    {
        super(itemView);
        //  cv = (CardView) itemView.findViewById(R.id.group_item_card);
        if(RecyclerGridViewAdapter.layout=="productcategory") {
            info = (TextView) itemView.findViewById(R.id.product_titile);
            image = (ImageView) itemView.findViewById(R.id.product_image);
        }
        if(RecyclerGridViewAdapter.layout=="allproduct")
        {
            info = (TextView) itemView.findViewById(R.id.product_titile);
            image=(ImageView) itemView.findViewById(R.id.product_image);

            price=(TextView)itemView.findViewById(R.id.priceperunit) ;
         qty=(TextView)itemView.findViewById(R.id.qtyavailable);
         texthint=(TextView)itemView.findViewById(R.id.minimumqty);
        }
        if(RecyclerGridViewAdapter.layout=="similarproduct")
        {
            image = (ImageView) itemView.findViewById(R.id.productimage);
            quantity = (TextView) itemView.findViewById(R.id.quantity_value);
            price = (TextView) itemView.findViewById(R.id.price);
            ratingbar = (RatingBar) itemView.findViewById(R.id.ratingBar);
            Itemname=(TextView)itemView.findViewById(R.id.itemname);
        }
        if(RecyclerGridViewAdapter.layout=="review") {
            ratingbar = (RatingBar) itemView.findViewById(R.id.Rating_client);
            clientname = (TextView) itemView.findViewById(R.id.ClientName);
            review = (TextView) itemView.findViewById(R.id.Review);
            image = (ImageView) itemView.findViewById(R.id.BuyerImage);
        }
        if(RecyclerGridViewAdapter.layout=="subcategory") {
           sub_title = (TextView) itemView.findViewById(R.id.sub_title);
           sub_image= (ImageView) itemView.findViewById(R.id.subproductimage);
        }

    }
}