package chapter4.ParamTest;

import chapter4.EmployeeTest.Employee;

/**
 * Created by SBT-Ishkov-VYu on 19.05.2017.
 */
public class ParamTest {
    public static void main(String[] args) {

        /*
         * Тест 1:  методы не могут изменить числовые параметры
         */
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test 2: методы могут изменять состояние объектов,
         * передаваемых в качестве параметров
         */
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry", 50000, 1992, 2, 2);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * Тест 3: методы не могут присоединять объекты к объектным параматрам
         */
        System.out.println("\nTesting swap:");
        Employee a = new Employee("Alice", 70000, 1992, 2, 3);
        Employee b = new Employee("Bob", 60000, 1992, 2, 4);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee employee) {
        employee.raiseSalary(50);
        System.out.println("End of method: salary=" + employee.getSalary());
    }

    public static void swap(Employee a, Employee b) {
        Employee buff = a;
        a = b;
        b = buff;
        System.out.println("End of method: a=" + a.getName());
        System.out.println("End of method: b=" + b.getName());
    }
}