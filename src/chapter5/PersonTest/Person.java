package chapter5.PersonTest;

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
}
