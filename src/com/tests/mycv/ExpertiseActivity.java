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
			        new Expertise("Esprit et conduite agile", "M�thodes",3, "Sensibilisation � l'ISEN, Mise en pratique stage EFIDEV, Pr�sence sur les AgileTours, Suivi et formation des �tudiants"),
			        new Expertise("Cadre Scrum", "M�thodes",4, "Sensibilisation � l'ISEN, Mise en pratique stage EFIDEV, Pr�sence sur les AgileTours, Suivi et formation des �tudiants"),
			        new Expertise("Kanban", "M�thodes",3, "Sensibilisation � l'ISEN, Mise en pratique stage EFIDEV, Suivi de retour d'exp�rience lors de conf�rences"),
			        new Expertise("Planning Poker", "M�thodes",5, "Sensibilisation � l'ISEN, Mise en pratique stage EFIDEV, Accompagnement des bureaux d'�tudes ISEN"),
			        new Expertise("Cycle en V", "M�thodes",2, "Sensibilisation � l'ISEN, Mise en pratique stage � l'A�roport de Lille, utilisation lors des projets ISEN"),
			        new Expertise("Fonctionnement des sites E-commerce", "M�thodes",3, "Utilisation, maintenance et suivi des ventes sur la boutique Starzup"),
			        
			        new Expertise("JEE", "Langages",4, "Apprentissage � l'ISEN durant tout le cycle Majeur, Mise en pratique sur plusieurs projets (outil de gestion de newsletters et micro-Inkscape) "),
			        new Expertise("C", "Langages",2, "Apprentissage � l'ISEN  et en BTS"),
			        new Expertise("C++", "Langages",3, "Apprentissage � l'ISEN  et en BTS, r�alisation projet WiFi-Bot"),
			        new Expertise("C#", "Langages",3, "Apprentissage en BTS, Mise en pratique � l'a�roport de Lille"),
			        new Expertise("Shell", "Langages",3, "Apprentissage en BTS, � l'ISEN et en auto-formation, Mise en place de serveurs perso et pour Starzup"),
			        new Expertise("MySql-PgSql-Oracle", "Langages",2, "Apprentissage en BTS et � l'ISEN, Utilisation personnelle + projets d'�tudes, utilisation d'oracle pour le stage � l'a�roport de Lille"),
			        new Expertise("PHP", "Langages",4, "Apprentissage en BTS, Auto-formation et r�alisation de plusieurs projets personnels"),
			        new Expertise("HTML5", "Langages",1, "Auto-formation, r�alisation de quelques projets personels"),
			        new Expertise("CSS3", "Langages",4, "Auto-formation, r�alisation de quelques projets personels"),
			        
			        new Expertise("Mac OS X", "Syst�mes",4, "Auto-formation, utilisation au quotidien"),
			        new Expertise("Linux", "Syst�mes",3, "Auto-formation + apprentissage ISEN + BTS, installation & param�trage serveurs, longue p�riode sous l'OS Ubuntu"),
			        new Expertise("Windows Desktop", "Syst�mes",3, "Auto-formation, utilisation r�guli�re"),
			        new Expertise("Windows 2003 server", "Syst�mes",1, "Auto-formation, courte exp�rimentation"),
			        
			        new Expertise("Joomla", "CMS",2, "R�alation d'un site en 2009"),
			        new Expertise("Prestashop", "CMS",4, "Auto-formation, R�alation compl�te de la boutique store-starzup.com 2012, correction de bugs sur certains plug-in"),
			        new Expertise("Wordpress", "CMS",3, "Auto-formation, TMA de starzup.com 2011-2012, mise en place d'un site associatif"),
			        
			        new Expertise("OpenCV", "Frameworks",4, "Apprentissage � l'ISEN, Mise en pratique sur le projet Ar-Drone Miabot"),
			        new Expertise("Symfony", "Frameworks",1, "Sensibilisation chez EFIDEV, But 2013 auto-formation Symfony 2"),
			        new Expertise("Hibernate", "Frameworks",1, "Vu en cours � l'ISEN, utilisation sur le projet newsletters"),
			        new Expertise("Maven", "Frameworks",1, "Vu en cours � l'ISEN, utilisation sur le projet newsletters"),
			        new Expertise("Bootstrap", "Frameworks",3, "Auto-formation et mise en place sur des projets personnels")
			        
			        
			    };
		
		ExpertiseAdapter adapter = new ExpertiseAdapter(this, 
        		R.layout.listview_expertise_row, expertise_data);
        
        
	
		
        ((ListView)findViewById(R.id.lvExpertise)).setAdapter(adapter);
		
	}

}
