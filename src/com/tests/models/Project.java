package com.tests.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Project {
	
	private String _projectName;
	private String _projectOpportunity;
	private int _projectTeam;
	private String _projectDescription;
	private String _projectActivity;
	private String _projectTechnologies;
	private Date _projectStart;
	private Date _projectStop;
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy", Locale.FRANCE);
	public Project(String projectName, String projectOpportunity, int projectTeam, String projectDescription, String projectActivity, String projectTechnologies, String projectStart, String projectStop) {
		super();
		this._projectName = projectName;
		this._projectOpportunity = projectOpportunity;
		this._projectTeam = projectTeam;
		this._projectDescription = projectDescription;
		this._projectActivity = projectActivity;
		this._projectTechnologies = projectTechnologies;
		
	    try {
	        this._projectStart = formatter.parse(projectStart);
	        this._projectStop = formatter.parse(projectStop);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public Project(){
		super();
	}
	

	public String get_projectName() {
		return _projectName;
	}


	public void set_projectName(String _projectName) {
		this._projectName = _projectName;
	}


	public String get_projectOpportunity() {
		return _projectOpportunity;
	}


	public void set_projectOpportunity(String _projectOpportunity) {
		this._projectOpportunity = _projectOpportunity;
	}


	public int get_projectTeam() {
		return _projectTeam;
	}


	public void set_projectTeam(int _projectTeam) {
		this._projectTeam = _projectTeam;
	}


	public String get_projectDescription() {
		return _projectDescription;
	}


	public void set_projectDescription(String _projectDescription) {
		this._projectDescription = _projectDescription;
	}


	public String get_projectActivity() {
		return _projectActivity;
	}


	public void set_projectActivity(String _projectActivity) {
		this._projectActivity = _projectActivity;
	}


	public String get_projectTechnologies() {
		return _projectTechnologies;
	}


	public void set_projectTechnologies(String _projectTechnologies) {
		this._projectTechnologies = _projectTechnologies;
	}

	public String get_projectStartString() {
		return (new SimpleDateFormat("MM/yyyy", Locale.FRANCE)).format(_projectStart);
	}
	
	public Date get_projectStart() {
		return _projectStart;
	}

	public void set_projectStart(String _projectStart) {
		try {
	        this._projectStart = formatter.parse(_projectStart);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void set_projectStart(Date _projectStart) {
		this._projectStart = _projectStart;
	}
	
	public String get_projectStopString() {
		return (new SimpleDateFormat("MM/yyyy", Locale.FRANCE)).format(_projectStop);
	}
	
	public Date get_projectStop() {
		return _projectStop;
	}

	public void set_projectStop(String _projectStop) {
		try {
	        this._projectStop = formatter.parse(_projectStop);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void set_projectStop(Date _projectStop) {
		this._projectStop = _projectStop;
	}
			

}
