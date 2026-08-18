package user;

public class UserTest {

    public static void main(String[] args) {

        AdminUser admin = new AdminUser();

        admin.displayUserType();
        admin.showMessage();

        GuestUser guest = new GuestUser();

        guest.displayUserType();
        guest.showMessage();
    }
}