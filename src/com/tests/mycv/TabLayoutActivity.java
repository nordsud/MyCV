package com.tests.mycv;




import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabLayoutActivity extends TabActivity {
	
	
	TabHost.TabSpec spec;  // Resusable TabSpec for each tab
    Intent intent;  // Reusable Intent for each tab
    
	private void createTabs(String tabName, Intent tabIntent, int tabIcon){
		TabHost tabHost = getTabHost();
		spec = tabHost.newTabSpec(tabName).setIndicator(tabName,
	    		getResources().getDrawable(tabIcon)) 
	    				.setContent(tabIntent);
	    tabHost.addTab(spec);
	}
	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        
        

	    createTabs("Formations", new Intent().setClass(this, FormationActivity.class),R.drawable.icon_formation_tab); 
	    createTabs("Experiences", new Intent().setClass(this, ExperienceActivity.class),R.drawable.icon_experience_tab);
	    createTabs("Expertises", new Intent().setClass(this, ExpertiseActivity.class),R.drawable.icon_expertise_tab);
	    createTabs("Projects", new Intent().setClass(this, ProjectActivity.class),R.drawable.icon_project_tab);
	    createTabs("Sports", new Intent().setClass(this, SportActivity.class),R.drawable.icon_sport_tab);
	    createTabs("Infos", new Intent().setClass(this, InfoActivity.class),R.drawable.icon_info_tab);
	    

    }
    
 
}