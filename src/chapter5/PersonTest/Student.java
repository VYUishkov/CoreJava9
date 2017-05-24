package chapter5.PersonTest;

import java.util.Objects;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student other = (Student) o;
        return Objects.equals(major, other.major);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + major.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ",majoring" + major;
    }
}
