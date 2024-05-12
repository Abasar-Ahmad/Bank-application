import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// for inisert input

        System.out.println("Enter your name , password and initial balance");
        String name=sc.next();
        String password=sc.next();
        int balance =sc.nextInt();
        SBIAccount kunalAcc=new SBIAccount(name,balance,password);
        System.out.println("Your account has been created with account number "+ kunalAcc.getAccountNo());

        // getBalance
        System.out.println("Your current balanace is "+kunalAcc.getBalanace());

        // deposit
        System.out.println(kunalAcc.depositMoney(500));
        System.out.println("New balance is " +kunalAcc.getBalanace());

        // withdraw
        System.out.println("Enter amount to  be withdraw: ");
        int amount=sc.nextInt();
        System.out.println("Enter your password to match");
        String enteredPassword=sc.next();
        System.out.printf(kunalAcc.withdraw(amount,enteredPassword));
        System.out.println("Current balance is "+kunalAcc.getBalanace());

        // Interest
        System.out.println("Interest for 4 yours on current balance "+kunalAcc.getBalanace()+ "  is "+kunalAcc.calculateIntrest(4));
    }
}