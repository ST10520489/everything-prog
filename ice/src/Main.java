//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
        String[] quarters = {"Q1", "Q2", "Q3", "Q4"};
        int[][] sales = {{100, 150, 70}, {88, 92, 103}, {75, 45, 90}, {65, 95, 175}};

        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("************************************************");
        System.out.printf("%-12s %-12s %-12s %-12s\n", "QUARTER", brands[0], brands[1], brands[2]);
        System.out.println("************************************************");

        for (int i = 0; i < quarters.length; i++) {
            System.out.printf("%-12s ", quarters[i]);
            System.out.printf("%-12d ", sales[0][i]);
            System.out.printf("%-12d ", sales[1][i]);
            System.out.printf("%-12d\n", sales[2][i]);
        }
        System.out.println("*****************************************************");

        int[] totals = new int[3];
        double[] averages = new double[3];
        int[] mini = new int[3];
        int[] maxi = new int[3];

        for (int b = 0; b < sales.length; b++) {
            int total = 0;
            int min = sales[b][0];
            int max = sales[b][0];

            for (int i = 0; i < sales[b].length; i++) {
                int value = sales[b][i];
                total += value;
                if (value < min) min = value;
                if (value > max) max = value;
            }
            totals[b] = total;
            averages[b] = (double) total / sales[b].length;
            mini[b] = min;
            maxi[b] = max;
        }
        System.out.printf("%-12s", "TOTAL: ");
        System.out.printf("%-12d", totals[0]);
        System.out.printf("%-12d", totals[1]);
        System.out.printf("%-12d\n", totals[2]);

        System.out.printf("%-12s %-12d %-12d %-12d\n", "MIN", mini[0], mini[1], mini[2]);
        System.out.printf("%-12s %-12d %-12d %-12d\n", "MAX", maxi[0], maxi[1], maxi[2]);
        System.out.println("*********************************************************");
    }
}