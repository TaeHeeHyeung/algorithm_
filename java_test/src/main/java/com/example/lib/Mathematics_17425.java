package com.example.lib;

public class Mathematics_17425 {
    int [] result = new int[1000];
    public long process(int n) {
        for (int i = 0; i < n; i++) {
//            long num = f(sc.nextInt());
            long num = f(5);
            System.out.println(num);
        }
        return n;
    }

    public long f(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += n / i * i;
        }

        return result;
    }

}