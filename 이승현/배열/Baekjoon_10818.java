package array;

import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr); // 오름차순 정렬

        System.out.println(arr[0] + " " + arr[num-1]);
    }
}