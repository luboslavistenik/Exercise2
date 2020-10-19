package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int d = 0;
        if(a == b)
            d += 2;
        if(a == c && d < 2)
            d += 2;
        if(b == c && d < 2)
            d += 2;
        if(a == b && a == c && b == c)
            d += 1;
        System.out.println(d);
    }
}
