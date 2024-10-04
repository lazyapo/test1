package com.lazy.www;

import java.util.Random;
import java.util.Scanner;

public class helloworld
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rand.nextInt(100);
        System.out.println(a);
        while(true)
        {
            System.out.println("请输入： ");
            int b = sc.nextInt();
            if(b==a)
            {
                System.out.println("恭喜");
                break;
            }
            else
            {
                System.out.println("未猜中a");
                System.out.println("未猜中a");
                System.out.println("hot");
                System.out.println("GitHub");
            }
        }
        System.out.println(a);
    }
}


























