package exampleArray;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return name + " (" + age + ")";
    }
}

public class comparable {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("진배", 27));
        people.add(new Person("가영", 25));
        people.add(new Person("혜진", 24));

        System.out.println("정렬 전: " + people);

        // 정렬
        Collections.sort(people);

        System.out.println("정렬 후: " + people);


    }
}
