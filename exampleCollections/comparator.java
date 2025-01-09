package exampleCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person { // Person 선언 및 매개변수 받기 + toString 메서드가 있는 클래스
    String name;
    int age;


    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name+" (" + age + ")";
    }
}


public class comparator{
    public static void main(String[] args){ // 메인 메서드 
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("진배", 27));
        people.add(new Person("가영", 25));
        people.add(new Person("미영", 23));
        
        System.out.println(people);
        
        Collections.sort(people, new Comparator<Person>(){ // Person객체를 비교하는 Comparator
            @Override
            public int compare(Person p1, Person p2){
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println(people);

        // Collections.sort(people, new Comparator<Person>(){
        //     @Override
        //     public int compare(Person p1, Person p2){
        //         return Integer.compare(p2.age, p1.age);
        //     }
        // }); -> 반대로작성

        Collections.sort(people, (p1,p2) -> Integer.compare(p2.age, p1.age));

        System.out.println(people);
    }
}

