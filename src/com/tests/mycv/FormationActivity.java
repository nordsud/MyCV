package com.tests.mycv;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.tests.adaptaters.FormationAdapter;
import com.tests.models.Formation;

public class FormationActivity extends Activity {
	


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);
        
        
        Formation formation_data[] = new Formation[]
	    {
	        new Formation("Ingénieur Informatique", "ISEN Lille", R.drawable.logo_isen,"2009","2012","Informatique: Développement d'affaires et Conduite de projets"),
	        new Formation("BTS IRIS","Ozanam Lille",R.drawable.logo_ozanam, "2007","2009","Informatique pour les réseaux informatiques et les services techniques"),
			new Formation("BAC STI", "Ozanam Lille", R.drawable.logo_ozanam, "2005","2007","STI Electrotechnique")
	    };
        
        FormationAdapter adapter = new FormationAdapter(this, 
        		R.layout.listview_formation_row, formation_data);
        
        //Ajout de la liste de données à la listeview
        ((ListView)findViewById(R.id.lvFormations)).setAdapter(adapter);
        
        
    }
    
}


