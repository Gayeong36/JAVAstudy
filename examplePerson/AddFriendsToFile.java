package examplePerson;

import java.util.Scanner;

public class AddFriendsToFile {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("   * 파일 내용 비움 *");
        Person.fileClear();

        System.out.println("친구 이름을 입력하세요 (끝내려면 exit 입력) : ");
        while (true) { 
            String input = sca.nextLine();
            if (input.equalsIgnoreCase("exit")){ break; }
   
            Person.writeFriends(input);
        }
        System.out.println("친구 목록을 출력하시겠습니까? (yes/no) : ");
        while (true) {
            String input = sca.nextLine();
            
            if (input.equalsIgnoreCase("yes")) {Person.readFriends(); break;}
            else if (input.equalsIgnoreCase("no")) {break;}
            else {System.out.println("   * yes 혹은 no 를 입력해주세요. *");}
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
