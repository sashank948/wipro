/*ask 5: Iterators and Comparators
Write a custom Comparator to sort a list of Employee objects by their salary and 
then by name if the salary is the same. */



import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int salaryComparison = Double.compare(emp1.getSalary(), emp2.getSalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }

        
        return emp1.getName().compareTo(emp2.getName());
    }
}

public class day4T1 {
    public static void main(String[] args) {
      
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("sashank", 50));
        employees.add(new Employee("raj", 600));
        employees.add(new Employee("akhila", 600));
        employees.add(new Employee("Cher", 50));

       
        Collections.sort(employees, new EmployeeComparator());

    
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
