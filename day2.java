class Account{
  int acc_no, balance;

  public Account(int acc, int bal){
    this.acc_no = acc;
    this.balance = bal;
  }

  public int getAcc(){
    return acc_no;
  }

  public void setAcc(int newAcc){
    this.acc_no = newAcc;
  }

  public int getBal(){
    return balance;
  }

  public void setBal(int bala){
    this.balance = bala;
  }
}

class CheckingAccount extends Account{
  int overDraftLimit;

  public CheckingAccount(int acc_no, int bal, int overdraftlimit){
    super(acc_no, bal);
    this.overDraftLimit = overdraftlimit;
  }

  public int getOverDraft(){
    return overDraftLimit;
  }

  public void setOverDraft(int overdraft){
    this.overDraftLimit = overdraft;
  }
}

class SavingsAccount extends Account{
  float interestRate;

  public SavingsAccount(int acc_no, int bal, float interestrate){
    super(acc_no, bal);
    this.interestRate = interestrate;
  }

  public float getInterest(){
    return interestRate;
  }

  public void setInterest(float interestrate){
    this.interestRate = interestrate;
  }
}

/**
 * day2
 */
public class day2 {

  public static void main(String[] args) {
    CheckingAccount ca1 = new CheckingAccount(123456, 50000, 10);
    SavingsAccount sa1 = new SavingsAccount(987654, 90000, 8.5f);

    //Using Checking Account Methods
    System.out.println("Details for Checking Account -->");
    System.out.println("Account Number : " + ca1.getAcc());
    System.out.println("Balance : " + ca1.getBal());
    System.out.println("Over Draft : " + ca1.getOverDraft());

    // Setting the values
    ca1.setAcc(543210);
    ca1.setBal(80000);
    ca1.setOverDraft(20);

    System.out.println("New Account Number : " + ca1.getAcc());
    System.out.println("New Balance : " + ca1.getBal());
    System.out.println("New Over Draft : " + ca1.getOverDraft());

    // Using Savings Account Methods
    System.out.println("Details for Savings Account -->");
    System.out.println("Account Number : " + sa1.getAcc());
    System.out.println("Balance : " + sa1.getBal());
    System.out.println("Interest Rate : " + sa1.getInterest());

    // Setting the values
    sa1.setAcc(543210);
    sa1.setBal(80000);
    sa1.setInterest(7.25f);

    System.out.println("New Account Number : " + sa1.getAcc());
    System.out.println("New Balance : " + sa1.getBal());
    System.out.println("New Over Draft : " + sa1.getInterest());
  }
}


// HOMEWORK
//
// PRINT MATRIX PATTERNS
