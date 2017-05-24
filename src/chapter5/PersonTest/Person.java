package chapter5.PersonTest;

import java.util.Objects;

/**
 * Created by SBT-Ishkov-VYu on 23.05.2017.
 */
public abstract class Person {
    private String name = "";

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + ",name=" + name;
    }
}
