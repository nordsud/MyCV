package com.tests.adaptaters;

import com.tests.models.Project;
import com.tests.mycv.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ProjectAdapter extends ArrayAdapter<Project>{

    Context context; 
    int layoutResourceId;    
    Project data[] = null;
    
    public ProjectAdapter(Context context, int layoutResourceId, Project[] project_data) {
        super(context, layoutResourceId, project_data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = project_data;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ProjectHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ProjectHolder();
            holder.txtName = (TextView)row.findViewById(R.id.tvProjectName);
            holder.txtOpportunity = (TextView)row.findViewById(R.id.tvProjectOpportunity);
            holder.txtTeam = (TextView)row.findViewById(R.id.tvProjectTeam);
            holder.txtDate = (TextView)row.findViewById(R.id.tvProjectDate);
            holder.txtDesc = (TextView)row.findViewById(R.id.tvProjectDescription);
            holder.txtTechno = (TextView)row.findViewById(R.id.tvProjectTechnologies);
            
            row.setTag(holder);
        }
        else
        {
            holder = (ProjectHolder)row.getTag();
        }
        
        Project aProject = data[position];
        holder.txtName.setText(aProject.get_projectName());
        holder.txtTeam.setText("Nombre de personne(s): "+Integer.toString(aProject.get_projectTeam()));
        holder.txtDate.setText(aProject.get_projectStartString() + " - " + aProject.get_projectStopString());
        holder.txtOpportunity.setText(aProject.get_projectOpportunity());
        holder.txtDesc.setText(aProject.get_projectDescription());
        holder.txtTechno.setText("Technologies: "+aProject.get_projectTechnologies());
        
        return row;
    }
    
    static class ProjectHolder
    {
        TextView txtName;
        TextView txtOpportunity;
        TextView txtTeam;
        TextView txtDate;
        TextView txtDesc;
        TextView txtTechno;
    }
}
