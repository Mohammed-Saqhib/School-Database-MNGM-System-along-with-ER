public class account_detail {
    int ac;
    String name, address, phone;
    double balance;

    account_detail(int i, String n, String a, String p, double d) {
        ac = i;
        name = n;
        address = a;
        phone = p;
        balance = d;
    }

    public void accountholder() {
        System.out.println("--------------------------");
        System.out.println("    ACCOUNT DETAILS    ");
        System.out.println("--------------------------");
        System.out.println("Account Number :" + ac);
        System.out.println("Account Holder Name :" + name);
        System.out.println("Account Holder Address :" + address);
        System.out.println("Account Holder Phone :" + phone);
        System.out.println("Account Holder Balance :" + balance);
    }
}

-----------------------------------------------------------------------------------------------------

public class savings_Account extends account_detail {
    
    savings_Account(int i, String n, String a, String p, double d) {
        super(i, n, a, p, d);
    }

    public void deposit(double amount) {
        System.out.println("OLD BALANCE :" + balance);
        balance += amount;
        System.out.println("Account Holder Balance :" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Account Holder Balance :" + balance);
    }

    public void calculateinterest(double intr) {
        double it = (balance * intr) / 100;
        System.out.println("Interest for Year :" + it);
    }
}
