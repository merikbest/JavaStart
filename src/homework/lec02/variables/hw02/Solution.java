package homework.lec02.variables.hw02;

public class Solution {
    public static void main(String[] args) {
       triangleArea(3,7,5);
    }

    public static void triangleArea (double aSide, double bSide, double cSide) {
        double p = (aSide + bSide + cSide) / 2.0;
        double s = Math.sqrt(p * ((p - aSide) *(p - bSide) * (p - cSide)));
        if (Double.isNaN(s))
            System.out.println("Треугольник не может существовать");
        else
            System.out.println("Площадь треугольника = " + s);
    }
}