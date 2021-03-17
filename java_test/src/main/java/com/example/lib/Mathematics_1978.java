package com.example.lib;

public class Mathematics_1978 {
    // 소수 : 1과 자기 자신만으로 이루어진 수
    // 약수가 없는 수
    // 1: 100개이하 입력
    // 2: 1000이하의 자연수
    int MAX_NUM = 1000;
    // 소수이면 true
    boolean[] sosu = new boolean[MAX_NUM + 1];

    boolean[] isCheck = new boolean[MAX_NUM + 1];

    public int process(int arr[]) {

        for (int i = 2; i <= MAX_NUM; i++) {
            if (!isCheck[i]) {
                if (isSosu(i)) {
                    sosu[i] = true;
                } else {
                    for (int j = 0; j * i <= MAX_NUM; j++) {
                        isCheck[i * j] = true;
                    }
                }
            }
        }
        int sosuNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sosu[arr[i]]) {
                sosuNum++;
            }
        }
        return sosuNum;
    }

    public boolean isSosu(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
