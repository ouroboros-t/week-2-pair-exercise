package com.techelevator;

public class Department {
    //PROPERTIES OF THE CLASS:
    private int departmentID;
    private String name;
    //CONSTRUCTOR(S):
    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }
    //GETTERS AND SETTERS:
    public int getDepartmentID() {
        return this.departmentID;
    }
    public void setDepartmentID(int departmentID){
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
