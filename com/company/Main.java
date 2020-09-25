package com.company;
public class Main {

    public static void main(String[] args) {
	double a=0.8f;
	double b=1.762f;
	int n=100;
	System.out.println(Method.Trapezoid(a,b,n));
	System.out.println(Method.Simpson(a,b));
	double a2=-1.0f, b2=1.0f, c2=-1.0f, d2=1.0f;
	System.out.println(Method.Cube2(a2, b2, c2, d2));
    }
}

