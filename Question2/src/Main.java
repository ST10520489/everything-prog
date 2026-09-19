//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StaffModel model = new StaffModel();
        model.StaffLocation = "West Key Store";
        model.StaffNumber= 16;
        model.StaffHiringProcess = "YES";

        PrintStaffHiring printStaff = new PrintStaffHiring(model);
        printStaff.Print();

        }
    }
