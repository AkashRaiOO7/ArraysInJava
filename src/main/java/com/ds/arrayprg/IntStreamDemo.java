package com.ds.arrayprg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Person{
    int height;
    String color;

    public Person(int height, String color) {
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
public class IntStreamDemo {
    public static void main(String[] args) {
        Person p1= new Person(10, "black");
        Person p2= new Person(23, "white");
        List<Person> personList= Arrays.asList(p1, p2);
        IntStream.range(0, personList.size()).forEach(
                index->{
                    System.out.println(personList.get(index));
                }
        );
    }
}
