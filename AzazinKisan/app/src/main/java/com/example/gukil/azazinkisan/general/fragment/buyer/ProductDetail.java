package com.example.gukil.azazinkisan.general.fragment.buyer;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gukil.azazinkisan.R;

/**
 * Created by ICAN on 06-03-2017.
 */

public class ProductDetail extends Fragment
{

    View view;
    ImageView productimage;
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = (ViewGroup) inflater.inflate(R.layout.productdetail, container, false);
        productimage=(ImageView) view.findViewById(R.id.productimage);
        productimage.setImageResource(AllProduct.data.get(AllProduct.position).image);
        return view;
    }
}
