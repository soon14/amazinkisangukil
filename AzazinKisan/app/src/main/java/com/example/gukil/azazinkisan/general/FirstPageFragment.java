package com.example.gukil.azazinkisan.general;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.other.Loginfragment;
import com.example.gukil.azazinkisan.general.other.RegisterFragment;

/**
 * Created by Gukil on 09-02-2017.
 */

public class FirstPageFragment extends Fragment implements View.OnClickListener {
    ViewGroup View;
    Button login,register;
    FragmentTransaction ft;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View=(ViewGroup)inflater.inflate(R.layout.firstpage_fragment,container,false);
        login=(Button)View.findViewById(R.id.Login);
        register=(Button) View.findViewById(R.id.Register);
        login.setOnClickListener(this);
        register.setOnClickListener(this);

        View.findViewById(R.id.login);

            return View ;
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.Login:

                ft= getFragmentManager().beginTransaction();
                Loginfragment Login = new Loginfragment();
                ft.replace(R.id.activity_main_layout,Login,"Login");
                ft.commit();

                break;
            case R.id.Register:

                ft= getFragmentManager().beginTransaction();
                RegisterFragment register = new RegisterFragment();
                ft.replace(R.id.activity_main_layout,register,"Register");
                ft.commit();
                break;
        }

    }
}
