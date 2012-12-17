package com.tests.adaptaters;

import com.tests.models.Sport;
import com.tests.mycv.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SportAdapter extends ArrayAdapter<Sport>{

    Context context; 
    int layoutResourceId;    
    Sport data[] = null;
    
    public SportAdapter(Context context, int layoutResourceId, Sport[] sport_data) {
        super(context, layoutResourceId, sport_data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = sport_data;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        SportHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new SportHolder();
            holder.txtName = (TextView)row.findViewById(R.id.tvSportName);
            holder.txtPeriode = (TextView)row.findViewById(R.id.tvSportPeriode);
            holder.txtRewards = (TextView)row.findViewById(R.id.tvSportRewards); 
            
            row.setTag(holder);
        }
        else
        {
            holder = (SportHolder)row.getTag();
        }
        
        Sport aSport = data[position];
        holder.txtName.setText(aSport.get_sportName());
        holder.txtPeriode.setText(Integer.toString(aSport.get_sportPeriode())+ " an(s)");
        if(!(aSport.get_sportRewards().isEmpty())){
        	String rewardText = "";
        	 for (int a = 0; a < aSport.get_sportRewards().size(); a++) {
                 rewardText += (aSport.get_sportRewards().get(a));
                 if(a%2 ==0) rewardText+=" \n";
             }
        	
        	holder.txtRewards.setText(rewardText);
        }
        return row;
    }
    
    static class SportHolder
    {
        TextView txtName;
        TextView txtPeriode;
        TextView txtRewards;
    }
}
