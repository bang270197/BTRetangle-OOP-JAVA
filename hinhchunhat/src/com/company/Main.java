package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap Width ");
		double width=sc.nextDouble();
		System.out.println("Nhap height ");
		double height=sc.nextDouble();
	   Rectangle rectangle=new Rectangle( width, height);
		double result= rectangle.getArea();
	  double result1= rectangle.getPerimeter();
	  String result2= rectangle.disPlay();
		System.out.println("Area is "+result+"\n"+"Perimeter is "+result1+"\n"+"Display"+result2);
    }
}
