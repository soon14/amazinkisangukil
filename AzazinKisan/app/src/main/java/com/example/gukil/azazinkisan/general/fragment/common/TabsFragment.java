package com.example.gukil.azazinkisan.general.fragment.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gukil.azazinkisan.R;

/**
 * Created by Gukil on 27-02-2017.
 */

public class TabsFragment extends Fragment
{

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
   {     view=(View)inflater.inflate(R.layout.botttomtabs,container,false);

        return view;
    }
    public void  changeVisibilty()
    {
     /*   if(view.findViewById(R.id.bottomtabs).isShown())
        {
                    view.findViewById(R.id.bottomtabs).setVisibility(View.GONE);
        }*/
    }}
