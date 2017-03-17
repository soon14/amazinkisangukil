package com.example.gukil.azazinkisan.general.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.gukil.azazinkisan.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Gukil on 10-02-2017.
 */

public class AddressAdpater extends  RecyclerView.Adapter<View_Holder> {
    List<Data> list = Collections.emptyList();
    Context context;

    public AddressAdpater(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.addresses, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.landmark.setText(list.get(position).landmark);
        holder.Address.setText(list.get(position).address);
        holder.pincode.setText(list.get(position).pinclode);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}



// View Holder for Address adapeter

    class View_Holder extends RecyclerView.ViewHolder
    {
        CardView cv;
        TextView pincode,Address,landmark;
        RadioButton AddressButton;
        ImageButton button1,button2;



        public View_Holder(View itemView) {
            super(itemView);

            pincode = (TextView) itemView.findViewById(R.id.Pincode);
            Address=(TextView)itemView.findViewById(R.id.Address);
            landmark=(TextView)itemView.findViewById(R.id.Landmark);
            button1=(ImageButton)itemView.findViewById(R.id.deleteButton);
            button2=(ImageButton)itemView.findViewById(R.id.EditButton);
            AddressButton=(RadioButton)itemView.findViewById(R.id.addressradio);


        }
    }


