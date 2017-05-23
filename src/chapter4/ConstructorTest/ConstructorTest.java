package chapter4.ConstructorTest;

import chapter4.EmployeeTest.Employee;

/**
 * Created by VICTOR on 22.05.2017.
 */
public class ConstructorTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee();
        staff[1] = new Employee(60000);
        staff[2] = new Employee("Harry", 40000);

        for (Employee employee : staff)
        {
            System.out.println("id=" + employee.getId() + ", name=" + employee.getName() +
                    ", salary=" + employee.getSalary() + ", date=" + employee.getHireDay());
        }
    }
}
