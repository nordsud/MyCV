package com.tests.models;

public class Experience {
	


	public String get_enterpriseName() {
		return _experienceEnterpriseName;
	}

	public String get_experienceMission() {
		return _experienceMission;
	}

	public String get_experienceShortDesc() {
		return _experienceShortDesc;
	}

	public String get_experienceLongDesc() {
		return _experienceLongDesc;
	}

	public String get_experienceStart() {
		return _experienceStart;
	}

	public String get_experienceStop() {
		return _experienceStop;
	}


	public int get_experienceEnterpriseIcon() {
		return _experienceEnterpriseIcon;
	}

	public void set_experienceEnterpriseIcon(int _experienceEnterpriseIcon) {
		this._experienceEnterpriseIcon = _experienceEnterpriseIcon;
	}

	public void set_experienceEnterpriseName(String _experienceEnterpriseName) {
		this._experienceEnterpriseName = _experienceEnterpriseName;
	}

	public void set_experienceMission(String _experienceMission) {
		this._experienceMission = _experienceMission;
	}

	public void set_experienceShortDesc(String _experienceShortDesc) {
		this._experienceShortDesc = _experienceShortDesc;
	}

	public void set_experienceLongDesc(String _experienceLongDesc) {
		this._experienceLongDesc = _experienceLongDesc;
	}

	public void set_experienceStart(String _experienceStart) {
		this._experienceStart = _experienceStart;
	}

	public void set_experienceStop(String _experienceStop) {
		this._experienceStop = _experienceStop;
	}


	private int _experienceEnterpriseIcon;
	private String _experienceEnterpriseName;
	private String _experienceMission;
	private String _experienceShortDesc;
	private String _experienceLongDesc;
	private String _experienceStart;
	private String _experienceStop;
	
	public Experience(){
		super();
	}
			
	public Experience(String name, int logo, String mission, String shortDesc, String longDesc, String start, String stop){
		super();
		this._experienceEnterpriseName = name;
		this._experienceEnterpriseIcon = logo;
		this._experienceMission = mission;
		this._experienceShortDesc = shortDesc;
		this._experienceLongDesc = longDesc;
		this._experienceStart = start;
		this._experienceStop = stop;
	}
}
