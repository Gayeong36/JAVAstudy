package exampleSort;
import java.util.Arrays;

// 삽입정렬 - 현재 값을 데이터를 쭉 보고
//            맞는 위치에 삽입한다.
//            정렬된 부분을 점점 확장하는 형식.

public class insertionSort {
    public static void main(String[] args){
        int[] numbers = {5, 2, 3, 1, 6};

        System.out.println("정렬 전 : "+Arrays.toString(numbers));
        
        insertionSort(numbers);
        System.out.println("정렬 후 : "+Arrays.toString(numbers));
    }

    public static void insertionSort(int[] array){ // 1부터5까지
        for (int i = 1; i<array.length; i++){
            int current = array[i]; // 현재값
            int j = i-1;

            // 정렬된 부분에서 현재 값보다 큰 요소들을 오른쪽으로 이동
            while (j>=0 && array[j]>current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current; // 현재 값을 올바른 위치에 삽입

            System.out.println("과정"+i+" = "+Arrays.toString(array));

        }

    }

}
