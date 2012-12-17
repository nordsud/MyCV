package com.tests.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.tests.mycv.R;


public class Info {
	private int _infoPicture;
	private String _infoFirstName;
	private String _infoLastName;
	
	private Date _infoBirthday;
	private String _infoStreetPostalAdress;
	private String _infoCityPostalAdress;
	private String _infoCodePostalAdress;
	private String _infoPhoneNumber;
	private String _infoEmail;
	private String _infoSkype;
	private String _infoTwitter;
	private String _infoViadeo;
	
	private String _infoDrivingLicence;
	private boolean _infoHasACars;
				
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
	
	public void set_infoPicture(int _infoPicture) {
		this._infoPicture = _infoPicture;
	}

	public void set_infoFirstName(String _infoFirstName) {
		this._infoFirstName = _infoFirstName;
	}

	public void set_infoLastName(String _infoLastName) {
		this._infoLastName = _infoLastName;
	}

	public void set_infoBirthday(String _infoBirthday) {
		try {
	        this._infoBirthday = formatter.parse(_infoBirthday);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}

	public void set_infoStreetPostalAdress(String _infoStreetPostalAdress) {
		this._infoStreetPostalAdress = _infoStreetPostalAdress;
	}

	public void set_infoCityPostalAdress(String _infoCityPostalAdress) {
		this._infoCityPostalAdress = _infoCityPostalAdress;
	}

	public void set_infoCodePostalAdress(String _infoCodePostalAdress) {
		this._infoCodePostalAdress = _infoCodePostalAdress;
	}

	public void set_infoPhoneNumber(String _infoPhoneNumber) {
		this._infoPhoneNumber = _infoPhoneNumber;
	}

	public void set_infoEmail(String _infoEmail) {
		this._infoEmail = _infoEmail;
	}

	public void set_infoSkype(String _infoSkype) {
		this._infoSkype = _infoSkype;
	}

	public void set_infoTwitter(String _infoTwitter) {
		this._infoTwitter = _infoTwitter;
	}

	public void set_infoViadeo(String _infoViadeo) {
		this._infoViadeo = _infoViadeo;
	}

	public void set_infoDrivingLicence(String _infoDrivingLicence) {
		this._infoDrivingLicence = _infoDrivingLicence;
	}

	public void set_infoHasACars(boolean _infoHasACars) {
		this._infoHasACars = _infoHasACars;
	}

	public int get_infoPicture() {
		return _infoPicture;
	}

	public String get_infoFirstName() {
		return _infoFirstName;
	}

	public String get_infoLastName() {
		return _infoLastName;
	}
	
	public Date get_infoBirthday() {
		return _infoBirthday;
	}
	public String get_infoBirthdayString() {
		return (new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE)).format(_infoBirthday);
	}
	
	public String get_infoStreetPostalAdress() {
		return _infoStreetPostalAdress;
	}

	public String get_infoCityPostalAdress() {
		return _infoCityPostalAdress;
	}

	public String get_infoCodePostalAdress() {
		return _infoCodePostalAdress;
	}

	public String get_infoPhoneNumber() {
		return _infoPhoneNumber;
	}

	public String get_infoEmail() {
		return _infoEmail;
	}

	public String get_infoSkype() {
		return _infoSkype;
	}

	public String get_infoTwitter() {
		return _infoTwitter;
	}

	public String get_infoViadeo() {
		return _infoViadeo;
	}

	public String get_infoDrivingLicence() {
		return _infoDrivingLicence;
	}

	public boolean is_infoHasACars() {
		return _infoHasACars;
	}

	public Info() {
		super();
		
	}

	

}
