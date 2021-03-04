package com.example.lib;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        TestC testC = new TestC();
        testC.process();
    }
}

class TestC {
    int[][] arr;

    public void process() {
        int test = 3;
        int[] fiboArr = {0, 1, 3};
        for (int i = 0; i < test; i++) {
            arr = new int[41][2];
            arr[0][0] = 1;
            arr[0][1] = 0;
            arr[1][0] = 0;
            arr[1][1] = 1;
            int fiboNum = fiboArr[i];
            if (fiboNum == 0) {
                System.out.println("1 0");
                continue;
            }
            if (fiboNum == 1) {
                System.out.println("0 1");
                continue;
            }

            for (int j = 2; j <= fiboNum; j++) {
                fibo(j);
            }
            System.out.println(arr[fiboNum][0] + " " + arr[fiboNum][1]);
        }

    }

    public void fibo(int n) {
        arr[n][0] = arr[n - 1][0] + arr[n - 2][0];
        arr[n][1] = arr[n - 1][1] + arr[n - 2][1];
    }
}
