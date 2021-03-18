package com.example.lib;

import java.util.ArrayList;
import java.util.Scanner;

public class Mathematics_6588 {
    // false =>소수
    // true =>소수가 아닌 수
    static int MAX_NUM = 1000000;
    static boolean[] isCheck = new boolean[MAX_NUM + 1];
    static ArrayList<Integer> prime = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void process() {
        isCheck[0] = true;
        isCheck[1] = true;

        int pn = 0;
        for (int i = 2; i * i <= MAX_NUM; i++) {
            if (!isCheck[i]) {
                prime.add(i);
                for (int j = i + i; j <= MAX_NUM; j += i) {
                    isCheck[j] = true;
                }
            }
        } // end for
        while (true) {
            int num1 = sc.nextInt();
            if (num1 == 0)
                return;
            // A + B =N
            // num -소수 = 소수
            for (int i = 0; i <= num1; i++) {
                int value = num1 - prime.get(i);
                if (!isCheck[value]) {
                    System.out.println(num1 + " = " + prime.get(i) + " + " + (value));
                    break;
                }
                if (i == num1) {
                    System.out.println("Goldbach's conjecture is wrong");
                }
            }
        }

    }

}
