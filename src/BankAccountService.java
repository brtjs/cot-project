class BankAccountService extends BankAccount {
String name=super.getHolderName();
int acNumber=super.getAccountNumber();
public void displayDepositBalance(int depositAmount){
    int depo=super.getBalance();

    int remainingAmount=depo+depositAmount;
super.setBalance(remainingAmount);
System.out.println("account holder name " +name);
System.out.println("account number "+acNumber);
System.out.println("balance amount "+remainingAmount);
}

public void displayWithdrawBalance(int withdrawAmount){
    int with=super.getBalance();
   int reaminingAmountAfterWithdraw = with-withdrawAmount;

   super.setBalance(reaminingAmountAfterWithdraw);
    if (withdrawAmount>with){
        System.out.println("not enough balance");
    }else {
        System.out.println("remaining amount after withdraw " + reaminingAmountAfterWithdraw);
    }
}
}
