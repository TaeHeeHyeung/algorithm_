package com.example.lib;

public class Mathematics_17427 {
    public long process(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += n / i * i;
        }

        return result;
    }

    public long f(int a) {
        double sqrtA = Math.sqrt(a);
        int result = 0;
        for (int i = 1; i <= sqrtA; i++) {
            if (i == sqrtA) {
                result += sqrtA;
            } else if (a % i == 0) {
                result += i;
                result += a / i;
            }
        }
        return result;
    }
}
