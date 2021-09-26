package com.techelevator;

public class Employee {
    //PROPERTIES:
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    private String hireDate;

    //DERIVED PROPERTIES:
    public String getFullName() {
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

    //STATIC VARIABLE:
    private static double salary = 60000.00;

    //CONSTRUCTOR(S):
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;

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

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }
    //METHODS:
    public void raiseSalary(double percent) {
            double raisePercent = percent / 100.00;
            double salaryChange = salary * raisePercent;
            salary = salary + salaryChange;
    }



}
