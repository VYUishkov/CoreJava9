package chapter5.ManagerTest;

import chapter4.EmployeeTest.Employee;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String getDescription() {
        return String.format("a manager with a salary of $%.2f", getSalary());
    }
}
