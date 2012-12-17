package com.tests.adaptaters;

import com.tests.models.Experience;
import com.tests.mycv.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ExperienceAdapter extends ArrayAdapter<Experience>{

    Context context; 
    int layoutResourceId;    
    Experience data[] = null;
    
    public ExperienceAdapter(Context context, int layoutResourceId, Experience[] experience_data) {
        super(context, layoutResourceId, experience_data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = experience_data;
    }
    
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ExperienceHolder holder = null;
        
        // Line Configuration with TextView and ImageView
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ExperienceHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIconExperience);
            holder.txtEnterpriseName = (TextView)row.findViewById(R.id.tvEnterpriseName);
            holder.txtDate = (TextView)row.findViewById(R.id.tvDateExperience);
            
            holder.txtMission = (TextView)row.findViewById(R.id.tvMissionExperience);
            holder.txtShortDescription = (TextView)row.findViewById(R.id.tvDescExperience); 
            
            row.setTag(holder);
        }
        else
        {
            holder = (ExperienceHolder)row.getTag();
        }
        
        Experience aExperience = data[position];
        holder.imgIcon.setImageResource(aExperience.get_experienceEnterpriseIcon());
        holder.txtEnterpriseName.setText(aExperience.get_enterpriseName());
        holder.txtDate.setText(aExperience.get_experienceStart() + " - " + aExperience.get_experienceStop());
        holder.txtMission.setText(aExperience.get_experienceMission());
        holder.txtShortDescription.setText(aExperience.get_experienceShortDesc());
        
        return row;
    }
    
    
    static class ExperienceHolder
    {
        ImageView imgIcon;
        TextView txtEnterpriseName;
        TextView txtDate;
        TextView txtShortDescription;
        TextView txtMission;
    }
    
   
}
