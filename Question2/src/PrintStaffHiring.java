public class PrintStaffHiring extends Staff {
    public PrintStaffHiring(StaffModel model) {
        super(model);
    }
    public void Print()
    {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("***********************************************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}


