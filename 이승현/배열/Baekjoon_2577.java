package array;

import java.util.*;
import java.util.stream.Stream;

public class Baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int mul =  a * b * c;

        // 곱한 int 값을 int형 array로 바꾸기 (Stream 이용)
        int[] mul_arr = Stream.of(String.valueOf(mul).split("")).mapToInt(Integer::parseInt).toArray();

        int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i : mul_arr){ // for-each 문
            for (int j = 0; j <= 9; j++) {
                if (j == i){
                    num[j]++;
                    break;
                }
            }
        }

        for (int i : num){ // for-each 문
            System.out.println(i);
        }
    }
}
