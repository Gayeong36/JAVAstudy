package exampleSort;
import java.util.Arrays;

// 병합정렬
// 분할 정복 기법 사용
// 데이터를 계속 반으로 나누고(배열 크기가 1이 될 때 까지), 정렬한 다음 합침
// 데이터 분할 시 재귀함수 사용

public class mergeSort {
    public static void main(String[] args){
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("정렬 전 : "+Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("정렬 후 : "+Arrays.toString(numbers));
    }
    
    // 병합 정렬 함수
    public static void mergeSort(int[] array){
        if (array.length < 2){ // 배열의 크기가 1이면 정렬 필요 x
            return;
        }

        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length); // 반으로 나누기

        mergeSort(left); mergeSort(right); // 정렬
        merge(array, left, right); // 배열 두개 병합
    }
        // 병합 함수
    public static void merge(int[] array, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        //두 배열 비교하여 작은 값 병합
        while (i<left.length && j<right.length){
            if(left[i] <= right[j]){
                array[k++] = left[i++];
            } else {
            array[k++] = right[j++];
            }
        }

        // 남은 요소 병합
        while (i<left.length){
            array[k++] = left[i++];
        }
        while(j<right.length){
            array[k++] = right[j++];
        }
    }
}
        // 분할
        // [5, 3, 8, 4, 2] → [5, 3] [8, 4, 2]
        // [5, 3] → [5] [3]
        // [8, 4, 2] → [8] [4, 2]
        // [4, 2] → [4] [2]

        // 병합
        // [5] [3] → [3, 5]
        // [4] [2] → [2, 4]
        // [8] [2, 4] → [2, 4, 8]
        // [3, 5] [2, 4, 8] → [2, 3, 4, 5, 8]
