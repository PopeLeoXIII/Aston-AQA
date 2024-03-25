package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    // factorial - функция для расчета факториала числа n
    public static long factorial(long n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
