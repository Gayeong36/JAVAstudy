package Day2;

public class withGPT4 {
    public static void main(String[] args){
        int number = 12;
        int result = factorial(number);
        System.out.println(number + "의 팩토리얼: " + result);
    }

    public static int factorial(int num){
        int fac = 1;
        while (num > 1){
            fac = fac*num;
            num = num-1;
        }
        return fac;
    }

}
