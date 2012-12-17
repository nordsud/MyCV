package com.tests.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Formation {
	private int _icon;
	private String _name;
	private String _school;
	private Date _start;
	private Date _stop;
	
	private String _speciality;
	
	public int get_icon() {
		return _icon;
	}
	
	public String get_name() {
		return _name;
	}

	public String get_school() {
		return _school;
	}

	public Date get_start() {
		return _start;
	}

	public String get_startString() {
		return (new SimpleDateFormat("yyyy", Locale.FRANCE)).format(_start);
	}
	
	public Date get_stop() {
		return _stop;
	}
	
	public String get_stopString() {
		return (new SimpleDateFormat("yyyy", Locale.FRANCE)).format(_stop);
	}

	public String get_speciality() {
		return _speciality;
	}

	public Formation(){
		super();
	}
			
	public Formation(String name, String school, int logo, String start, String stop, String speciality){
		super();
		this._name = name;
		this._icon = logo;
		this._school = school;
		this._speciality = speciality;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy", Locale.FRANCE);
	    try {
	        this._start = formatter.parse(start);
	        this._stop = formatter.parse(stop);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
	}
}
