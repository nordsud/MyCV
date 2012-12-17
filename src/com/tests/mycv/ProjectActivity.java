package com.tests.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.tests.adaptaters.ProjectAdapter;
import com.tests.models.Project;

public class ProjectActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project);
		
		
		Project projectArDrone = new Project();
		projectArDrone.set_projectName("Coopération Ar-Drone & Miabot");
		projectArDrone.set_projectDescription("Un robot aveugle au sol doit parcourir un terrain accidenté. Un drone volant repère le terrain, planifie une trajectoire et dirige par asservissement. Travail réalisé: Gestion du projet, programmation des moteur pour le déplacement du robot, récupération du flux vidéo et traitement en temps réel afin de récupérer la direction, le sens et retrouver le robot sur la carte.");
		projectArDrone.set_projectTeam(3);
		projectArDrone.set_projectStart("12/2010");
		projectArDrone.set_projectStop("04/2011");
		projectArDrone.set_projectOpportunity("M1 ISEN");
		projectArDrone.set_projectTechnologies("C, C++, OpenCV, Script");
		
		Project projectNewsletter = new Project();
		projectNewsletter.set_projectName("Gestion et suivi de newsletters");
		projectNewsletter.set_projectDescription("Les newsletters sont trop souvent envoyées sans analyser les résultats. Le solution permettait d'importer un fichier HTML, les liens étaient modifiés pour être traqués. Le système permettait de suivre les envois et ouvertures, analyser les clics et dessiner des statistiques");
		projectNewsletter.set_projectTeam(3);
		projectNewsletter.set_projectStart("11/2011");
		projectNewsletter.set_projectStop("02/2012");
		projectNewsletter.set_projectOpportunity("M2 ISEN");
		projectNewsletter.set_projectTechnologies("JEE, MAven, Hibernate, Mysql, HTML, CSS, ExtJS");
		
		Project projectWifiBot = new Project();
		projectWifiBot.set_projectName("Wifi-Bot");
		projectWifiBot.set_projectDescription("Le Wifi-Bot est un robot d'exploration muni d'une caméra, 4 roues motrices, un joystick pour le diriger et puce GPS. Développement de la partie GPS, récupération des trames, traitement, envoi des données dans l'IHM, suivi du tracé. Aide à l'analyse vidéo, récupération du flux traitement de l'image en temps réel");
		projectWifiBot.set_projectTeam(4);
		projectWifiBot.set_projectStart("12/2009");
		projectWifiBot.set_projectStop("05/2010");
		projectWifiBot.set_projectOpportunity("Projet Fin d'études BTS");
		projectWifiBot.set_projectTechnologies("C, C++, mysql, OpenCV, GPS");
		
		Project projectBE = new Project();
		projectBE.set_projectName("Bureau d'étude, informatisation d'un chaine hotelière");
		projectBE.set_projectDescription("Responsable équipe buisness, étude de marché, analyse de faisabilité, présentation de la solution, réalisation d'une pub, organisation des réunions");
		projectBE.set_projectTeam(10);
		projectBE.set_projectStart("10/2011");
		projectBE.set_projectStop("03/2012");
		projectBE.set_projectOpportunity("M2 ISEN");
		projectBE.set_projectTechnologies("Gant, 5P, SWOT, Adobe première");
		
		Project projectHellemmes = new Project();
		projectHellemmes.set_projectName("Site internet Hellemmes-le-cinema.com");
		projectHellemmes.set_projectDescription("Développement du site hellemmes-le-cinema.com et explication du fonctionnement.");
		projectHellemmes.set_projectTeam(1);
		projectHellemmes.set_projectStart("09/2012");
		projectHellemmes.set_projectStop("10/2012");
		projectHellemmes.set_projectOpportunity("Personnel");
		projectHellemmes.set_projectTechnologies("Mysql, PHP, HTML, CSS");
		
		Project projectLMCV = new Project();
		projectLMCV.set_projectName("Site internet LMCV.fr");
		projectLMCV.set_projectDescription("Réalisation d'un site wordpress pour le club de cinéma du LMCV, intégration de modules, paramétrage et formation des utilisateurs. ");
		projectLMCV.set_projectTeam(1);
		projectLMCV.set_projectStart("10/2012");
		projectLMCV.set_projectStop("11/2012");
		projectLMCV.set_projectOpportunity("Personnel");
		projectLMCV.set_projectTechnologies("Wordpress, Mysql, PHP, HTML, CSS, API Wordpress");
		
		
		Project projectJourDePeche = new Project();
		projectJourDePeche.set_projectName("Site internet Jour de pêche");
		projectJourDePeche.set_projectDescription("Recherche de design pour suivre avec le restaurant, développement FO et BO");
		projectJourDePeche.set_projectTeam(1);
		projectJourDePeche.set_projectStart("09/2011");
		projectJourDePeche.set_projectStop("11/2011");
		projectJourDePeche.set_projectOpportunity("Personnel");
		projectJourDePeche.set_projectTechnologies("HTML, CSS, Mysql");
		
		Project projectStoreStarzup = new Project();
		projectStoreStarzup.set_projectName("E-commerce Starzup");
		projectStoreStarzup.set_projectDescription("Installation, configuration et développement de la boutique. Maintennace du site et des produits");
		projectStoreStarzup.set_projectTeam(1);
		projectStoreStarzup.set_projectStart("10/2011");
		projectStoreStarzup.set_projectStop("08/2012");
		projectStoreStarzup.set_projectOpportunity("Starzup");
		projectStoreStarzup.set_projectTechnologies("Prestashop, Mysql, PHP, HTML, CSS, API Prestashop");
		
		Project projectWPStarzup = new Project();
		projectWPStarzup.set_projectName("Site vitrine Starzup");
		projectWPStarzup.set_projectDescription("Développement et maintenance du site de la marque, amélioration continue du code, intégration de plug-in");
		projectWPStarzup.set_projectTeam(1);
		projectWPStarzup.set_projectStart("04/2011");
		projectWPStarzup.set_projectStop("08/2012");
		projectWPStarzup.set_projectOpportunity("Starzup");
		projectWPStarzup.set_projectTechnologies("Wordpress, Mysql, PHP, HTML, CSS, API Wordpress");
		
		
		
		Project project_data[] = new Project[]
	    {
				projectArDrone, projectNewsletter ,projectStoreStarzup, projectWPStarzup, projectHellemmes, projectLMCV, projectJourDePeche, projectWifiBot 
	    };
		
		ProjectAdapter adapter = new ProjectAdapter(this, R.layout.listview_project_row, project_data);
        
        ((ListView)findViewById(R.id.lvProject)).setAdapter(adapter);
	}
}
