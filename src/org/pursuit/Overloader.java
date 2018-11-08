package org.pursuit;

public class Overloader {
    public double doubleDivision(int a, int b){

        return (a/b * 2.0);
    }

    public double doubleDivision(int ans1, double ans2){
        return (ans1/ ans2);
    }
    public double doubleDivision(double num3, int num4){
        return (num3/ num4);
    }
}
