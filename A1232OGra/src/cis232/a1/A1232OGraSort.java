/*
    Oliver Graham / olivergraham916@gmail.com
    CIS 232 / Scovil
    Assignment 1
    Due: Monday, February 24th, 2020
 */

package cis232.a1;

import java.util.ArrayList;
import java.util.Comparator;

public class A1232OGraSort {

    static class ascendingComparatorArea implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            return lhs.compareTo(rhs);
        }
    }

    static class ascendingComparatorPerimeter implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.perimeter() > rhs.perimeter())
            {
                return 1;
            }
            else if (lhs.perimeter() < rhs.perimeter())
            {
                return -1;
            }

            return 0;
        }
    }

    static class descendingComparatorArea implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.area() > rhs.area())
            {
                return -1;
            }
            else if (lhs.area() < rhs.area())
            {
                return 1;
            }

            return 0;
        }
    }

    static class descendingComparatorPerimeter implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.perimeter() > rhs.perimeter())
            {
                return -1;
            }
            else if (lhs.perimeter() > rhs.perimeter())
            {
                return 1;
            }

            return 0;
        }
    }

    static class shapeAscendingComparatorArea implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.getClass().toString().compareTo(rhs.getClass().toString()) == 0)
            {
                return lhs.compareTo(rhs);
            }

            return lhs.getClass().toString().compareTo(rhs.getClass().toString());
        }
    }

    static class shapeAscendingComparatorPerimeter implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.getClass().toString().compareTo(rhs.getClass().toString()) == 0)
            {
                if (lhs.perimeter() > rhs.perimeter())
                {
                    return 1;
                }
                else if (lhs.perimeter() < rhs.perimeter())
                {
                    return -1;
                }
            }

            return lhs.getClass().toString().compareTo(rhs.getClass().toString());
        }
    }

    static class shapeDescendingComparatorArea implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.getClass().toString().compareTo(rhs.getClass().toString()) == 0)
            {
                if (lhs.area() > rhs.area())
                {
                    return -1;
                }
                else if (lhs.area() < rhs.area())
                {
                    return 1;
                }
            }

            return lhs.getClass().toString().compareTo(rhs.getClass().toString());
        }
    }

    static class shapeDescendingComparatorPerimeter implements Comparator<A1232OGraShape>
    {
        public int compare(A1232OGraShape lhs, A1232OGraShape rhs)
        {
            if (lhs.getClass().toString().compareTo(rhs.getClass().toString()) == 0)
            {
                if (lhs.perimeter() > rhs.perimeter())
                {
                    return -1;
                }
                else if (lhs.perimeter() < rhs.perimeter())
                {
                    return 1;
                }
            }

            return lhs.getClass().toString().compareTo(rhs.getClass().toString());
        }
    }


    private static <AnyType> void sort(ArrayList<AnyType> arr, Comparator<? super AnyType> cmp)
    {
        for (int i = 0; i < arr.size() - 1; i++)
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.size(); j++)
            {

                if (cmp.compare(arr.get(j), arr.get(minIndex)) < 0)
                    minIndex = j;

            }

            AnyType temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }

    }

    public static void sortReportBasedOnInput(ArrayList<A1232OGraShape> shapesArr, int reportType, int ascOrDesc)
    {

        if (ascOrDesc == 1)         // 1 == ascending
        {
            switch (reportType)
            {
                case 1:
                    sort(shapesArr, new ascendingComparatorArea());
                    break;
                case 2:
                    sort(shapesArr, new ascendingComparatorPerimeter());
                    break;
                case 3:
                    sort(shapesArr, new shapeAscendingComparatorArea());
                    break;
                case 4:
                    sort(shapesArr, new shapeAscendingComparatorPerimeter());
                    break;
            }
        }
        else if (ascOrDesc == 2)    // 2 == descending
        {
            switch (reportType)
            {
                case 1:
                    sort(shapesArr, new descendingComparatorArea());
                    break;
                case 2:
                    sort(shapesArr, new descendingComparatorPerimeter());
                    break;
                case 3:
                    sort(shapesArr, new shapeDescendingComparatorArea());
                    break;
                case 4:
                    sort(shapesArr, new shapeDescendingComparatorPerimeter());
                    break;
            }
        }

    }

}
