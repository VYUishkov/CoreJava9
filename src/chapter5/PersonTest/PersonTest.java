package chapter5.PersonTest;

import chapter4.EmployeeTest.Employee;
import chapter5.ManagerTest.Manager;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        people[2] = new Manager("Victor Ishkov", 70000, 1992, 2, 2);

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
        }
    }
}
