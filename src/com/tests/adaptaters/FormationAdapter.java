package com.tests.adaptaters;

import com.tests.models.Formation;
import com.tests.mycv.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FormationAdapter extends ArrayAdapter<Formation>{

    Context context; 
    int layoutResourceId;    
    Formation data[] = null;
    
    public FormationAdapter(Context context, int layoutResourceId, Formation[] formation_data) {
        super(context, layoutResourceId, formation_data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = formation_data;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        FormationHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new FormationHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIconFormation);
            holder.txtTitle = (TextView)row.findViewById(R.id.tvTitleFormation);
            holder.txtDate = (TextView)row.findViewById(R.id.tvDateFormation);
            holder.txtDesc = (TextView)row.findViewById(R.id.tvDescFormation); 
            
            row.setTag(holder);
        }
        else
        {
            holder = (FormationHolder)row.getTag();
        }
        
        Formation aFormation = data[position];
        holder.txtTitle.setText(aFormation.get_name());
        holder.imgIcon.setImageResource(aFormation.get_icon());
        holder.txtDate.setText(aFormation.get_startString() + " - " + aFormation.get_stopString());
        holder.txtDesc.setText(aFormation.get_speciality());
        
        return row;
    }
    
    static class FormationHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtDate;
        TextView txtDesc;
    }
}
