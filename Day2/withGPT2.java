package Day2;

public class withGPT2 {
    public static void main(String[] args){
        int a = 12; int b = 24;
        int sum = add(a,b);
        printSum(sum);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void printSum(int sum){
        System.out.println(sum);
    }
}
