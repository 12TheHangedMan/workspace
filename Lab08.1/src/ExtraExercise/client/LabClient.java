package ExtraExercise.client;

import ExtraExercise.composition_example.Address;
import ExtraExercise.composition_example.Company;
import ExtraExercise.composition_example.Employee;

public class LabClient {
    public static void main(String[] args){
        Employee employee1=new Employee("Jason", 10000, new Address("Los Angels","U.S."));
        Employee employee2=new Employee("Jameson", 10000, new Address("Los Angels","U.S."));
        Employee employee3=new Employee("Jamison", 10000, new Address("Los Angels","U.S."));
        Employee employee4=new Employee("James", 10000, new Address("Los Angels","U.S."));

        Employee[] employees = new Employee[100];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;


        Company newCompany = new Company("J Company", employees);
        System.out.println(newCompany.computeTotalSalaryOfAllEmployees());
        newCompany.addEmployee(employee4);
        System.out.println(newCompany.computeTotalSalaryOfAllEmployees());
        //System.out.println(employee1.getEmployeeInfo());


    }
}
