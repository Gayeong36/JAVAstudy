package exampleSort;
import java.util.Arrays;

// 버블정렬 - 인접한 두 수를를 비교해서
//            큰 값을 뒤로 보낸다.
//            (왼쪽 수가 크다면 순서를 바꾼다. (오름차순 기준))

public class bubbleSort {
    public static void main(String[] args){
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("정렬 전 : " + Arrays.toString(numbers));
        bubbleSort(numbers); // 버블정렬
        System.out.println("정렬 후 : "+ Arrays.toString(numbers));

    }

    public static void bubbleSort(int[] array){ // 버블정렬 메소드
        int n = array.length;

        for (int i = 0; i < n-1; i++){ // 배열 반복 
            for (int j = 0; j < n-1-i; j++) {// 인접한 요소 비교
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; // 순서바꾸기(swap)
                }
                System.out.println("과정"+i+j+" = "+Arrays.toString(array));
            }
        }
    }
}