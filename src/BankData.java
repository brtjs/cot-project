import java.util.Scanner;

public class BankData extends BankAccountService {

    Scanner sc=new Scanner(System.in);

    public void userDetails(){
        System.out.println("enter account number");
        int accountNumber=sc.nextInt();
        sc.nextLine();
        super.setAccountNumber(accountNumber);
        System.out.println("enter name");
        String accountHolderName=sc.nextLine();
        super.setHolderName(accountHolderName);
    }

    public void selection(){
        int n;
        System.out.println("enter 1 for deposit");
        System.out.println("enter 2 for withdraw");
       n= sc.nextInt();
        if (n==1){
            System.out.println("enter amount for deposit");
          int depositAmount = sc.nextInt();
          super.displayDepositBalance(depositAmount);

        }
        System.out.println("enter amount for withdraw");
        int withdrawAmount=sc.nextInt();
        super.displayWithdrawBalance(withdrawAmount);
    }


}
