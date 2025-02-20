package com.nv.ui;
import java.util.Scanner;

import com.nv.blogic.Substraction;
import com.nv.blogic.Division;
import com.nv.blogic.Addition;
import com.nv.blogic.Multiplication;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int fno = scn.nextInt();
        System.out.println("Enter the second Number : ");
        int sno = scn.nextInt();
        System.out.println("Addition is : " + Addition.add(fno, sno));
        System.out.println("Multiplication is : " + Multiplication.mul(fno, sno));
        System.out.println("Substraction is : " + Substraction.sub(fno, sno));
        System.out.println("Division is : " + Division.div(fno, sno));
    }
}
