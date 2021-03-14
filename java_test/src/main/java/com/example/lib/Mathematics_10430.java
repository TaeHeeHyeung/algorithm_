package com.example.lib;

public class Mathematics_10430 {

    public void process(int A, int B, int C) {
        int result1 = (A + B) % C;
        int result2 = ((A % C) + (B % C)) % C;
        int result3 = (A * B) % C;
        int result4 = ((A % C) * (B % C)) % C;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
