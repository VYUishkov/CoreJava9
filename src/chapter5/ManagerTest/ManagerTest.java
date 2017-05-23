package chapter5.ManagerTest;

import chapter4.EmployeeTest.Employee;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Victor", 70000, 1992, 2 , 2);
        manager.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = manager;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee employee : staff) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}
