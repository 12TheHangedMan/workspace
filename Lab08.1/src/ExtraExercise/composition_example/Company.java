package ExtraExercise.composition_example;

public class Company {
    public Company(String companyName, Employee[] employees) {
        setCompanyName(companyName);
        setEmployees(employees);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String companyName;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    private Employee[] employees = new Employee[100];

    public void addEmployee(Employee employee){
        for(int i =0; i< 100; i++) {
            if(employees[i]==null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public double computeTotalSalaryOfAllEmployees(){
        double total = 0;
        for(int i =0; i< 100; i++) {
            if(employees[i]==null) {
                continue;
            } else {
                total += employees[i].getSalary();
            }
        }
        return total;
    }
}
