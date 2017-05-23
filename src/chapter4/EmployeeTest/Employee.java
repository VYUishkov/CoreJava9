package chapter4.EmployeeTest;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;
    private Date hireDay;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id  = nextId;
        nextId++;

        GregorianCalendar calendar = new GregorianCalendar();
        hireDay = calendar.getTime();
    }

    public Employee() {}

    public Employee(double salary)
    {
        this("Employee #" + nextId, salary);
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    /**
     * увеличение жалования на percent процентов
     * @param percent на сколько процентов нужно увеличить залование
     */
    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }
}
