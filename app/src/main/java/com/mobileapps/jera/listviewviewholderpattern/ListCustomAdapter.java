package com.mobileapps.jera.listviewviewholderpattern;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jera on 22/04/16.
 */
public class ListCustomAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] names;


    public ListCustomAdapter(Context context, String[] names) {
        super(context, R.layout.listitem, names);

        this.context = (Activity) context;
        this.names = names;
    }


    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        // reuse views
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.listitem, null);
            // configure view holder
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.textview1);
            viewHolder.image = (ImageView) rowView
                    .findViewById(R.id.imageview1);
            rowView.setTag(viewHolder);
        }


// fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        String s = names[position];
        holder.text.setText(s);

            holder.image.setImageResource(R.drawable.myimg);

        return rowView;
    }
}


