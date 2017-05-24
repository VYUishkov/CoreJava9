package chapter5.ManagerTest;

import chapter4.EmployeeTest.Employee;

import java.util.ArrayList;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Victor", 70000, 1992, 2 , 2);
        manager.setBonus(5000);

        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(manager);
        staff.add(new Manager("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Manager("Tony Tester", 40000, 1990, 3, 15));

        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}
