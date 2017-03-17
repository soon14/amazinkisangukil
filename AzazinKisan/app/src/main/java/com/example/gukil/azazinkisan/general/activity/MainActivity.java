package com.example.gukil.azazinkisan.general.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.widget.Toast;
import com.example.gukil.azazinkisan.R;
import com.example.gukil.azazinkisan.general.fragment.buyer.AllProduct;
import com.example.gukil.azazinkisan.general.fragment.MainFragment;
import com.example.gukil.azazinkisan.general.fragment.common.SellTab;
import com.example.gukil.azazinkisan.general.fragment.common.TabsFragment;
import com.example.gukil.azazinkisan.general.FirstPageFragment;

public class MainActivity extends AmazinActivity
{
    boolean doubleBackToExitPressedOnce = false;

    public void onCreate(Bundle SavedInstance)
    {


        super.onCreate(SavedInstance);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        FirstPageFragment log= new FirstPageFragment();
        ft.add(R.id.activity_main_layout,log,"firstfragment");
        //ft.addToBackStack("firstfragmentss  ");
        ft.commit();
    }
   @Override
   public void onBackPressed()
   {
       switch(AmazinActivity.currentLayout)
       {
           case"allProduct":

               if (doubleBackToExitPressedOnce) {
               return;}

               this.doubleBackToExitPressedOnce = true;
               Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
               new Handler().postDelayed(new Runnable()
               {
                @Override
               public void run() {
                        doubleBackToExitPressedOnce = false;
                   }
               }, 2000);
           break;

            case "productcategory":

           break;

           case "productDetail":

           break;

           case "addToCart":

           break;

           case "purchase":

           break;
           case "":

           break;


       }


      if (AmazinActivity.isBuyClicked ||AmazinActivity.isProductDetail) {
          FragmentTransaction fragmentTransaction;
          AmazinActivity.isBuyClicked = false;
          AmazinActivity.isProductDetail = false;
          getFragmentManager().popBackStack(null, getFragmentManager().POP_BACK_STACK_INCLUSIVE);
          Log.e("count is", "" + getFragmentManager().getBackStackEntryCount());

          fragmentTransaction = getSupportFragmentManager().beginTransaction();
          SellTab sellTab = new SellTab();
          MainFragment mainFragment = new MainFragment();
          TabsFragment tabsFragment = new TabsFragment();
          AllProduct allProduct = new AllProduct();

          fragmentTransaction.replace(R.id.activity_main_layout, sellTab);
          fragmentTransaction.replace(R.id.sell_activity_layout, tabsFragment);
          fragmentTransaction.replace(R.id.bottomtabsmainlayout, mainFragment);
          fragmentTransaction.replace(R.id.main_layout, allProduct, "allProductList");

          fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
          fragmentTransaction.commit();
      }
       else
      {
          if (doubleBackToExitPressedOnce) {
              super.onBackPressed();
              return;
          }
      }


       this.doubleBackToExitPressedOnce = true;
       Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

       new Handler().postDelayed(new Runnable() {

           @Override
           public void run() {
               doubleBackToExitPressedOnce=false;
           }
       }, 2000);


   }

}




