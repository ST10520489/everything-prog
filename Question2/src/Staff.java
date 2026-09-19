public abstract class Staff implements iStaff {
    String place;
    int number;
    String decision;

    public Staff(StaffModel model){
        this.place = model.StaffLocation;
        this.number = model.StaffNumber;
        this.decision = model.StaffHiringProcess;
    }
    @Override
    public String getStaffLocation() { return place;}
    @Override
    public int getStaffNumber() { return number;}
    @Override
    public String getStaffHiringProcess() { return decision;}
}
