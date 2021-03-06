package ru.forxy.sample.callcenter;

/**
 * Base class for person representation
 */
public class Person {

    protected final String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
