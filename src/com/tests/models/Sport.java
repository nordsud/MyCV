package com.tests.models;

import java.util.ArrayList;
import java.util.List;

public class Sport {
	
	private int _sportPeriode;
	private String _sportName;
	private List<String> _sportRewards = new ArrayList<String>();
	
	
	public int get_sportPeriode() {
		return _sportPeriode;
	}

	public String get_sportName() {
		return _sportName;
	}

	public List<String> get_sportRewards() {
		return _sportRewards;
	}
	
	public Sport(String name, List<String> reward, int periode){
		super();
		this._sportName = name;
		this._sportPeriode= periode;
		this._sportRewards = reward;
	}
	
	public Sport(String name, int periode){
		super();
		this._sportName = name;
		this._sportPeriode= periode;
	}
}
