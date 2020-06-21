/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

public abstract class A1232OGraShape implements Comparable<A1232OGraShape>
{
    public abstract double area();
    public abstract double perimeter();

    public int compareTo(A1232OGraShape rhs)
    {
        double diff = area() - rhs.area();
        if (diff == 0)
            return 0;
        else if (diff < 0)
            return -1;
        else
            return 1;
    }

    public double semiperimeter()
    {
        return perimeter() / 2;
    }
}
