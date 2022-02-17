class BankAcct{
  private int id=-1;
  private String name="";
  private double currentLoan=0;
  private long phoneNumber=-1;
  private Boolean privileged=false;

  static double creditLimit;
  static double privilegedCreditLimit;
  static{
    creditLimit=100000;
    privilegedCreditLimit=1000000;
  }
  //set creditLimit
  public static void setCreditLimit(double creditLimit){
    BankAcct.creditLimit=creditLimit;
  }
  //get creditLimit
  public static double getCreditLimit(){
    return BankAcct.creditLimit;
  }
  //get loan if currentLoan+amount<=(privileged==true)?privilegedCreditLimit:creditLimit and update the currentLoan
  public boolean getLoan(double amount){
    if(currentLoan+amount<=((privileged==true)?privilegedCreditLimit:creditLimit)){
      currentLoan+=amount;
      return true;
    }
    return false;
  }
  //getter
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public double getCurrentLoan(){
    return currentLoan;
  }
  public long getPhoneNumber(){
    return phoneNumber;
  }
  public Boolean isPrivileged(){
    return privileged;
  }
  //setters
  public void setId(int id){
    this.id=id;
  }
  public void setName(String name){
    this.name=name;
  }
  // public void setCurrentLoan(double currentLoan){
  //   this.currentLoan=currentLoan;
  // }
  public void setPhoneNumber(long phoneNumber){
    this.phoneNumber=phoneNumber;
  }
  public void setPrivileged(Boolean privileged){
    this.privileged=privileged;
  }
  //get creditLimitforall=(privileged==true)?privilegedCreditLimit:creditLimit
  public double getCreditLimitForAll(){
    return (privileged==true)?privilegedCreditLimit:creditLimit;
  }

  //static setters
  public static void setPrivilegedCreditLimit(double privilegedCreditLimit){
    BankAcct.privilegedCreditLimit=privilegedCreditLimit;
  }
  //static getters
  public static double getPrivilegedCreditLimit(){
    return BankAcct.privilegedCreditLimit;
  }
  //constructor
  public BankAcct(int id,String name,double currentLoan,long phoneNumber,Boolean privileged){
    this.id=id;
    this.name=name;
    this.currentLoan=currentLoan;
    this.phoneNumber=phoneNumber;
    this.privileged=privileged;
  }
  //copy constructor
  public BankAcct(BankAcct acct){
    this.id=acct.id;
    this.name=acct.name;
    this.currentLoan=acct.currentLoan;
    this.phoneNumber=acct.phoneNumber;
    this.privileged=acct.privileged;
  }
  //toString
  public String toString(){
    return "id: "+id+"\nname: "+name+"\ncurrentLoan: "+currentLoan+"\nphoneNumber: "+phoneNumber+"\nprivileged: "+privileged;
  }
}

public class qs_5 {
  public static void main(String[] args) {
    //test BankAcct
    BankAcct acct1=new BankAcct(1,"John",100,123456789,true);
    acct1.getLoan(1000);
    System.out.println(acct1);
    //print creditLimit
    System.out.println("creditLimit: "+acct1.getCreditLimitForAll());
  }
}
