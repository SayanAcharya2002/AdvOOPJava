class BankAcct{
  private static double interestRate;
  private int accNumber;
  private double balance;
  static{
    interestRate = 0;
  }
  BankAcct(int accNumber, double balance){
    this.accNumber = accNumber;
    this.balance = balance;
  }
  //set interestRate
  static void setInterestRate(double interestRate){
    BankAcct.interestRate = interestRate;
  }
  //show interestRate
  static void showInterestRate(){
    System.out.println("Interest rate is:"+BankAcct.interestRate);
  }
  //calculate interest
  double calculateInterest(int months){
    return balance*BankAcct.interestRate*(months/12.0)/100.0;
  }
  //total balance
  double totalBalance(int months){
    return balance+calculateInterest(months);
  }

}

public class qs_9 {
  public static void main(String[] args) {
    BankAcct bankAcct=new BankAcct(1,1000);
    BankAcct.setInterestRate(5);
    System.out.println(bankAcct.calculateInterest(12));
    System.out.println(bankAcct.totalBalance(12));
  }
}
