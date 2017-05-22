package chapter4.EmployeeTest;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private Date hireDay;

    private int id;

    public Employee() {
        name = "";
        salary = 0;

        GregorianCalendar calendar = new GregorianCalendar();
        hireDay = calendar.getTime();

        setId();
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();

        setId();
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

    private void setId() {
        id = nextId;
        nextId++;
    }

    /**
     * увеличение жалования на percent процентов
     * @param percent на сколько процентов нужно увеличить залование
     */
    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }
}
