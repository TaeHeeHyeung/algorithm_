package com.example.lib;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Mathematics_1929 p = new Mathematics_1929();
        //N : 1~1000,000 => 제한시간 0.5초
        p.process(3,1000000);
    }
}

