package Java8Features;


import java.util.Arrays;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;
    private String city;

    public Employee() {
    }

    public Employee(int id, String name, String department,
                    double salary, int age, String gender, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    public static List<Employee> getEmployees() {
            return Arrays.asList(

                    new Employee(101, "Vivek", "IT", 85000, 27, "Male", "Bhopal"),
                    new Employee(102, "Rahul", "HR", 60000, 30, "Male", "Delhi"),
                    new Employee(103, "Priya", "Finance", 95000, 29, "Female", "Mumbai"),
                    new Employee(104, "Ankit", "IT", 120000, 32, "Male", "Pune"),
                    new Employee(105, "Sneha", "Sales", 70000, 26, "Female", "Indore"),
                    new Employee(106, "Amit", "IT", 110000, 35, "Male", "Delhi"),
                    new Employee(107, "Neha", "Finance", 98000, 31, "Female", "Bangalore"),
                    new Employee(108, "Rohit", "Sales", 65000, 28, "Male", "Hyderabad"),
                    new Employee(109, "Pooja", "HR", 62000, 27, "Female", "Jaipur"),
                    new Employee(110, "Karan", "IT", 135000, 36, "Male", "Noida"),
                    new Employee(111, "Simran", "Finance", 105000, 34, "Female", "Chennai"),
                    new Employee(112, "Arjun", "Sales", 72000, 29, "Male", "Ahmedabad"),
                    new Employee(113, "Nisha", "IT", 99000, 30, "Female", "Pune"),
                    new Employee(114, "Mohit", "HR", 58000, 25, "Male", "Lucknow"),
                    new Employee(115, "Kavita", "Finance", 115000, 33, "Female", "Delhi"),
                    new Employee(116, "Rakesh", "IT", 125000, 38, "Male", "Bangalore"),
                    new Employee(117, "Divya", "Sales", 68000, 24, "Female", "Mumbai"),
                    new Employee(118, "Sanjay", "Finance", 108000, 37, "Male", "Pune"),
                    new Employee(119, "Aarti", "HR", 61000, 28, "Female", "Indore"),
                    new Employee(120, "Deepak", "IT", 95000, 31, "Male", "Chennai"),
                    new Employee(121, "Komal", "Finance", 102000, 29, "Female", "Delhi"),
                    new Employee(122, "Manish", "Sales", 74000, 30, "Male", "Jaipur"),
                    new Employee(123, "Sakshi", "HR", 66000, 26, "Female", "Noida"),
                    new Employee(124, "Nitin", "IT", 118000, 34, "Male", "Ahmedabad"),
                    new Employee(125, "Riya", "Finance", 112000, 32, "Female", "Hyderabad"),
                    new Employee(126, "Lokesh", "Sales", 76000, 27, "Male", "Lucknow"),
                    new Employee(127, "Anjali", "IT", 91000, 28, "Female", "Mumbai"),
                    new Employee(128, "Gaurav", "HR", 64000, 33, "Male", "Delhi"),
                    new Employee(129, "Preeti", "Finance", 97000, 30, "Female", "Bhopal"),
                    new Employee(130, "Harsh", "IT", 132000, 39, "Male", "Pune"),
                    new Employee(131, "Payal", "Sales", 71000, 26, "Female", "Bangalore"),
                    new Employee(132, "Ashish", "IT", 109000, 35, "Male", "Hyderabad"),
                    new Employee(133, "Megha", "Finance", 116000, 36, "Female", "Ahmedabad"),
                    new Employee(134, "Tarun", "HR", 59000, 29, "Male", "Indore"),
                    new Employee(135, "Shweta", "Sales", 78000, 31, "Female", "Chennai"),
                    new Employee(136, "Yash", "IT", 94000, 27, "Male", "Jaipur"),
                    new Employee(137, "Isha", "Finance", 103000, 30, "Female", "Noida"),
                    new Employee(138, "Vikas", "IT", 128000, 37, "Male", "Delhi"),
                    new Employee(139, "Monika", "HR", 65000, 28, "Female", "Mumbai"),
                    new Employee(140, "Abhishek", "Sales", 81000, 34, "Male", "Bhopal"),
                    new Employee(141, "Sonal", "Finance", 121000, 35, "Female", "Pune"),
                    new Employee(142, "Naveen", "IT", 101000, 32, "Male", "Lucknow"),
                    new Employee(143, "Bhavna", "HR", 63000, 27, "Female", "Ahmedabad"),
                    new Employee(144, "Kishore", "Sales", 79000, 33, "Male", "Delhi"),
                    new Employee(145, "Pallavi", "Finance", 111000, 34, "Female", "Hyderabad"),
                    new Employee(146, "Sachin", "IT", 140000, 40, "Male", "Bangalore"),
                    new Employee(146, "Rohit Sharma", "IT", 140000, 40, "Male", "Bangalore"),
                    new Employee(147, "Ritu", "HR", 67000, 31, "Female", "Pune"),
                    new Employee(148, "Ajay", "Sales", 73000, 29, "Male", "Mumbai"),
                    new Employee(149, "Swati", "Finance", 99000, 30, "Female", "Chennai"),
                    new Employee(150, "Prakash", "IT", 150000, 41, "Male", "Noida")

            );
    }
}
