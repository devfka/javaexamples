package streams.case7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Case 6: Given the list of employees, you need to group them by name
        List<Employee> employeeList = createEmployeeList();
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getName)));
    }

    public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Mary",18);
        Employee e5=new Employee("John",26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }
}
