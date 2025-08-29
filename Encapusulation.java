import java.util.*;

class Employee {
    private int accountBalance;
    private int upiPin = 12345;

    public void setAccountBalance(int accountBalance) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your UPI PIN: ");
        int pin = sc.nextInt();

        if (pin == upiPin) {
            this.accountBalance = accountBalance;
            System.out.println("Account balance updated successfully.");
        }
        
        else
        System.out.println("Incorrect UPI PIN. Account balance not updated.");
    }

    public int getAccountBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your UPI PIN: ");
        int pin = sc.nextInt();

        if (pin == upiPin) {
            System.out.println("Account balance retrieved successfully.");
            return accountBalance;
        }
        
        else
        System.out.println("Incorrect UPI PIN. Cannot retrieve account balance.");

        return -1;
    }
}

public class Encapusulation {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        s1.setAccountBalance(5000);

        int balance = s1.getAccountBalance();

        if(balance!=-1){
          System.out.println(balance);
        }
        
    }
}