/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

public class A1232OGraCircle extends A1232OGraShape
{

    public A1232OGraCircle(double rad)
    {
        radius = rad;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public String toString()
    {
        return String.format("%17s %s %-50.2f %51s %-25.2f %s %.2f",
                        "Circle:", "radius:", radius, "area:", area(), "perimeter:" , perimeter());
    }

    private double radius;
}
