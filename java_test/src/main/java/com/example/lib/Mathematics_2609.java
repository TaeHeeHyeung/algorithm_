package com.example.lib;

public class Mathematics_2609 {
    // 최대 공약수 공통된 약수중 가장 큰 값
    // 최소 공배수 공통된 배수중 가장 작은 값

    // 두 값은 10,000 이하의 자연수
    // 공약수 n1 %n2 =R -> n2%R = 0 일때 R은 최대 공약수
    public static void process(int n1, int n2) {

        int gcd;
        if (n2 == 0) {
            gcd = n1;
        } else {
            gcd = GCD(n2, n1 % n2);
        }
        System.out.println(gcd);

        int lcm = LCM(n1, n2, gcd);
        System.out.print(lcm);
    }

    // 10 24 -> 1 2 5 10 // 1 2 3 4 6 8 12 24 :2
    // 24% 10 =4 , 10 %4 =2 , 4 %2= 0
    // 3 2 => 3%2 =1
    public static int GCD(int n2, int n1) {
        while (n1 !=0) {
            int r = n2%n1;
            n2= n1;
            n1= r;
        }
        return n2;
    }

    // 10 24 => 1
    public static int LCM(int n1, int n2, int g) {
        return n1 * n2 / g;
    }
}
