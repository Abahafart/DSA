package com.abahafart.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UseComparable {

    public static void main(String[] args) {
        Person p1 = new Person("alfredo", 30, "miranda flores");
        Person p2 = new Person("gerardo", 26, "miranda flores");
        Person p3 = new Person("gustavo", 54, "miranda flores");
        Person p4 = new Person("gonzalo", 12, "miranda flores");
        Person p5 = new Person("efrain", 96, "miranda flores");
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
        personList.forEach(System.out::println);
        Comparator<Person> comparatorName = Comparator.comparing(Person::getName);
        personList.sort(comparatorName);
        personList.forEach(System.out::println);
    }

}

class Person implements Comparable {

    private String name;
    private int age;
    private String lastName;

    public Person(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object o) {
        Person person2 = (Person) o;
        if(this.age>person2.getAge()) {
            return 1;
        } else if (this.age< person2.getAge()) {
            return -1;
        }
        return 0;
    }
}
