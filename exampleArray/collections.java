package exampleArray;

import java.util.ArrayList;
import java.util.Collections;

public class collections {
    public static void main(String[] args){
        ArrayList<String> friends = new ArrayList<>();
        friends.add("진배");
        friends.add("가영");
        friends.add("미영");

        System.out.println("정렬 전 : "+friends);

        Collections.sort(friends); // 정렬

        System.out.println("정렬 후 : "+friends);
    }
}
