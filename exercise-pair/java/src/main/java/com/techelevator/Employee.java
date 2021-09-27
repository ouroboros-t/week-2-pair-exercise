package com.techelevator;

public class Employee {
    //PROPERTIES:
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private String hireDate;
    private double salary;

    //DERIVED PROPERTIES:
    public String getFullName() {
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

    //STATIC VARIABLE:
    public static final double SALARY_DEFAULT = 60000.00;
    //need to say "final" for this one;
    //because its a constant, has to be in ALL_CAPS_WITH_UNDERSCORES


    //CONSTRUCTOR(S):
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = SALARY_DEFAULT;

    }

    public Employee() {

    }

    //GETTERS AND SETTERS:
    public long getEmployeeID() {
        return this.employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //METHODS:
    public void raiseSalary(double percent) {
            double raisePercent = percent / 100.00;
            double salaryChange = this.salary * raisePercent;
             this.salary = this.salary + salaryChange;
    }



}
