package com.tests.adaptaters;

import com.tests.models.Expertise;
import com.tests.mycv.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ExpertiseAdapter extends ArrayAdapter<Expertise>{

    Context context; 
    int layoutResourceId;    
    Expertise data[] = null;
    
    public ExpertiseAdapter(Context context, int layoutResourceId, Expertise[] expertise_data) {
        super(context, layoutResourceId, expertise_data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = expertise_data;
    }

    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ExpertiseHolder holder = null;
        
        // Line Configuration with TextView and ImageView
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ExpertiseHolder();
            holder.txtExpertiseName = (TextView)row.findViewById(R.id.tvExpertiseName);
            holder.txtExpertiseLevel = (TextView)row.findViewById(R.id.tvExpertiseLevel);
            holder.txtExpertiseHowLearnt = (TextView)row.findViewById(R.id.tvExpertiseHowlearnt);
            holder.txtExpertiseType = (TextView)row.findViewById(R.id.tvExpertiseType); 
            
            
            row.setTag(holder);
        }
        else
        {
            holder = (ExpertiseHolder)row.getTag();
        }
        
        Expertise aExpertise = data[position];
        holder.txtExpertiseName.setText(aExpertise.get_expertiseName());
        holder.txtExpertiseHowLearnt.setText(aExpertise.get_expertiseHowLearnt());
        holder.txtExpertiseLevel.setText(Integer.toString(aExpertise.get_expertiseLevelOn5())+"/5");
        holder.txtExpertiseType.setText(aExpertise.get_expertiseKindOfSkill());
        return row;
    }
    
    
    static class ExpertiseHolder
    {
        TextView txtExpertiseName;
        TextView txtExpertiseHowLearnt;
        TextView txtExpertiseLevel;
        TextView txtExpertiseType;
    } 
}
