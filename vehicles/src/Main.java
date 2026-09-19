//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                String[] vehicleTypes = {"SUV", "COUPE", "SEDAN", "VAN"};
                String[] months = {"JAN", "FEB", "MAR"};
                int[][] salesData = {{25, 15, 35}, {25, 55, 35}, {11, 20, 45}, {17, 27, 25}};

                System.out.println("**************************************************");
                System.out.println("VEHICLES SALES REPORT");
                System.out.println("**************************************************");

                System.out.printf("%-10s", "VEHICLE");
                for (String month : months) {
                    System.out.printf("%-8s", month);
                }

                for (int i = 0; i < salesData.length; i++) {
                    System.out.printf("%-10s", vehicleTypes[i]);
                    int rowTotal = 0;
                    for (int j = 0; j < salesData[i].length; j++) {
                        System.out.printf("%-8d", salesData[i][j]);
                        rowTotal += salesData[i][j];
                    }
                    System.out.printf("%-12d%n", rowTotal);
                }

                System.out.println();
                System.out.println("**************************************************");
                System.out.println("Vehicles total sales: " );
                System.out.println("***************************************************");
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                




























                
                
                
                
                
                
                
                
                



                System.out.println("**************************************************");
                System.out.println("MONTHLY STATUS REPORT");
                System.out.println("**************************************************");

                for (int j = 0; j < months.length; j++) {
                    int monthlyTotal = 0;
                    for (int i = 0; i < salesData.length; i++) {
                        monthlyTotal += salesData[i][j];
                    }
                    String status = (monthlyTotal >= 100) ? "Gold Status" : "Silver Status";
                    System.out.printf("%-8s Total Sales = %-5d -> %s%n", months[j], monthlyTotal, status);
                }
                System.out.println("**************************************************");
            }
        }
