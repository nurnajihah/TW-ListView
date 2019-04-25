package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private Context context;
    private ArrayList<Modules> modules;
    private TextView tvModuleName;
    private ImageView ivIcon;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects){
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvModuleName = rowView.findViewById(R.id.tvModuleName);
        ivIcon = rowView.findViewById(R.id.ivIcon);

        Modules currentModules = modules.get(position);

        tvModuleName.setText(currentModules.getName());
        if(currentModules.isIcon()){
            ivIcon.setImageResource(R.drawable.prog);
        }else{
            ivIcon.setImageResource(R.drawable.nonprog);
        }
        return rowView;
    }



}
