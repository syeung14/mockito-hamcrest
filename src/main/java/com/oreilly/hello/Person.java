package com.oreilly.hello;

import java.time.LocalDate;
import java.util.Objects;

// public record Person(Integer id, String first, String last, LocalDate dob) implements Comparable<Person> {
//     public int compareTo(Person other) { /* ... comparison ... */ }
// }

public class Person implements Comparable<Person> {
    private Integer id;
    private String first;
    private String last;
    private LocalDate dob;

    private String firstName;

    public Person(Integer id, String first, String last, LocalDate dob) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person(String first, String last, LocalDate dob) {
        this.first = first;
        this.last = last;
        this.dob = dob;
    }

    @Override
    public int compareTo(Person person) {
        return last.compareTo(person.last);
    }

    // Javabeans property
    public String getName() {
        return String.format("%s %s", first, last);
    }

    public Integer getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(first, person.first) &&
                Objects.equals(last, person.last) &&
                Objects.equals(dob, person.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last, dob);
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", dob=" + dob +
                '}';
    }
}
