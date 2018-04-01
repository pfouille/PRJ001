package com.fouille.www;

public class Application {
	
	// class attributes
	
	private String Name;  
	private String Description;
	  
	// constructor
	
	public String toString() {
		return "Application [Name=" + Name + ", Description=" + Description + "]";
	}


	public Application(String name, String description) {
		super();
		Name = name;
		Description = description;
	}
	
	
	// getters & setters
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	

}
