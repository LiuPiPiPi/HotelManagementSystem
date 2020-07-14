import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    private final String[] roomType = new String[]{
//            "Large room with double beds",
//            "Large room with a large single bed",
//            "Small room with a single bed",
//            "VIP room"};

    public static void init() {
        // TODO: 2020/6/8
    }

    public static void main(String[] args) {
        init(); // initial room data

        // choose a mode which HMS should work in
        System.out.println("Please choose a mode:\n1. Guest Mode\n2. Staff Mode");

        // read the input and judge
        Scanner scanner = new Scanner(System.in);
        int userModeNum = scanner.nextInt();
        if (userModeNum == 1) {
            int guestStatus = 0; // status: whether guest login HMS

            System.out.println("======GUEST MODE======");
            System.out.println("Please choose a type of service:");
            System.out.println("1. Register a new account\n2. Login");

            int guestServiceNum = scanner.nextInt();
            if (guestServiceNum == 1) {
                System.out.print("Username: ");
                String guestUsername = scanner.next();
                do {
                    if (GuestService.isRegistered(guestUsername)) {
                        System.out.println("This account already exists, please re-enter an account:");
                        guestUsername = scanner.next();
                    }
                } while (GuestService.isRegistered(guestUsername));
                System.out.print("Password: ");
                String guestPassword = scanner.next();
                System.out.print("Real Name: ");
                String guestRealName = scanner.next();
                System.out.print("Passport ID: ");
                String guestPassportID = scanner.next();
                System.out.print("Phone Number: ");
                String guestPhone = scanner.next();
                System.out.print("Email: ");
                String guestEmail = scanner.next();

                // successfully registered
                System.out.println("Successfully registered!");
                GuestService.addGuest(guestUsername, guestPassword, guestRealName, guestPassportID,
                        guestPhone, guestEmail);
                Guest guest = new Guest(guestUsername, guestPassword, guestRealName,
                        guestPassportID, guestPhone, guestEmail);
                guestStatus = 1;
            } else if (guestServiceNum == 2) {
                System.out.print("Username: ");
                String guestUsername = scanner.next();
                System.out.print("Password: ");
                String guestPassword = scanner.next();
                Guest guest = GuestService.findByUsername(guestUsername);
                while(!guestPassword.equals(guest.getGuestPassword())) {
                    System.out.println("Wrong password! Please input again: ");
                    guestPassword = scanner.next();
                }
                // login successful
                System.out.println("Login successful!");
                guestStatus = 1;
            }

            // guest successfully login
            if (guestStatus == 1) {
                // TODO
            }
        } else if (userModeNum == 2) {
            int staffStatus = 0; // status: whether staff login HMS

            System.out.println("======STAFF MODE======");
            System.out.println("Please input your username and password:");
            System.out.print("Username: ");
            String staffUsername = scanner.next();
            while (!StaffService.staffExists(staffUsername)) {
                System.out.println("Staff account does not exist! Please re-input:");
                staffUsername = scanner.next();
            }
            System.out.print("Password: ");
            String staffPassword = scanner.next();
            Staff staff = StaffService.findByUsername(staffUsername);
            while(!staffPassword.equals(staff.getStaffPassword())) {
                System.out.println("Wrong password! Please input again: ");
                staffPassword = scanner.next();
            }

            // login successful
            System.out.println("Login successful!");
            staffStatus = 1;

            if (staffStatus == 1) {
                // TODO
            }
        }
    }
}
