package com.tests.mycv;


import com.tests.adaptaters.ExpertiseAdapter;
import com.tests.models.Expertise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ExpertiseActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expertise);
	
		Expertise expertise_data[] = new Expertise[]
			    {
			        new Expertise("Esprit et conduite agile", "Méthodes",3, "Sensibilisation à l'ISEN, Mise en pratique stage EFIDEV, Présence sur les AgileTours, Suivi et formation des étudiants"),
			        new Expertise("Cadre Scrum", "Méthodes",4, "Sensibilisation à l'ISEN, Mise en pratique stage EFIDEV, Présence sur les AgileTours, Suivi et formation des étudiants"),
			        new Expertise("Kanban", "Méthodes",3, "Sensibilisation à l'ISEN, Mise en pratique stage EFIDEV, Suivi de retour d'expérience lors de conférences"),
			        new Expertise("Planning Poker", "Méthodes",5, "Sensibilisation à l'ISEN, Mise en pratique stage EFIDEV, Accompagnement des bureaux d'études ISEN"),
			        new Expertise("Cycle en V", "Méthodes",2, "Sensibilisation à l'ISEN, Mise en pratique stage à l'Aéroport de Lille, utilisation lors des projets ISEN"),
			        new Expertise("Fonctionnement des sites E-commerce", "Méthodes",3, "Utilisation, maintenance et suivi des ventes sur la boutique Starzup"),
			        
			        new Expertise("JEE", "Langages",4, "Apprentissage à l'ISEN durant tout le cycle Majeur, Mise en pratique sur plusieurs projets (outil de gestion de newsletters et micro-Inkscape) "),
			        new Expertise("C", "Langages",2, "Apprentissage à l'ISEN  et en BTS"),
			        new Expertise("C++", "Langages",3, "Apprentissage à l'ISEN  et en BTS, réalisation projet WiFi-Bot"),
			        new Expertise("C#", "Langages",3, "Apprentissage en BTS, Mise en pratique à l'aéroport de Lille"),
			        new Expertise("Shell", "Langages",3, "Apprentissage en BTS, à l'ISEN et en auto-formation, Mise en place de serveurs perso et pour Starzup"),
			        new Expertise("MySql-PgSql-Oracle", "Langages",2, "Apprentissage en BTS et à l'ISEN, Utilisation personnelle + projets d'études, utilisation d'oracle pour le stage à l'aéroport de Lille"),
			        new Expertise("PHP", "Langages",4, "Apprentissage en BTS, Auto-formation et réalisation de plusieurs projets personnels"),
			        new Expertise("HTML5", "Langages",1, "Auto-formation, réalisation de quelques projets personels"),
			        new Expertise("CSS3", "Langages",4, "Auto-formation, réalisation de quelques projets personels"),
			        
			        new Expertise("Mac OS X", "Systèmes",4, "Auto-formation, utilisation au quotidien"),
			        new Expertise("Linux", "Systèmes",3, "Auto-formation + apprentissage ISEN + BTS, installation & paramètrage serveurs, longue période sous l'OS Ubuntu"),
			        new Expertise("Windows Desktop", "Systèmes",3, "Auto-formation, utilisation régulière"),
			        new Expertise("Windows 2003 server", "Systèmes",1, "Auto-formation, courte expérimentation"),
			        
			        new Expertise("Joomla", "CMS",2, "Réalation d'un site en 2009"),
			        new Expertise("Prestashop", "CMS",4, "Auto-formation, Réalation complète de la boutique store-starzup.com 2012, correction de bugs sur certains plug-in"),
			        new Expertise("Wordpress", "CMS",3, "Auto-formation, TMA de starzup.com 2011-2012, mise en place d'un site associatif"),
			        
			        new Expertise("OpenCV", "Frameworks",4, "Apprentissage à l'ISEN, Mise en pratique sur le projet Ar-Drone Miabot"),
			        new Expertise("Symfony", "Frameworks",1, "Sensibilisation chez EFIDEV, But 2013 auto-formation Symfony 2"),
			        new Expertise("Hibernate", "Frameworks",1, "Vu en cours à l'ISEN, utilisation sur le projet newsletters"),
			        new Expertise("Maven", "Frameworks",1, "Vu en cours à l'ISEN, utilisation sur le projet newsletters"),
			        new Expertise("Bootstrap", "Frameworks",3, "Auto-formation et mise en place sur des projets personnels")
			        
			        
			    };
		
		ExpertiseAdapter adapter = new ExpertiseAdapter(this, 
        		R.layout.listview_expertise_row, expertise_data);
        
        
	
		
        ((ListView)findViewById(R.id.lvExpertise)).setAdapter(adapter);
		
	}

}
