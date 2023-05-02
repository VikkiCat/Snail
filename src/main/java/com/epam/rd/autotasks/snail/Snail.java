package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        int a,b,h;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        h = scan.nextInt();

        int distance;
        int day;

        for(distance = a, day = 1; distance < h; distance += a, day++) {
            distance -= b;
            if (distance==0){
                break;
            }
        }

        if (distance<=0||day<0){
            System.out.println("Impossible");
        } else System.out.println(day);

    }
}
