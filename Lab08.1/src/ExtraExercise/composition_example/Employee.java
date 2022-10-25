package ExtraExercise.composition_example;

public class Employee {
    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String name;
    private double salary;
    private Address address;

    public String getEmployeeInfo() {
        return name + " " + salary + " " + address.getAddressInfo();
    }
}
