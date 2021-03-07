package com.example.lib;


import java.util.Arrays;
import java.util.Scanner;

public  class DP_9184_FunnyFunc {
    final int WEIGHT = 50;
    int[][][] arr;

    public void process() {

//        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
//        while (true) {
//            input[0] = sc.nextInt();
//            input[1] = sc.nextInt();
//            input[2] = sc.nextInt();
            input[0] = 50;
            input[1] = 50;
            input[2] = 50;
            arr = new int[101][101][101];

//            if (input[0] == -1 && input[1] == -1 && input[2] == -1) {
//                break;
//            }
            w(input[0], input[1], input[2]);

            print(input[0], input[1], input[2]);

//        }
    }// end process

    public int w(int a, int b, int c) {
        if (a > 20 || b > 20 || c > 20) {
            a = 20;
            b = 20;
            c = 20;
        }
        int a_save = a + WEIGHT;
        int b_save = b + WEIGHT;
        int c_save = c + WEIGHT;
        if (arr[a_save][b_save][c_save] != 0) {
            return arr[a_save][b_save][c_save];
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            arr[a_save][b_save][c_save] = 1;
        } else if (a > 20 || b > 20 || c > 20) {
            arr[a_save][b_save][c_save] = w(20, 20, 20);
        } else if (a < b && b < c) {
            arr[a_save][b_save][c_save] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            arr[a_save][b_save][c_save] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1)
                    - w(a - 1, b - 1, c - 1);
        }
        //test로그
//			if (a == WEIGHT && b == WEIGHT && c == WEIGHT) {
//				System.out.println("0,1,2: " + a + ", " + b + ", " + c + " :" + arr[a_save][b_save][c_save]);
//			}
//			System.out.println("0,1,2: " + a + ", " + b + ", " + c + " :" + arr[a_save][b_save][c_save]);

        return arr[a_save][b_save][c_save];
    }

    //Weight 예외처리 하여 출력
    public void print(int input, int input2, int input3) {
        int index1 =input + WEIGHT;
        int index2 =input2 + WEIGHT;
        int index3= input3 + WEIGHT;
        if (index1 > 70) {
            index1 =70;
        }
        if (index2 > 70) {
            index2 =70;
        }
        if (index3 > 70) {
            index3 =70;
        }

        System.out.println("w(" + input + ", " + input2 + ", " + input3 + ") = "
                + arr[index1][index2][index3]);
    }

}// end Class