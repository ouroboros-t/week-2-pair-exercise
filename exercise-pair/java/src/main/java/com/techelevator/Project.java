package com.techelevator;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Project {

// Class Properties
    private String name;
        private String description;
        private String startDate;
        private String dueDate;
        private List<Employee> teamMembers = new ArrayList<Employee>();
    //Derived Properties
    //Constructors
    public Project(String name, String description, String startDate, String dueDate) {
         this.name = name;
         this.description = description;
         this.startDate = startDate;
         this.dueDate = dueDate;


    }
    //Getters Setters
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getStartDate(){
        return this.startDate;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public List<Employee> getTeamMembers(){
        return this.teamMembers;
    }
    // Methods





}
