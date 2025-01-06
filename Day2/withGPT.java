package Day2;

public class withGPT {
    public static void main(String[] args) {
        greet("가영");
        System.out.println("------------------------------------");

        System.out.println("12 + 24 = " + add(12,24));
        System.out.println("------------------------------------");

        int number = 7; boolean isEven = checkEven(number);
        if (isEven){
            System.out.println(number + "는 짝수입니다.");}
        else{
        System.out.println(number + "는 홀수입니다.");}
        System.out.println("------------------------------------");
    }

    public static void greet(String name) {
        System.out.println("안녕! 나는 " + name+ "이야!");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static boolean checkEven(int num){
        // boolean aasdf = num%2==1;
        // System.out.println(aasdf);
        return num % 2 == 0;
    }    

}
