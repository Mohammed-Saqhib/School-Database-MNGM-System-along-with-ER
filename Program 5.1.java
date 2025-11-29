import java.io.*;

public class Lab5_Inheritance {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Account Number :");
        int acno = Integer.parseInt(br.readLine());
        
        System.out.println("Enter Account Holder Name :");
        String acname = br.readLine();
        
        System.out.println("Enter Account Holder Address :");
        String acaddr = br.readLine();
        
        System.out.println("Enter Account Holder Phone :");
        String acphone = br.readLine();
        
        System.out.println("Enter Initial Balance :");
        double acbalance = Double.parseDouble(br.readLine());

        // Create object of the Child class
        savings_Account sa = new savings_Account(acno, acname, acaddr, acphone, acbalance);
        sa.accountholder();

        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. TOTAL INTEREST\n");

        System.out.println("\nEnter Process Choice(1-3):");
        ch = Integer.parseInt(br.readLine());

        // Logic from Image 4
        if(ch==1) {
            System.out.println("Enter deposit amount :");
            double dep = Double.parseDouble(br.readLine());
            sa.deposit(dep);
        }
        if(ch==2) {
            System.out.println("Enter Withdrawal amount :");
            double acw = Double.parseDouble(br.readLine());
            sa.withdraw(acw);
        }
        if(ch==3) {
            System.out.println("Enter the Interest percentage :");
            double acin = Double.parseDouble(br.readLine());
            sa.calculateinterest(acin);
        }
    }
}
