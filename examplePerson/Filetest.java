package examplePerson;

import java.io.*;

public class Filetest {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("안녕하세요! 가영입니다.");
            bw.newLine();
            bw.write("이건 파일 쓰기 예제입니다.");

            bw.close();
            fw.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
