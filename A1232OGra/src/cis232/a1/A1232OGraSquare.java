/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

public class A1232OGraSquare extends A1232OGraShape {

    public A1232OGraSquare(double sd)
    {
        side = sd;
    }

    public double area()
    {
        return side * side;
    }

    public double perimeter()
    {
        return 4 * side;
    }

    public String toString()
    {
        return String.format("%17s %45s %-25.2f %38s %-25.2f %s %.2f",
                        "Square:", "length of one side:", side, "area:", area(), "perimeter:" , perimeter());
    }

    private double side;

}
