package com.example.gukil.azazinkisan.general.adapter;

/**
 * Created by Gukil on 10-02-2017.
 */

public class Data
{
    // Accept data from addAddess for Address recycler View
    public String pinclode,landmark,address,texthint,minorder, quantity, price,itemname,review,clientname,subTitle;
    public int ratingbarvalue,imageId;
    public String title, priceperunit,qtyavailable;
    public int image,subImage;
    public Data(String pincode, String landmark, String address)
    {
        this.pinclode=pincode;
        this.landmark=landmark;
        this.address=address;
    }
// Accept data from Group of items for items recycler view.
public Data(String title, int image)
 {
        this.title=title;
        this.image=image;
 }
    public Data(String name)
    {
        this.title=name;
    }
    public Data(String title, int image, String price, String qty, String texthint)

    {
        this.title=title;
        this.image=image;
        this.qtyavailable=qty;
        this.priceperunit=price;
        this.texthint=texthint;
    }
    public Data(String minorder, String quantity, String price, int ratingbar, int imageid, String itemname) {
        this.minorder = minorder;
        this.quantity = quantity;
        this.price = price;
        this.ratingbarvalue = ratingbar;
        this.imageId = imageid;
        this.itemname=itemname;

    }
    //Constructor for reviews
    public Data(String review, int imageid, int rating, String ClientName)
    {
        this.review=review;
        this.imageId=imageid;
        this.ratingbarvalue=rating;
        this.clientname=ClientName;

    }
    // constructor for sub category items Dialog Box

    public Data (int subImage,String subTitle)
    {
        this.subImage=subImage;
        this.subTitle=subTitle;
    }

}
