package com.techelevator;

import java.util.*;


public class Application {
    private List<Department> departments = new ArrayList<Department>();
    private List<Employee> employees = new ArrayList<Employee>();
    private Map<String, Project> projects = new HashMap<String, Project>();

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
        Employee employeeAngie = employees.get(1);
        employeeAngie.raiseSalary(10);

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
        Employee employeeDean = new Employee(1, "Dean", "Johnson", "djohnson@teams.com", departments.get(2), "08/21/2020");
        Employee employeeAngie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        Employee employeeMargaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");

        employees.add(0, employeeDean);
        employees.add(1, employeeAngie);
        employees.add(2, employeeMargaret);


    }


    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employeeInfo : employees) {
            String employee = employeeInfo.getFullName() + " " + employeeInfo.getSalary() + " " + employeeInfo.getDepartment().getName();
            System.out.println(employee);
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project managementSoftware = new Project("TEams", "Project management software", "10/10/2020", "11/10/2020");
        // assign engineering department to team
        managementSoftware.getTeamMembers().add(employees.get(0));
        managementSoftware.getTeamMembers().add(employees.get(1));
        projects.put("Management Software", managementSoftware);


       
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project landingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        landingPage.getTeamMembers().add(employees.get(2));
        projects.put("Marketing Landing Page", landingPage);


        //add employee to project
        //add project to map of projects
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        Set<String> projectKeys = projects.keySet();
        for (String projectInfo : projectKeys) {
            //  System.out.println(projects.get(projectInfo).getName() + " : " + projects.get(projectInfo).getTeamMembers().size());
        }
        System.out.println(projects.get("Management Software").getName() + ": " + projects.get("Management Software").getTeamMembers().size());
        System.out.println(projects.get("Marketing Landing Page").getName() + ": " + projects.get("Marketing Landing Page").getTeamMembers().size());
    }

}
