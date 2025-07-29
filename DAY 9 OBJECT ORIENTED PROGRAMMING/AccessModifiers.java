
public class AccessModifiers {

    public static void main(String args[]) {
        BankAcc A1 = new BankAcc();
        A1.username = "shraddha@24";
        System.out.println(A1.username);
        A1.setPassword("pwd");
        // A1.password = "abcd"; Not possible to do it this way
    }
}

class BankAcc {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
