package com.tests.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.tests.adaptaters.ExperienceAdapter;
import com.tests.models.Experience;

public class ExperienceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_experience);
		
		
		Experience expEfidev = new Experience();
		Experience expSogarel = new Experience();
		Experience expCriUniv = new Experience();
		Experience expStarzup = new Experience();
		Experience expJourDePeche = new Experience();
		Experience expKartell = new Experience();
		
		
		expEfidev.set_experienceEnterpriseIcon(R.drawable.logo_efidev);
		expEfidev.set_experienceEnterpriseName("EFIDEV");
		expEfidev.set_experienceMission("Développeur & Ingénieur d'affaires");
		expEfidev.set_experienceShortDesc("Développement et Refactoring de legacy code & Développement du porte feuille clients");
		expEfidev.set_experienceStart("Mars 2012");
		expEfidev.set_experienceStop("Septembre 2012");
		
		expSogarel.set_experienceEnterpriseIcon(R.drawable.logo_aeroport);
		expSogarel.set_experienceEnterpriseName("SOGAREL");
		expSogarel.set_experienceMission("Développeur C#");
		expSogarel.set_experienceShortDesc("Etude des besoins, écriture cahier des charges, analyse de faisabilité, développement, mise en production");
		expSogarel.set_experienceLongDesc("Afin d'améliorer la qualité de service de l'aéroport de Lille, la sogarel (gestionnaire de l'aéroport) a souhaité mettre en place un système permettant de suivre le déchargement des bagages. Un écran tactile a été utilisé pour permettre aux agents de pistes de choisir un vol, indiquer le début et la fin d'un déchargement. Le premier objectif était de communiquer l'état de livraison en salle d'arrivée, le second était de pouvoir faire des statistiques sur la rapidité des déchargements selon les critères du vol (nombre de personnes, provenance, lieu de stationnement de l'avion etc.). Ce projet s'inscrit dans un process d'amélioration continue");
		expSogarel.set_experienceStart("Mai 2011");
		expSogarel.set_experienceStop("Aout 2011");
		
		expCriUniv.set_experienceEnterpriseIcon(R.drawable.logo_univlille1);
		expCriUniv.set_experienceEnterpriseName("CRI Univ Lille 1");
		expCriUniv.set_experienceMission("Intégrateur d'un portail captif");
		expCriUniv.set_experienceShortDesc("R&D Portails captifs, compréhension des réseaux, paramétrage switch niveau 3 cisco, utilisation des vlans");
		expCriUniv.set_experienceLongDesc("En 2009 le CRI (Centre de ressources informatiques) de l'université de Lille 1 souhaitait mettre en place un accès Wi-Fi pour toute personne inscrite sur l'annuaire LDAP (en l'occurence étudiants, professeurs, intervenants etc.). Ce système se devait également sécuritaire et évolutif. Le portail captif mis en place reposait sur la solution Pf-Sense. Une fois l'utilisateur connecté au Wi-Fi, il peut saisir son identifiant et mot de passe sur l'interface web, le système vérifie l'identité puis lui attribut une configuration réseau. La plateforme utilisait les protocoles et services suivants: SNMP avec Cacti, Squid + SquidGuard, Radius, LDAP, DHCP, DNS");
		expCriUniv.set_experienceStart("Mai 2009");
		expCriUniv.set_experienceStop("Juin 2009");
		
		expStarzup.set_experienceEnterpriseIcon(R.drawable.logo_starzup);
		expStarzup.set_experienceEnterpriseName("STARZUP");
		expStarzup.set_experienceMission("Resp. informatique & communication");
		expStarzup.set_experienceShortDesc("Création et gestion des newsletters, mise en place d'une boutique e-commerce, TMA sous wordpress du site vitrine, gestion du serveur de fichiers et versions");
		expStarzup.set_experienceLongDesc("Starzup est une start-up qui design et fabrique des textiles innovants pour l'équitation. Marketing: Création de catalogues, PLV, flyers. E-Marketing: Création des newsletters, gestion des campagnes, utilisation de Mailchimp. Informatique: Création complète du site E-commerce + développement spécifique, Développement et amélioration du site vitrine sous Wordpress, Mise en place d'un serveur de fichiers avec versionning (Debian + GIT), maintenance des ordinateurs");
		expStarzup.set_experienceStart("Aout 2010");
		expStarzup.set_experienceStop("Aout 2012");
		
		expJourDePeche.set_experienceEnterpriseIcon(R.drawable.logo_jourdepeche);
		expJourDePeche.set_experienceEnterpriseName("Jour De Pêche");
		expJourDePeche.set_experienceMission("Employé de salle");
		expJourDePeche.set_experienceShortDesc("Restaurant grastronomique, accueil des clients");
		expJourDePeche.set_experienceLongDesc("L'accueil, le service et la gestion du stress sont trois compétences nécessaires pour bien recevoir les clients. Explication et présentation des plats, conseils d'accompagnement, écoute du client et du chef");
		expJourDePeche.set_experienceStart("Mai 2010");
		expJourDePeche.set_experienceStop("Aout 2011");
		
		expJourDePeche.set_experienceEnterpriseIcon(R.drawable.logo_kartell);
		expJourDePeche.set_experienceEnterpriseName("Kartell");
		expJourDePeche.set_experienceMission("Vendeur de mobiliers contemporains");
		expJourDePeche.set_experienceShortDesc("Accueil des clients, écoute et conseil");
		expJourDePeche.set_experienceLongDesc("Kartell est un magasin de mobiliers contemporains du vieux lille. L'écoute, le conseil et la vente ont été des qualités utilisées.");
		expJourDePeche.set_experienceStart("Mai 2009");
		expJourDePeche.set_experienceStop("Juin 2010");
		
		Experience experience_data[] = new Experience[]
	    {
				expEfidev, expStarzup, expSogarel, expCriUniv, expJourDePeche, expKartell
	    };
		
		ExperienceAdapter adapter = new ExperienceAdapter(this, R.layout.listview_experience_row, experience_data);
        
        ((ListView)findViewById(R.id.lvExperience)).setAdapter(adapter);
	}
}
