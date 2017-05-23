package chapter4.EmployeeTest;

import chapter5.PersonTest.Person;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Employee  extends Person{
    private static int nextId;

    private int id;
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
        super(name);
        this.salary = salary;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
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

    @Override
    public String getDescription() {
        return String.format("an employess with a salary of $%.2f", salary);
    }
}
