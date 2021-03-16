package com.example.lib;

import java.io.*;

public class Mathematics_17427 {
    static final int MAX = 1000000;

    static long[] resultArr = new long[MAX + 1];
    static long[] s = new long[MAX + 1];

    public void process(final int num) throws NumberFormatException, IOException, IOException {
        // 값 할당 (초기값)
        for (int i = 1; i < num; i++) {
            resultArr[i] = 1;
        }

        // 값 할당
        for (int i = 2; i < num; i++) {
            for (int j = 1; i * j < num; j++) {
                resultArr[i * j] += i;
            }
        } // end for

        for (int i = 1; i < num; i++) {
            s[i] = s[i - 1] + resultArr[i];
        } // end for

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(s[n] + "\n");
        }
        bw.flush();
    }
}

