package Java8Feature1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeLevel02 {

    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();


        // 1. Find the employee with the highest salary
        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(new Employee());
        System.out.println("Highest Salary:- " + highestSalaryEmployee);

        // 2. Find the employee with the second-highest salary
        Employee secondHighestSalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(new Employee());
        System.out.println("Second Highest:- " + secondHighestSalary);

        // If multiple employees have the same highest salary
        Employee secondHighestDuplicate = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(new Employee());
        System.out.println("Second Highest:- " + secondHighestDuplicate);

        // 3. Find the top 3 highest-paid employees
        List<Employee> top3 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .toList();
        top3.forEach(System.out::println);

        // 5. Find all employees from the IT department
        List<Employee> idDepartment = employees.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.getDepartment())).toList();
        idDepartment.forEach(System.out::println);


        // 6. Find All employees name, name start will A
        Stream<String> result = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.toLowerCase().startsWith("a"));
        result.forEach(System.out::println);


        // 7. Find size of employee, name start will A
        long intStream = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.toLowerCase().startsWith("a"))
                .count();
        System.out.println("IntStream: " + intStream);


        // 8. Find all Employee name who salary greater than 50000
        List<String> empNameSalary = employees.stream()
                .filter(employee -> employee.getSalary() > 100000)
                .map(Employee::getName)
                .toList();
        empNameSalary.forEach(System.out::println);


    }

}
