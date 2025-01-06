package Day2;

public class withGPT5 {
    public static void main(String[] args){
        int number = 4;
        int result = factorial(number);
        System.out.println(number + "의 팩토리얼: " + result);
    }

    public static int factorial(int num){
        if (num==1) { return 1; }
        return num*factorial(num-1);
    }
}
