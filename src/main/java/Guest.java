public class Guest {
    private String guestUsername;
    private String guestPassword;
    private String guestRealName;
    private String guestPassportID;
    private String guestPhone;
    private String guestEmail;

    public Guest(String guestUsername, String guestPassword, String guestRealName,
                 String guestPassportID, String guestPhone, String guestEmail) {
        this.guestUsername = guestUsername;
        this.guestPassword = guestPassword;
        this.guestRealName = guestRealName;
        this.guestPassportID = guestPassportID;
        this.guestPhone = guestPhone;
        this.guestEmail = guestEmail;
    }

    public String getGuestUsername() {
        return guestUsername;
    }

    public void setGuestUsername(String guestUsername) {
        this.guestUsername = guestUsername;
    }

    public String getGuestPassword() {
        return guestPassword;
    }

    public void setGuestPassword(String guestPassword) {
        this.guestPassword = guestPassword;
    }

    public String getGuestRealName() {
        return guestRealName;
    }

    public void setGuestRealName(String guestRealName) {
        this.guestRealName = guestRealName;
    }

    public String getGuestPassportID() {
        return guestPassportID;
    }

    public void setGuestPassportID(String guestPassportID) {
        this.guestPassportID = guestPassportID;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }
}