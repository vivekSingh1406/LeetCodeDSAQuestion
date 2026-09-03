# Java 8 Stream API
## 1. Find the Employee with the Highest Salary

### Main Question

> Given a list of employees, find the employee who has the highest salary using Java 8 Stream API.

### Follow-up Questions

- How would you find the employee with the lowest salary?
- How would you find only the highest salary?
- How would you find the second-highest salary?
- How would you find the second-highest distinct salary?
- How would you find all employees having the highest salary?
- What happens if the employee list is empty?
- Why does `max()` return `Optional<Employee>`?
- Can you solve this without sorting?

### Concepts

`max()`, `min()`, `Comparator`, `Optional`

---

## 2. Find Top N Employees by Salary

### Main Question

> Given a list of employees, find the top 3 employees with the highest salary using Java 8 Stream API.

### Follow-up Questions

- Find the top 5 employees.
- Find the top 20 employees.
- Find the top 3 lowest-paid employees.
- Find the top 3 employees from the IT department.
- Find the top 3 employees from each department.
- Find the top 3 employees based on salary and age.
- Find the top 3 employees having distinct salaries.
- What happens if there are fewer than 3 employees?

### Concepts

`sorted()`, `limit()`, `skip()`, `distinct()`

---

## 3. Find the Second-Highest Salary

### Main Question

> Given a list of employees, find the employee with the second-highest salary.

### Follow-up Questions

- Find only the second-highest salary.
- Find the second-highest distinct salary.
- Find all employees having the second-highest salary.
- Find the third-highest salary.
- Find the Nth-highest salary.
- Find the second-highest salary without using `sorted()`.
- What is the time complexity of your solution?
- What happens if all employees have the same salary?

### Concepts

`sorted()`, `skip()`, `distinct()`, `max()`, `reduce()`

---

## 4. Group Employees by Department

### Main Question

> Given a list of employees, group all employees based on their department using Java 8 Stream API.

### Expected Output

```text
IT       -> [Employee1, Employee2, Employee3]
HR       -> [Employee4, Employee5]
Finance  -> [Employee6, Employee7]
```

### Follow-up Questions

- Count the number of employees in each department.
- Find the average salary of each department.
- Find the total salary of each department.
- Find the highest salary in each department.
- Find the lowest salary in each department.
- Find the highest-paid employee in each department.
- Find the lowest-paid employee in each department.
- Sort employees by salary within each department.
- Find the top 3 employees from each department.
- Find the second-highest-paid employee from each department.

### Concepts

`groupingBy()`, `counting()`, `averagingDouble()`, `summingDouble()`, `maxBy()`, `minBy()`

---

## 5. Find Highest-Paid Employee from Each Department

### Main Question

> Find the highest-paid employee from each department.

### Expected Output

```text
IT       -> Vivek
HR       -> Rahul
Finance  -> Amit
```

### Follow-up Questions

- Find the lowest-paid employee from each department.
- Find only the highest salary from each department.
- Find the second-highest salary from each department.
- Find the top 3 employees from each department.
- Find all employees having the highest salary in their department.
- What if two employees have the same highest salary?
- Can you solve it using `groupingBy()` and `maxBy()`?
- Why would you use `collectingAndThen()` here?

### Concepts

`groupingBy()`, `maxBy()`, `collectingAndThen()`

---

## 6. Count Employees by Department

### Main Question

> Find the number of employees working in each department.

### Expected Output

```text
IT       -> 10
HR       -> 5
Finance  -> 8
```

### Follow-up Questions

- Which department has the highest number of employees?
- Which department has the lowest number?
- Find departments having more than 5 employees.
- Count employees by department and gender.
- Count employees by city.
- Count employees by department and city.
- Can you solve this using `groupingBy()` and `counting()`?

### Concepts

`groupingBy()`, `counting()`

---

## 7. Find Average Salary by Department

### Main Question

> Find the average salary of employees in each department.

### Expected Output

```text
IT       -> 95000
HR       -> 75000
Finance  -> 110000
```

### Follow-up Questions

- Which department has the highest average salary?
- Which department has the lowest average salary?
- Find employees earning more than their department's average salary.
- Find employees earning less than their department's average salary.
- Find average salary by gender.
- Find average salary by city.
- Find average salary by department and gender.
- Find the overall average salary.

### Concepts

`groupingBy()`, `averagingDouble()`, `mapToDouble()`

---

## 8. Find Total Salary by Department

### Main Question

> Find the total salary paid by each department.

### Expected Output

```text
IT       -> 1000000
HR       -> 500000
Finance  -> 1500000
```

### Follow-up Questions

- Which department has the highest total salary?
- Which department has the lowest total salary?
- Find total salary by city.
- Find total salary by gender.
- Find total salary by department and city.
- Find the overall salary expenditure.

### Concepts

`summingDouble()`, `groupingBy()`

---

## 9. Filter Employees by Salary

### Main Question

> Find all employees whose salary is greater than 100,000.

### Follow-up Questions

- Find employees whose salary is between 50,000 and 100,000.
- Find employees whose salary is greater than the overall average.
- Find employees whose salary is greater than their department average.
- Find employees from IT whose salary is greater than 100,000.
- Find employees from Delhi or Mumbai.
- Find employees older than 30.
- Find employees whose age is between 25 and 35.
- Find employees whose salary is greater than 100,000 and age is less than 30.

### Concepts

`filter()`, predicates, `&&`, `||`

---

## 10. Get Employee Names

### Main Question

> Given a list of employees, return a list containing only employee names.

### Follow-up Questions

- Convert all names to uppercase.
- Find unique employee names.
- Sort employee names alphabetically.
- Sort employee names in reverse order.
- Get names of employees earning more than 100,000.
- Join all employee names using `", "`.
- Get employee names department-wise.
- Find names starting with `"A"`.

### Concepts

`map()`, `distinct()`, `sorted()`, `joining()`

---

## 11. Sort Employees

### Main Question

> Sort employees by salary in descending order.

### Follow-up Questions

- Sort employees by salary ascending.
- Sort employees by age.
- Sort employees by name.
- Sort by salary descending and age ascending.
- Sort by department and then salary.
- Sort by salary, then name.
- How do you handle `null` values while sorting?
- Explain `Comparator.comparing()` vs `Comparator.comparingInt()`.

### Example

```java
Comparator.comparing(Employee::getSalary)
          .reversed()
          .thenComparing(Employee::getAge);
```

### Concepts

`Comparator`, `comparing()`, `thenComparing()`, `reversed()`

---

## 12. Find Duplicate Employee Names

### Main Question

> Given a list of employees, find all duplicate employee names.

### Example

```text
Vivek
Rahul
Amit
Vivek
Rahul
```

### Expected Output

```text
Vivek
Rahul
```

### Follow-up Questions

- Find duplicate employee IDs.
- Find duplicate cities.
- Find duplicate departments.
- Count how many times each name appears.
- Find the most frequently occurring name.
- Remove duplicate employee names.
- Remove duplicate employees based on ID.
- Explain `distinct()` vs duplicate detection using `groupingBy()`.

### Concepts

`groupingBy()`, `counting()`, `distinct()`, `Set`

---

## 13. Partition Employees

### Main Question

> Partition employees into two groups: employees whose salary is greater than 100,000 and employees whose salary is less than or equal to 100,000.

### Expected Output

```text
true  -> salary > 100000
false -> salary <= 100000
```

### Follow-up Questions

- Partition employees based on age > 30.
- Count employees in each partition.
- Find the highest-paid employee in each partition.
- Partition employees based on salary > average salary.
- What is the difference between `partitioningBy()` and `groupingBy()`?
- When would you use `partitioningBy()`?

### Concepts

`partitioningBy()`

---

## 14. Convert Employee List to Map

### Main Question

> Convert `List<Employee>` into `Map<Integer, Employee>` where employee ID is the key.

### Example

```text
1 -> Employee1
2 -> Employee2
3 -> Employee3
```

### Example Solution

```java
Map<Integer, Employee> employeeMap = employees.stream()
        .collect(Collectors.toMap(
                Employee::getId,
                Function.identity()
        ));
```

### Follow-up Questions

- Convert employees into `Map<Integer, String>` where ID -> name.
- Convert employees into `Map<String, Double>` where name -> salary.
- What happens if duplicate IDs exist?
- How do you handle duplicate keys?
- Difference between `toMap()` and `groupingBy()`?
- Create department -> employee count.
- Create department -> list of employee names.
- Create city -> list of employees.

### Concepts

`toMap()`, `Function.identity()`, merge function

---

## 15. `map()` vs `flatMap()`

### Main Question

> What is the difference between `map()` and `flatMap()` in Java 8 Stream API? Explain with an Employee example.

Suppose Employee has:

```java
private List<String> skills;
```

Data:

```text
Vivek -> Java, Spring, AWS
Rahul -> Java, Docker
Amit  -> Kafka, AWS
```

Question:

> Find all unique skills from all employees.

### Expected Output

```text
Java
Spring
AWS
Docker
Kafka
```

### Follow-up Questions

- Explain `map()` vs `flatMap()`.
- Find employees who have `"Java"` skill.
- Count employees who know Java.
- Find unique skills.
- Find the most common skill.
- Group employees by skill.
- Give a real-world use case for `flatMap()`.
- Can `flatMap()` be used with nested lists?

### Concepts

`map()`, `flatMap()`, nested collections

---

## 16. `reduce()`

### Main Question

> Calculate the total salary of all employees using the `reduce()` operation.

### Follow-up Questions

- Find the maximum salary using `reduce()`.
- Find the minimum salary using `reduce()`.
- Calculate total age.
- Concatenate employee names using `reduce()`.
- Difference between `reduce()` and `collect()`?
- What is the identity value in `reduce()`?
- Explain accumulator and combiner.
- When should you avoid using `reduce()`?

### Concepts

`reduce()`, accumulator, identity, combiner

---

## 17. Optional + Stream

### Main Question

> Find the first employee belonging to the IT department and handle the case where no employee exists.

### Example

```java
Optional<Employee> employee = employees.stream()
        .filter(e -> "IT".equals(e.getDepartment()))
        .findFirst();
```

### Follow-up Questions

- Difference between `findFirst()` and `findAny()`?
- Why does `findFirst()` return `Optional`?
- What is `orElse()`?
- Difference between `orElse()` and `orElseGet()`?
- What is `orElseThrow()`?
- Can Optional contain `null`?
- Can you return `null` instead of Optional?
- When should you avoid Optional?

### Concepts

`Optional`, `findFirst()`, `findAny()`

---

## 18. `anyMatch()`, `allMatch()`, `noneMatch()`

### Main Question

> Check whether at least one employee has a salary greater than 200,000.

### Example

```java
boolean result = employees.stream()
        .anyMatch(e -> e.getSalary() > 200000);
```

### Follow-up Questions

- Check whether all employees have salary greater than 50,000.
- Check whether no employee belongs to HR.
- Difference between `anyMatch()`, `allMatch()`, and `noneMatch()`?
- Are these terminal operations?
- Are these short-circuit operations?
- Which one returns true for an empty stream?

### Concepts

Matching, short-circuiting

---

## 19. Join Employee Names

### Main Question

> Convert all employee names into a single comma-separated String using Stream API.

### Expected Output

```text
Vivek, Rahul, Amit, Rohit
```

### Follow-up Questions

- Join names using `"-"`.
- Add prefix and suffix.
- Join only IT employee names.
- Join unique employee names.
- Join names after sorting.
- Join employee names department-wise.
- What is `Collectors.joining()`?
- Difference between `joining()` and `reduce()` for String concatenation?

### Concepts

`Collectors.joining()`, `map()`, `filter()`, `sorted()`

---

## 20. Advanced — Salary Greater Than Department Average

### Main Question

> Find all employees whose salary is greater than the average salary of their own department.

### Example

```text
IT Average = 100000

Vivek  -> 120000  ✓
Rahul  -> 90000   ✗
Amit   -> 150000  ✓
```

### Expected Output

```text
Vivek
Amit
```

### Follow-up Questions

- Find employees earning less than their department average.
- Find employees earning more than the overall average salary.
- Find the highest-paid employee in each department.
- Find the second-highest-paid employee in each department.
- Find top 3 employees in each department.
- Find the department having the highest average salary.
- Find the department having the highest total salary.
- Find employees whose salary is greater than their city's average.
- Can you solve it using multiple stream operations?
- Can you optimize it for millions of employees?
- What is the time and space complexity?
- Would `parallelStream()` improve this solution?

### Concepts

`groupingBy()`, `averagingDouble()`, `map()`, `filter()`, `Comparator`

---

# Important Stream API Concepts

## Stream Fundamentals

1. What is Stream API?
2. Why was Stream API introduced in Java 8?
3. Difference between Collection and Stream?
4. Difference between Stream and Parallel Stream?
5. Can a Stream be reused?
6. What is lazy evaluation?
7. What is a terminal operation?
8. What is an intermediate operation?
9. What is a short-circuit operation?
10. Difference between `map()` and `filter()`?

## Advanced Concepts

11. `map()` vs `flatMap()`
12. `map()` vs `mapToInt()`
13. `collect()` vs `reduce()`
14. `findFirst()` vs `findAny()`
15. `orElse()` vs `orElseGet()`
16. `groupingBy()` vs `partitioningBy()`
17. `toMap()` vs `groupingBy()`
18. How does `distinct()` work?
19. How does `sorted()` work?
20. What are the risks of `parallelStream()`?
21. Is Stream API always faster than a traditional loop?
22. How does lazy evaluation improve performance?
23. What happens when an exception occurs inside a Stream?
24. Can you modify the source collection while processing a Stream?
25. How do you debug a complex Stream pipeline?

---

# 10 Most Important Patterns

For Java interview, master these patterns:

```text
1. max() / min()
2. Second-highest / Nth-highest
3. Top N
4. groupingBy() + counting()
5. groupingBy() + averagingDouble()
6. groupingBy() + maxBy() / minBy()
7. groupingBy() + mapping()
8. toMap() + duplicate-key handling
9. partitioningBy()
10. Top N / second-highest per department
```

---

# Java 8 Stream API Preparation Order

## Level 1

- `filter()`
- `map()`
- `sorted()`
- `max()` / `min()`
- `findFirst()`
- `findAny()`
- `limit()` / `skip()`
- `distinct()`

## Level 2

- `groupingBy()`
- `counting()`
- `averagingDouble()`
- `summingDouble()`
- `maxBy()` / `minBy()`
- `toMap()`
- `partitioningBy()`

## Level 3

- `flatMap()`
- `reduce()`
- `collectingAndThen()`
- Complex `Comparator`
- Top N per group
- Second-highest per group
- Salary > department average
- Duplicate handling
- Stream performance
- Sequential vs parallel streams

---

# Interview Strategy

For each coding question, practice answering in this order:

```text
1. Understand the requirement
2. Identify the Stream operations needed
3. Write the solution
4. Explain each operation
5. Discuss edge cases
6. Discuss time complexity
7. Discuss space complexity
8. Explain an alternative approach
9. Handle interviewer follow-up questions
```
