package com.company;



public class Method {


    public static double Trapezoid(double a, double b, int n) {

        double h = 0;
        double x = 0;
        double integral = 0;
        if (n > 1) {
            h = (b - a) / n;
            integral += Function.CaclFunc(a) + Function.CaclFunc(b);
            for (int i = 1; i < n; i++) {
                integral += 2 * (Function.CaclFunc(a + h * i));
                //System.out.println(integral);
            }
        }
        return ((b - a) / (2 * n) * integral);
    }

    public static double Simpson(double a, double b) {
        double fault = 0.0001f;
        double integral = fault + 1;
        double integral1 = 0;
        for (int N = 2; (N <= 10) ; N *= 2) {
            double h, sum2 = 0, sum4 = 0, sum = 0;
            h = (b - a) / (2 * N);
            for (int i = 1; i <= 2 * N - 1; i += 2) {
                sum4 += Function.CaclFunc(a + h * i);
                sum2 += Function.CaclFunc(a + h * (i + 1));
            }
            sum = Function.CaclFunc(a) + 4 * sum4 + 2 * sum2 - Function.CaclFunc(b);
            integral = integral1;
            integral1 = (h / 3) * sum;
        }
        return integral1;
    }

    public static double Cube2(double a, double b, double c, double d) {
        //double fault = 0.0001f;
        //double integral = fault + 1;
        double integral = 0;
        double hx = 0, hy = 0;
        double sum=0, sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
        for (int N = 2; N <= 10; N*=2) {
            hx = (b - a) / (2 * N);
            for (int M = 2; M <= 10; M*=2) {
                hy = (b - a) / (2 * M);
                for (int i = 1; i <= 2 * N - 1; i += 2){
                    sum1 += Function.CalcFunc2(a+hx*i, c+hy*i);
                    sum2 += Function.CalcFunc2(a+hx*(i+1), c+hy*i);
                    sum3 += Function.CalcFunc2(a+hx*(i+2), c+hy*i);
                    sum4 += Function.CalcFunc2(a+hx*i, c+hy*(i+1));
                    sum5 += Function.CalcFunc2(a+hx*(i+1), c+hy*(i+1));
                    sum6 += Function.CalcFunc2(a+hx*(i+2), c+hy*(i+1));
                    sum7 += Function.CalcFunc2(a+hx*i, c+hy*(i+2));
                    sum8 += Function.CalcFunc2(a+hx*(i+1), c+hy*(i+2));
                    sum9 += Function.CalcFunc2(a+hx*(i+2), c+hy*(i+2));
                }
                sum = sum1 + 4*sum2 + sum3 + 4*sum4 + 16*sum5 + 4*sum6 + sum7 + 4*sum8 + sum9;
                integral = ((hx*hy) / 9) * sum;
            }
        }
        return integral;
    }
  }


