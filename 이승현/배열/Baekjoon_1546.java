package array;

import java.util.*;

public class Baekjoon_1546 {
    public static void main(String[] args) {
        // 평균 = (과목1/최고점*100 + 과목2/최고점*100 + ... + 과목n/최고점*100)/n
        //     = (과목 점수들 합)/최고점*100/n

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];
        int sum = 0; // 과목 점수들 합

        for (int i = 0; i < n; i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }

        Arrays.sort(score);
        int max = score[n-1]; // 정렬 후 끝 점수가 최고점

        double average = (double) sum /max*100/n; // 명시적 형변환 -> double 과 int 의 연산이 되어 double 형이 담김
        System.out.println(average);
    }
}
