package com.tests.mycv;

import java.util.ArrayList;

import com.tests.adaptaters.SportAdapter;
import com.tests.models.Sport;

import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;

public class SportActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sport);
		
		ArrayList<String> rewardsHB = new ArrayList<String>();
		rewardsHB.add("Champion de France 2004");
		rewardsHB.add("Vice champion de France 2009");
		Sport sport_data[] = new Sport[]
			    {
					new Sport("Horse Ball", rewardsHB, 12),   
			        new Sport("Squash", 1),
			        new Sport("Course à pied & VTT", 2),
			        new Sport("Snowboard", 8)
			    };
		
		SportAdapter adapter = new SportAdapter(this, 
        		R.layout.listview_sport_row, sport_data);
        
        //Ajout de la liste de données à la listeview
        ((ListView)findViewById(R.id.lvSports)).setAdapter(adapter);
	}


}
