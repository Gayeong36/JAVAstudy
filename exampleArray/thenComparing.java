package exampleArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    public Person(String name, int age){ // 매개변수 받아오기
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name = " (" + age + ")";
    }
}

public class thenComparing {
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("진배", 27));
        people.add(new Person("가영", 25));
        people.add(new Person("냠냠", 30));
        people.add(new Person("쟙쟙", 20));

        System.out.println("정렬 전 : " + people);

        Collections.sort(people, Comparator.comparingInt((Person p) -> p.age)
                                           .thenComparing(p->p.name));

        System.out.println("정렬 후 (나이 -> 이름 순) : "+people);
    }
}
