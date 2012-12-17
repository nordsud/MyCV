package com.tests.models;

public class Expertise {
	
	private String _expertiseName;
	private int _expertiseLevelOn5;
	private String _expertiseHowLearnt;
	private String _expertiseKindOfSkill;
	
			
	public String get_expertiseName() {
		return _expertiseName;
	}

	public int get_expertiseLevelOn5() {
		return _expertiseLevelOn5;
	}

	public String get_expertiseHowLearnt() {
		return _expertiseHowLearnt;
	}

	public String get_expertiseKindOfSkill() {
		return _expertiseKindOfSkill;
	}
	
	
	public Expertise(String name,  String kindOfSkill, int level, String how){
		//super();
		this._expertiseName = name;
		this._expertiseLevelOn5 = level;
		this._expertiseHowLearnt = how;
		this._expertiseKindOfSkill = kindOfSkill;
	}
}
