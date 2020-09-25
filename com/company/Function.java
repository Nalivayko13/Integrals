package com.company;

public class Function {

    public static double CaclFunc(double x){
        return Math.pow((1+Math.pow(x, 3)), 0.5);
    }

    public static double CalcFunc2(double x,double y){
        return 4-x*x-y*y;
    }
}
