package exampleSort;
import java.util.Arrays;

// 피벗 한 지점(보통 맨 앞이나 끝)을 지정해
// 피벗보다 작으면 왼쪽, 크면 오른쪽
// 퀵 정렬을 재귀적으로 호출 ,병합

public class quickSort {
    public static void main(String[] args) {
        int[] numbers = {2,7,5,4,6};
        System.out.println("정렬 전 : " + Arrays.toString(numbers));
        quickSort(numbers, 0, numbers.length-1);        
        System.out.println("정렬 후 : " + Arrays.toString(numbers));
    }

    // 퀵 정렬 메서드
    public static void quickSort(int[] array, int low, int high){
        if (low<high){
            int pivotIndex = partition(array, low, high); // 분할수행 후 피벗 위치 반환
            quickSort(array,low,pivotIndex-1); // 왼쪽부분 정렬
            quickSort(array,pivotIndex+1, high); // 오른쪽부분 정렬
        }
    }

    // 분할수행 메서드
    public static int partition(int[] array, int low, int high){
        int pivot = array[high]; // 마지막 요소를 피벗으로 선택
        int i = low-1; // 피벗보다 작은 요소의 인덱스

        for (int j=low; j<high; j++){
            if (array[j] <= pivot){ // 피벗보다 작거나 같으면 스왑
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗을 올바른 위치로 이동
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
}

// 마지막 요소를 피벗으로 선택
// 피벗보다 작은 값, 피벗보다 큰 값으로 배열 분할
// 두 배열을 가지고 다시 퀵 정렬 수행

// 한 수를 골라 그 수보다 작은 값, 큰 값으로 나눈 후
// 그 배열들을 다시 작,큰 으로 나눈다
// 그 뒤 병합한다.
