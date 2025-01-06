package examplePerson;

import java.io.*;
import java.util.ArrayList;

public class Person {
    String name; // 필드
    int age;
    ArrayList<Person> friends;

    // 메서드 안에서 this는 필드... 
    // 매개변수를 받는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    // 친구추가 메서드
    public void addFriend(Person friend){
        if (!friends.contains(friend)){
            friends.add(friend);
            System.out.println(this.name+"의 친구로 "+friend.name+"을(를) 추가했습니다.");
        } else {
            System.out.println(friend.name+"은(는) 이미 "+this.name+"의 친구입니다.");
        }
    }

    // 친구 목록 출력 메서드
    public void showFriends() {
        System.out.println(this.name+"의 친구 목록: ");
        for (Person friend : friends){
            System.out.println("- "+friend.name);
        }
    }

    // introduce 메서드 (non-static)
    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }

    // 나이 비교 메서드
    public void compareAge(Person other){
        if (this.age > other.age){
            System.out.println(this.name+ "이(가) " +other.name+ "(이)보다 나이가 많습니다.");
        } else if (this.age<other.age){
            System.out.println(other.name+ "이(가) " +this.name+ "(이)보다 나이가 많습니다.");
        } else {System.out.println(this.name+ "과(와) " +other.name+ "은(는) 나이가 같습니다.");
        }
    }   

    // 맞춤 인사 메서드
    public void personalizedGreeting(){
        if(age<20){
            System.out.println(name+"님, 안녕하세요! 학교 생활은 재미있나요?");
        } else if(age<=30) {
            System.out.println(name+"님, 좋은 하루 되세요!");  
        } else {
            System.out.println(name+"님, 오늘도 건강 유의하세요!");
        }
    }

    //파일 비우기
    public static void fileClear(){
        try{
            FileWriter fww = new FileWriter("friends.txt", false);
            fww.write("");
            fww.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 친구목록 파일에 저장 메서드
    public static void writeFriends(String friend){
        try{
            FileWriter fw = new FileWriter("friends.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(friend);
            bw.newLine();

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 친구목록 불러오기 메서드
    public static void readFriends(){
        try {
            FileReader fr = new FileReader("friends.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
