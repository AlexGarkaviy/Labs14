package com.company;

/**
 * Created by garkaviy on 12.01.2017.
 */
//Напишите программу консоли, которая печатает результат каждой из
//арифметических операций (+, -, /, *, %) для двух
//переменных примитивных типов данных.
public class Labs142 {
    public static void main(String[] args) {


        int a = 3;
        int s = 7;
        int z = a + s;
        int x = a - s;
        int c = a / s;
        int b = a * s;
        int v = a % s;
        System.out.println("переменные int a = 7, int s = 3 " + "\n" +
                "действие a + s = " + z + "\n" + "действие a - s = " + x +
                "\n" + "действие a / s  = " + c + " \n" + "действие a * s = " +
                b + "\n" + "действие a % s = " + v);
        System.out.println();

        System.out.println(z);
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
        System.out.println(v);
    }
}