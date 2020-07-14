public class Staff {
    private int staffID;
    private String staffUsername;
    private String staffPassword;
    private String staffPhone;

    public Staff(int staffID, String staffUsername, String staffPassword, String staffPhone) {
        this.staffID = staffID;
        this.staffUsername = staffUsername;
        this.staffPassword = staffPassword;
        this.staffPhone = staffPhone;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }
}