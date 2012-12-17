package com.tests.mycv;



import java.text.SimpleDateFormat;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.tests.models.Info;

public class InfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		

	     
		Info myInfoCard = new Info();
	    myInfoCard.set_infoFirstName("Nelson");
	    myInfoCard.set_infoLastName("Dufossé");
	    myInfoCard.set_infoPicture(R.drawable.nelson_picture);
	    myInfoCard.set_infoBirthday("06/05/1989");
	    myInfoCard.set_infoPhoneNumber("0686042659");
	    myInfoCard.set_infoStreetPostalAdress("58 Clos Du Bel Air");
	    myInfoCard.set_infoCityPostalAdress("RONCHIN");
	    myInfoCard.set_infoCodePostalAdress("59790");
	    myInfoCard.set_infoEmail("nelson.dufosse@isen-lille.fr");
	    myInfoCard.set_infoSkype("nelson.dufosse");
	    myInfoCard.set_infoTwitter("nelson_dufosse");
	    myInfoCard.set_infoViadeo("http://fr.viadeo.com/fr/profile/nelson.dufossse");
	    myInfoCard.set_infoDrivingLicence("B");
	    myInfoCard.set_infoHasACars(true);
	     
	    
	    
	     ((ImageView)findViewById(R.id.imgInfoPicture)).setImageResource(myInfoCard.get_infoPicture());
	     ((TextView) findViewById(R.id.tvInfoFirstName)).setText(myInfoCard.get_infoFirstName());
	     ((TextView) findViewById(R.id.tvInfoLastName)).setText(myInfoCard.get_infoLastName());
	     ((TextView) findViewById(R.id.tvInfoBirthday)).setText(myInfoCard.get_infoBirthdayString());
	     ((TextView) findViewById(R.id.tvInfoStreetPostalAdress)).setText(myInfoCard.get_infoStreetPostalAdress());
	     ((TextView) findViewById(R.id.tvInfoCityPostalAdress)).setText(myInfoCard.get_infoCityPostalAdress());
	     ((TextView) findViewById(R.id.tvInfoCodePostalAdress)).setText(myInfoCard.get_infoCodePostalAdress());
	     ((TextView) findViewById(R.id.tvInfoEmail)).setText(myInfoCard.get_infoEmail());
	     ((TextView) findViewById(R.id.tvInfoPhoneNumber)).setText(myInfoCard.get_infoPhoneNumber());
	     ((TextView) findViewById(R.id.tvInfoSkype)).setText(myInfoCard.get_infoSkype());
	     ((TextView) findViewById(R.id.tvInfoTwitter)).setText(myInfoCard.get_infoTwitter());
	     ((TextView) findViewById(R.id.tvInfoViadeo)).setText(myInfoCard.get_infoViadeo());
	     ((TextView) findViewById(R.id.tvInfoCar)).setText("Permis " + myInfoCard.get_infoDrivingLicence() + ((myInfoCard.is_infoHasACars())?" + Voiture":" sans Voiture"));
	     
	}
}

