package com.example.lib;

public class Mathematics_4375 {

    public int process(int n) {
        int num = 0;
        for (int i = 1;; i++) {
            num = num * 10 + 1;
            num %= n;
            if (num == 0) {
                return i;
            }
        }
    }
  /*  public long process(int n) {
        long result = 1;

        for (int i = 1; i <= 10000; i++) {
            long mode = result % n;
            if (mode % n == 0) {
                return i;
            }
            result += Math.pow(10, i);
        }
        return -1;
    }*/
}
