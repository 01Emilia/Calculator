package com.example.calculator;
import java.util.*;
import java.lang.*;
import java.io.*;

public class calculator {


    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(500);;
        int b = randomGenerator.nextInt(500);;
        int resultA;
        int resultS;
        int resultS2;
        int add; {
            resultA = a + b;
            System.out.println(a + "+" + b + "=" + resultA);
        }
         int subtract; {
            resultS = a - b;
            System.out.println(a + "-" + b + "=" +resultS);
        }
        int subtract2; {
            resultS2 = b - a;
            System.out.println(b + "-" + a + "=" + resultS2);
        }
    }
}
