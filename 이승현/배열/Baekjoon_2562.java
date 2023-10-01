package array;

import java.util.*; // util 안에 있는 모든 클래스 임포트

public class Baekjoon_2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++){
            int num = sc.nextInt();
            if (num > max){
                max = num;
                index = i;
            }
        }

        sc.close();

        System.out.println(max);
        System.out.println(index+1);

    }
}
