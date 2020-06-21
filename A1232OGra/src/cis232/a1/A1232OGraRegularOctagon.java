/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

public class A1232OGraRegularOctagon extends A1232OGraShape {

    public A1232OGraRegularOctagon(double sd)
    {
        side = sd;
    }

    public double area()
    {
        return 2 * (1 + Math.sqrt(2)) * (side * side);
    }

    public double perimeter()
    {
        return 8 * side;
    }

    public String toString()
    {
        return String.format("%17s %45s %-25.2f %38s %-25.2f %s %.2f",
                        "Regular Octagon:","length of one side:", side, "area:", area(), "perimeter:" , perimeter());
    }

    private double side;

}
