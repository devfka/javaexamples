package streams.case6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Case 6: Given a list of employees, You need to find highest age of employee?
        List<Employee> employeesList = getListOfEmployees();


        System.out.println(employeesList.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge())
                        .limit(1)
                        .collect(Collectors.toList()));

        System.out.println(employeesList.stream().max(Comparator.comparingInt(Employee::getAge)).get());
    }

    public static List<Employee> getListOfEmployees() {

        List<Employee> listOfEmployees = new ArrayList<>();

        Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork", "Banglore"));
        Employee e2 = new Employee("John", 27, Arrays.asList("Paris", "London"));
        Employee e3 = new Employee("Vaibhav", 32, Arrays.asList("Pune", "Seattle"));
        Employee e4 = new Employee("Amit", 22, Arrays.asList("Chennai", "Hyderabad"));

        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);

        return listOfEmployees;
    }
}
