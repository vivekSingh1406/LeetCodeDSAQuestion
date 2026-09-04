package Java8Feature1;

import java.util.*;
import java.util.stream.Collectors;


public class EmployeeLevel01 {

    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();

        // Todo :- Level-1 Question
        // 1. Group employees by department
        Map<String,List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        map.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(employee ->
                    System.out.println("  " + employee));
        });

        // 2. Count employees in each department
        Map<String, Long> empDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        empDepartment.forEach((department, employeeCount) -> {
            System.out.println(department+" "+employeeCount);
        });

        // 3. Find the highest salary employee in each department
        Map<String, Optional<Employee>> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
        map1.forEach((department, employee) -> {
            System.out.println(department+" "+employee.get());
        });


        // 4. Find the highest salary employee in each department without Optional
        Map<String, Employee> result = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
                                        Optional::get)
                        ));
        result.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 5. Find average salary of each department
        Map<String, Double> averageSalary = employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));
        averageSalary.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 6. Find total salary paid by each department
        Map<String, Double> totalPaidByDep = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        totalPaidByDep.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 7. Group employees by city
        Map<String, List<Employee>> groupByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));
        groupByCity.forEach((department, employeeList) -> {
            System.out.println(department+" "+employeeList);
        });

        // 8. Group employees by gender
        Map<String, List<Employee>> groupByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        groupByGender.forEach((department, employeeList) -> {
            System.out.println(department+" "+employeeList);
        });

        // 9. Group employees by department and then gender
        Map<String, Map<String, List<Employee>>> doubleGroup = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.groupingBy(Employee::getGender)));
        doubleGroup.forEach((department, employeeList) -> {
            System.out.println(department+" "+employeeList);
        });


        // 10. Group by department and find average salary
        Map<String, Double> depAverageSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        depAverageSalary.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 11. Group by department and find maximum salary
        Map<String, Double> depMaxSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                Comparator.comparingDouble(Employee::getSalary)
                                ),optional -> optional.get().getSalary())));

        depMaxSalary.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 12. Find the department having the highest average salary
        Map<String, Double> depHighAvgSal = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        depHighAvgSal.forEach((department, employee) -> {
            System.out.println(department+" "+employee);
        });

        // 13. Group employees by salary range
        Map<String, List<Employee>> salarGroupBy =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> {
                            if (e.getSalary() < 50000) {
                                return "LOW";
                            } else if (e.getSalary() <= 100000) {
                                return "MEDIUM";
                            } else {
                                return "HIGH";
                            }
                        }));
        salarGroupBy.forEach((department, employeeList) -> {
            System.out.println(department+" "+employeeList);
        });


        // 14. Group employees by age category
        Map<String, List<Employee>> groupByCategory =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> {
                            if (e.getAge() < 30) {
                                return "YOUNG";
                            } else if (e.getAge() <= 50) {
                                return "MIDDLE";
                            } else {
                                return "SENIOR";
                            }
                        }));

        groupByCategory.forEach((department, employeeList) -> {
            System.out.println(department+" "+employeeList);
        });


        // 15. Group employees and get only their names
        Map<String, List<String>> getOnlyName = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        getOnlyName.forEach((department, employeeList) -> {
            System.out.println(department+"--"+employeeList);
        });


        // 16. Group employees by department and collect employee names into Set
        Map<String, Set<String>> getSetEmp = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toSet())
                ));
        getSetEmp.forEach((department, employeeSet) -> {
            System.out.println(department+"--"+employeeSet);
        });


        // 17. Group employees by department and create comma-separated names
        Map<String, String> commaSepByEmp = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))
                ));

        commaSepByEmp.forEach((department, employeeSet) -> {
            System.out.println(department+"--"+employeeSet);
        });


        // 18. Group employees by department and calculate salary statistics
        Map<String, DoubleSummaryStatistics> empDoubleSummary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summarizingDouble(Employee::getSalary)
                        ));
        empDoubleSummary.forEach((department, employee) -> {
            System.out.println(department+"--"+employee);
        });


        // 19. Group by department and sort employees by salary
        Map<String, List<Employee>> sortBySalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingDouble(
                                                                Employee::getSalary
                                                        ).reversed()
                                                ).collect(Collectors.toList())
                                )
                        ));

        sortBySalary.forEach((department, employeeList) -> {
            System.out.println(department+"--"+employeeList);
        });



        // 20. Find the second-highest salary employee in each department
        Map<String, Optional<Employee>> secondSalaryEmployees =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(
                                                        Comparator.comparingDouble(
                                                                Employee::getSalary
                                                        ).reversed()
                                                )
                                                .skip(1)
                                                .findFirst()
                                )
                        ));

        secondSalaryEmployees.forEach((s, employee) -> {
            sortBySalary.forEach((department, employeeList) -> {
                System.out.println(department+"--"+employeeList);
            });
        });


    }
}
