package chapter5.PersonTest;

import chapter4.EmployeeTest.Employee;
import chapter5.ManagerTest.Manager;

import java.util.ArrayList;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        people.add(new Student("Maria Morris", "computer science"));
        people.add(new Manager("Victor Ishkov", 70000, 1992, 2, 2));

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }
    }
}
