//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] sales = {{25, 15, 35}, {25, 55, 35}, {11, 20, 45}, {17, 27, 25}};
        String[] cars = {"SUV", "COUPE", "SEDAN", "VAN"};
        String[] months = {"JAN", "FEB", "MAR"};

        int total = 0;
        int suv = sales[0][0];
        int coupe = sales[1][0];
        int sedan = sales[2][0];
        int van = sales[3][0];

        System.out.println("************************************************");
        System.out.println("VEHICLES SALES REPORT");
        System.out.println("************************************************");

        System.out.printf("%-10s", "");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-8s", months[i]);
        }
        System.out.printf("%-12s", "TOTAL SALES");
        System.out.println("****************************************************");

        System.out.println();
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-10s", cars[i]);
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length;
                 j++) {
                System.out.printf("%-8d", sales[i][j]);
                rowTotal += sales[i][j];
            }
            System.out.println();
        }
        System.out.println("****************************************************");

        for (int j = 0; j < months.length; j++) {
            int monthlyTotal = 0;

            for (int i = 0; i < sales.length; i++) {
                monthlyTotal += sales[i][j];
            }
            String status = (monthlyTotal >= 100) ? "Gold Status" : "Silver Status";
            System.out.printf("%-8s: Total Sales = %-5d -> %s", months[j], monthlyTotal, status);
        }
    }
}