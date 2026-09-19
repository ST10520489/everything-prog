//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        String[] years = {"YEAR 1", "YEAR 2"};
        int[][] sales = {{300,150,700}, {250,200,600}};
        int tot = 0;
        int totEle = 0;
        int min = sales[0][0];
        int max = sales[0][0];

        System.out.println();

        ProductSales product = new ProductSales();


        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("_______________________________________________");
        System.out.println("Total sales: " + product.TotalSales(sales));
        System.out.println("Average Sales: " + product.AverageSales(sales));
        System.out.println("Minimum Sale: " + product.MinSales(sales));
        System.out.println("Maximum Sale: " + product.MaxSales(sales));

        }
    }
