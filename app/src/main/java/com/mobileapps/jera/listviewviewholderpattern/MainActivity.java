package com.mobileapps.jera.listviewviewholderpattern;

import android.os.Bundle;

import android.app.ListActivity;

public class MainActivity extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);


        String[] values = new String[] { "uno", "dos", "tres", "cuatro", "cinc", "seis", "siete", "nueve" ,"diez"
                ,"once" ,"doce","trece","catorce","quince","dieciseis" ,"diecisiete" ,"dieciocho" ,"diecinueve" ,"veinte" ,
                "uno", "dos", "tres", "cuatro", "cinc", "seis", "siete", "nueve" ,"diez" };

        setListAdapter(new ListCustomAdapter(this, values));
    }


    }





