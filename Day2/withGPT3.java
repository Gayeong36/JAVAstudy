package Day2;

public class withGPT3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5};
        System.out.println("배열길이 = " + numbers.length);
        int sum = calculateSum(numbers);
        System.out.println("배열의 합은 " + sum + "입니다.");
    }

    public static int calculateSum(int[] nums){
        int sum = 0;
        for (int a : nums){
            sum += a;
        }
        return sum;
    }
}
