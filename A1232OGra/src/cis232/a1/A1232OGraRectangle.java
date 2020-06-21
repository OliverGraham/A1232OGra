/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

public class A1232OGraRectangle extends A1232OGraShape
{
    public A1232OGraRectangle(double len, double wid)
    {
        length = len;
        width = wid;
    }

    public double area()
    {
        return length * width;
    }

    public double perimeter()
    {
        return 2 * ( length + width );
    }

    public String toString()
    {
        return String.format("%17s %45s %-25.2f %s %-25.2f %s %-25.2f %s %-25.2f",
                        "Rectangle:", "length:", length, "width:", width, "area:", area(), "perimeter:" , perimeter());
    }

    private double length;
    private double width;
}
