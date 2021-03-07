package com.example.lib;


import java.util.Arrays;

public class DP_9184_FunnyFunc {
    int[][][] arr;

    public int w(int a, int b, int c) {
        int a_save = a + 50;
        int b_save = b + 50;
        int c_save = c + 50;
        if (arr[a_save][b_save][c_save] != 0) {
            return arr[a_save][b_save][c_save];
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            arr[a_save][b_save][c_save] = 1;
        } else if (a > 20 || b > 20 || c > 20) {
            arr[a_save][b_save][c_save] = w(20, 20, 20);
        } else if (a < b && b < c) {
            arr[a_save][b_save][c_save] =
                    w(a, b, c - 1)
                            + w(a, b - 1, c - 1)
                            - w(a, b - 1, c);
        } else {
            arr[a_save][b_save][c_save] =
                    w(a - 1, b, c)
                            + w(a - 1, b - 1, c)
                            + w(a - 1, b, c - 1)
                            - w(a - 1, b - 1, c - 1);
        }
        System.out.println("0,1,2: " + a + ", " + b + "," + c + " :" + arr[a_save][b_save][c_save]);
        return arr[a_save][b_save][c_save];
    }


    public void process() {
        //1. 0 ~ 100으로 입력받는다 가정하고 개발한다.
        //2. -50 ~ 50을 입력한다 가정할 때 어떻게 바뀌어야 될지 생각해보자
        //메모라이즈에 저장할 때 50 을 추가해서 저장한다.

        int i = 10;
        int i1 = 4;
        int i2 = 6;
        arr = new int[101][101][101];

        w(i, i1, i2);

        System.out.print("w(" + i + ", " + i1 + ", " + i2 + ") = " + arr[i + 50][i1 + 50][i2 + 50]);
    }

}
