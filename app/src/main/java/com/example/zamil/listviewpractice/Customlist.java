package com.example.zamil.listviewpractice;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by zamil on 5/30/2015.
 */
public class Customlist extends ArrayAdapter{


    private final String imageName[];
    private final Integer imageId[];
    private final Context context;

    public Customlist(Activity context, Integer imageId[], String imageName[]){

        super(context, R.layout.listview,imageName);
        this.context = context;
        this.imageId = imageId;
        this.imageName = imageName;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View singleRow = inflator.inflate(R.layout.listview,null,true);

        TextView txt = (TextView) singleRow.findViewById(R.id.txtId);
        ImageView img = (ImageView) singleRow.findViewById(R.id.imgId);

        txt.setText(imageName[position]);
        img.setImageResource(imageId[position]);

        return singleRow;



    }


}
