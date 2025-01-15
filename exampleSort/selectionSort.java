package exampleSort;
import java.util.Arrays;

// 선택 정렬
// 배열에서 가장 작은 값을 찾아 현재 위치와 교환
// 시간이 가장 많이 걸림

public class selectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("정렬 전 : " + Arrays.toString(numbers));
        selectionSort(numbers);        
        System.out.println("정렬 후 : " + Arrays.toString(numbers));
    }
    public static void selectionSort(int[] array){
        int n = array.length;

        for (int i=0; i<n-1; i++){
            int minIndex = i; // 현재 위치를 최소값의 인덱스로 설정

            // 정렬하지지 않은 부분에서 최소값 찾기
            for (int j=i+1; j<n; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j; // 최소값의 인덱스 업데이트
                    System.out.println("최소값 = "+array[minIndex]);
                }
            }
            // 최소값을 현재 위치로 이동(스왑)
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            System.out.println("과정"+i+" = "+Arrays.toString(array));
            
        }
    }
}
