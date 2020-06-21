/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1232OGra
{

    public static void main(String [] args)
    {

        ArrayList<A1232OGraShape> shapes = new ArrayList<>();

        Scanner keyIn = new Scanner(System.in);

        mainMenu(shapes, keyIn);

    }

    private static void mainMenu(ArrayList<A1232OGraShape> shapeArr, Scanner keyIn)
    {
        A1232OGraPrint.printMainMenu(shapeArr);
        A1232OGraPrint.printPromptArrow();

        Scanner lineScan = getInput(keyIn);

        while (lineScan.hasNext()) {
            String result = lineScan.next().toUpperCase();

            if (result.equals("SHAPE"))
            {
                A1232OGraPrint.printShapeMenu();
                A1232OGraPrint.printPromptArrow();

                inputShape(shapeArr, keyIn);

                A1232OGraPrint.printSuccessMessage();
                mainMenu(shapeArr, keyIn);
            }
            else if (result.equals("REPORT"))
            {
                if (shapeArr.size() > 0)
                {
                    A1232OGraPrint.printReportMenu();
                    A1232OGraPrint.printPromptArrow();

                    int reportType = inputDesiredReportFormat(keyIn, 4);

                    A1232OGraPrint.printReportMenuSortType();
                    A1232OGraPrint.printPromptArrow();

                    int ascendingOrDescending = inputDesiredReportFormat(keyIn, 2);

                    A1232OGraSort.sortReportBasedOnInput(shapeArr, reportType, ascendingOrDescending);

                    A1232OGraPrint.printReportHeader();
                    A1232OGraPrint.displayArray(shapeArr);

                    mainMenu(shapeArr, keyIn);
                }
                else
                {
                    System.out.println("No information to display.");
                    mainMenu(shapeArr, keyIn);
                }
            }
            else
            {
                A1232OGraPrint.printCourteousReminder();
                A1232OGraPrint.printMainMenu(shapeArr);
                A1232OGraPrint.printPromptArrow();
                lineScan = getInput(keyIn);
            }
        }
    }

    private static Scanner getInput(Scanner keyIn)
    {
        String nextLine = keyIn.nextLine();

        Scanner lineScan = new Scanner(nextLine);

        if (lineScan.hasNext("[qQ][uU][iI][tT]"))
            System.exit(-1);

        return lineScan;
    }

    private static void inputShape(ArrayList<A1232OGraShape> shapeArr, Scanner keyIn)
    {
        Scanner lineScan = getInput(keyIn);

        while (lineScan.hasNext()) {

            String result = lineScan.next().toUpperCase();

            switch (result) {
                case "CIRCLE":
                    A1232OGraPrint.circleInput();
                    shapeArr.add(new A1232OGraCircle(inputShapeDimension(keyIn)));
                    break;
                case "RECTANGLE":
                    A1232OGraPrint.rectangleInput();
                    shapeArr.add(new A1232OGraRectangle(inputShapeDimension(keyIn), inputShapeDimension(keyIn)));
                    break;
                case "SQUARE":
                    A1232OGraPrint.oneSideInput();
                    shapeArr.add(new A1232OGraSquare(inputShapeDimension(keyIn)));
                    break;
                case "HEXAGON":
                    A1232OGraPrint.oneSideInput();
                    shapeArr.add(new A1232OGraRegularHexagon(inputShapeDimension(keyIn)));
                    break;
                case "OCTAGON":
                    A1232OGraPrint.oneSideInput();
                    shapeArr.add(new A1232OGraRegularOctagon(inputShapeDimension(keyIn)));
                    break;
                default:
                    A1232OGraPrint.printCourteousReminder();
                    A1232OGraPrint.printShapeMenu();
                    A1232OGraPrint.printPromptArrow();
                    lineScan = getInput(keyIn);
            }
        }
    }

    private static int inputDesiredReportFormat(Scanner keyIn, int maxNumOfChoices)
    {
        Scanner lineScan = getInput(keyIn);

        int answer = 1;

        while (lineScan.hasNext())
        {
            if (lineScan.hasNextInt()) {
                answer = lineScan.nextInt();

                if (answer >= 1 && answer <= maxNumOfChoices)
                {
                    return answer;
                }
                else
                {
                    A1232OGraPrint.printCourteousReminder();
                    A1232OGraPrint.printPromptArrow();
                    lineScan = getInput(keyIn);
                }
            }
            else
            {
                A1232OGraPrint.printCourteousReminder();
                A1232OGraPrint.printPromptArrow();
                lineScan = getInput(keyIn);
            }

        }
        return answer;
    }

    private static double inputShapeDimension(Scanner keyIn)
    {
        A1232OGraPrint.printPromptArrow();

        Scanner lineScan = getInput(keyIn);

        double input = 0.0;

        while (lineScan.hasNext())
        {
            if (lineScan.hasNextDouble())
            {
                input = lineScan.nextDouble();
                if (input > 0)
                {
                    return input;
                }
                else
                {
                    A1232OGraPrint.printNonNegMessage();
                    A1232OGraPrint.printPromptArrow();
                    lineScan = getInput(keyIn);
                }
            }
            else
            {
                A1232OGraPrint.printNonNegMessage();
                A1232OGraPrint.printPromptArrow();
                lineScan = getInput(keyIn);
            }
        }

        return input;
    }

}
