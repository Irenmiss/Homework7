import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1, 2, 3, 4 задачи");
        int[] integers = new int[]{1, 2, 3};
        for (int i = 0; i < integers.length; i++)
            if (i < integers.length - 1) {
                System.out.print(integers[i] + ", ");
            } else
                System.out.print(integers[i]);

        System.out.println();

        for (int i = integers.length - 1; i >= 0; i--)
            if (i > 0) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.print(integers[i]);
            }
        System.out.println();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 !=0) {
                integers[i] += 1;
                if (i < integers.length - 1) {
                    System.out.print(integers[i] + ", ");
                } else
                    System.out.print(integers[i]);
            }
        }

        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        for (int g = 0; g < fractions.length; g++)
            if (g < fractions.length - 1) {
                System.out.print(fractions[g] + ", ");
            } else
                System.out.print(fractions[g]);

        System.out.println();

        for (int g = fractions.length - 1; g >= 0; g--)
            if (g > 0) {
                System.out.print(fractions[g] + ", ");
            } else
                System.out.print(fractions[g]);
        System.out.println();

        int[] week = new int[7];
        for (int j = 0; j < week.length; j++) {
            week[j] = j + 1;
        }
        for (int j = 0; j < week.length; j++)
            if (j < week.length - 1) {
                System.out.print(week[j] + ", ");
            } else
                System.out.print(week[j]);
        System.out.println();
        for (int j = week.length - 1; j >= 0; j--)
            if (j > 0) {
                System.out.print(week[j] + ", ");
            } else
                System.out.print(week[j]);
    }
}

