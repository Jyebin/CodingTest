package sort;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insert_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insert_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int now = arr[i]; //현재값
            int beforeIdx = i - 1; //이전값의 index
            while (beforeIdx >= 0 && arr[beforeIdx] > now) { //이전 index가 0 이상이고 이전 값이 현재 값보다 크다면 while문 실행
                //while문 : index를 하나씩 뒤로 미뤄주기 위함
                arr[beforeIdx + 1] = arr[beforeIdx]; //다음 값에 현재 값 저장(한 칸씩 뒤로 밀리는 것)
                beforeIdx--; //이전 값으로 index를 이동하여 원래 탐색하려는 수로 이동
            }
            arr[beforeIdx + 1] = now; //비어있는 곳에 현재 값 저장
        }
    }
}
