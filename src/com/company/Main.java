package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int b,c,count = 0,count2 = 0;
        double LE = 0;
        System.out.printf("Imput rows : ");
        b = scanner.nextInt();
        System.out.printf("Imput columns : ");
        c = scanner.nextInt();
        double a[][] = new double[b][c];

        for (int i = 0 ; i < b ; i++)
        {
            for (int j = 0 ; j < c ; j++)
            {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The array you just entered is : ");
        for (int i = 0 ; i < b ; i++)
        {
            for (int j = 0 ; j < c ; j++)
            {
                System.out.printf("a[" + i + "][" + j + "] = " + a[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0 ; i < b ; i++)
        {
            for (int j = 0 ; j < c ; j++)
            {
                if (j < c - 1)
                {
                    LE = a[i][j] > a[i][j + 1] ? a[i][j] : a[i][j + 1];
                }
                else
                    continue;
            }
        }
        System.out.println("The largest element is : " + LE);
        for (int i = 0 ; i < b ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (a[i][j] == LE)
                {
                    count++;
                }
            }
        }
        System.out.printf("It's position : ");
        for (int i = 0 ; i < b ; i++)
        {
            for (int j = 0 ; j < c ; j++)
            {
                if (a[i][j] == LE)
                {
                    System.out.print("a[" + i + "][" + j + "]");
                    if (count > 1 && count2 < count - 1)
                    {
                        System.out.print(" and ");
                        count2++;
                    }
                }
            }
        }
    }
}
