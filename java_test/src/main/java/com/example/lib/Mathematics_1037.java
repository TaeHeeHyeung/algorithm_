package com.example.lib;

public class Mathematics_1037 {
    public int process() {
        int num = 2;
        int maxNum = 0;
        int minNum = Integer.MAX_VALUE;
        int[] arr = new int[num];
        arr[0] = 4;
        arr[1] = 2;
        for (int i = 0; i < num; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        return maxNum * minNum;
    }
}
