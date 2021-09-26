package com.techelevator;

import javax.management.DescriptorAccess;
import java.util.ArrayList;
import java.util.List;

import static com.techelevator.Employee.salary;


public class Application {
    private List<Department> departments = new ArrayList<Department>();
    private List<Employee> employees = new ArrayList<Employee>();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }


    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!


        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department Marketing = new Department(1, "Marketing");
        Department Sales = new Department(2, "Sales");
        Department Engineering = new Department(3, "Engineering");

        departments.add(0, Marketing);
        departments.add(1, Sales);
        departments.add(2, Engineering);


    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            String departmentName = department.getName();
            System.out.println(departmentName);
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employeeDean = new Employee(1,"Dean", "Johnson","djohnson@teams.com", departments.get(2), "08/21/2020");
        Employee employeeAngie = new Employee(2,"Angie","Smith", "asmith@teams.com", departments.get(2),"08/21/2020");
        Employee employeeMargaret = new Employee(3,"Margaret", "Thompson", "mthompson@teams.com", departments.get(0),"08/21/2020");

        employees.add(0, employeeDean);
        employees.add(1,employeeAngie);
        employees.add(2, employeeMargaret);

        //Is this correct to be here? How do we differentiate a static variable?
//        employeeAngie.raiseSalary(10);
//        System.out.println(Employee.getSalary());

        //FIX THIS: All employees have Angie's salary :(

    }


    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for(Employee employeeInfo : employees) {
            String employee = employeeInfo.getFullName() +" " + Employee.getSalary() + " " + employeeInfo.getDepartment().getName();
            System.out.println(employee);
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
