package com.example.lib;

//실패=> 에라토스테네스의체를 사용해라
public class Mathematics_1929 {
    int MAX_NUM = 1000000;
    boolean[] isCheck = new boolean[MAX_NUM + 1];

    public void process(int num1, int num2) {
        isCheck[0] = true;
        isCheck[1] = true;

        // 제곱수 이후 부터는 직접 찾아가면서 배수처리할 예정
        // 2, 100까지 입력시
        // 2의배수 -> 100까지
        // 3의배수-> 100까지
        // 4의 배수 ->100 까지
        // ..
        // 10의배수 100까지
        // 11->이후는 처리안함
        for (int i = 2; i * i <= num2; i++) {
            if (!isCheck[i]) {
                for (int j = i + i; j <= num2; j += i) {
                    isCheck[j] = true;
                }
            }
        } // end for

        for (int i = num1; i <= num2; i++) {
            if (!isCheck[i]) {
                System.out.println(i);
            }
        }

    }

}
