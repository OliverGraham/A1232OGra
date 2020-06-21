/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

import java.util.ArrayList;

public class A1232OGraPrint {

    public static void printPromptArrow()
    {
        System.out.print("---> ");
    }

    public static void printMainMenu(ArrayList<A1232OGraShape> shapeArr)
    {
        System.out.println("\n----MENU----");
        System.out.println("Type \"Shape\" to see a list of shapes to create.");
        if (shapeArr.size() > 0)
        {
            System.out.println("Type \"Report\" to view a report of the created shapes.");
        }
        System.out.println("Type \"Quit\" at anytime to quit.");
    }

    public static void printShapeMenu()
    {
        System.out.println("Type \"Circle\", \"Rectangle\", \"Square\", \"Hexagon\" or \"Octagon\".");
    }

    public static void printReportMenu()
    {
        System.out.println("Type \"1\" to show all shapes sorted by area.");
        System.out.println("Type \"2\" to show all shapes sorted by perimeter.");
        System.out.println("Type \"3\" to show all shapes, grouped by type, sorted by area.");
        System.out.println("Type \"4\" to show all shapes, grouped by type, sorted by perimeter.");
    }

    public static void printReportMenuSortType()
    {
        System.out.println("Type \"1\" to sort ascending from lowest value.");
        System.out.println("Type \"2\" to sort descending from highest value.");
    }

    public static void printReportHeader()
    {
        System.out.printf("%45s %30s %35s %34s %36s",
                "-----RADIUS-----", "-----LENGTH-----",
                "-----WIDTH-----", "-----AREA-----", "-----PERIMETER-----\n\n");
    }

    public static void circleInput()
    {

        System.out.println("Please enter value of radius: ");
    }

    public static void rectangleInput()
    {
        System.out.println("Enter length of side (line one) followed by width (line two):");
    }

    public static void oneSideInput()
    {
        System.out.println("Please enter value of one side: ");
    }

    public static void printCourteousReminder()
    {
        System.out.println("\nPlease type a valid command.");
    }

    public static void printNonNegMessage()
    {
        System.out.println("Please enter a non-negative number.");
    }

    public static void printSuccessMessage()
    {
        System.out.println("Shape successfully added.");
    }

    public static <AnyType> void displayArray(ArrayList<AnyType> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println((i + 1) + ". Shape: " + arr.get(i).toString());
        }
    }
}
