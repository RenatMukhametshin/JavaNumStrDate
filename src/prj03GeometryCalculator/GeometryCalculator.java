package prj03GeometryCalculator;

import java.lang.Math;

public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) { return Math.PI * Math.pow(Math.abs(radius), 2); }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(Math.abs(radius), 3);
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if( a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if(isTriangleRightAngled(a, b ,c)){
            double p = (a + b + c ) * 0.5;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
          return -1.0;
        }
    }
}
