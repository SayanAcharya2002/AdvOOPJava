import java.security.PrivilegedActionException;

abstract class BankAcct {
  protected int id = -1;
  protected String name = "";
  protected double currentLoan = 0;
  protected long phoneNumber = -1;

  // constructor
  public BankAcct(int id, String name, double currentLoan, long phoneNumber) {
    this.id = id;
    this.name = name;
    this.currentLoan = currentLoan;
    this.phoneNumber = phoneNumber;
  }

  // copy constructor
  public BankAcct(BankAcct acct) {
    this.id = acct.id;
    this.name = acct.name;
    this.currentLoan = acct.currentLoan;
    this.phoneNumber = acct.phoneNumber;
  }

  // setters
  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCurrentLoan(double currentLoan) {
    this.currentLoan = currentLoan;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCurrentLoan() {
    return currentLoan;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }
}

class NormalCustomer extends BankAcct {
  private static double creditLimit;
  static {
    creditLimit = 100000;
  }

  // constructor
  public NormalCustomer(int id, String name, double currentLoan, long phoneNumber) {
    super(id, name, currentLoan, phoneNumber);
  }

  // copy constructor
  public NormalCustomer(NormalCustomer acct) {
    super(acct);
  }

  // setters
  public static void setCreditLimit(double creditLimit) {
    NormalCustomer.creditLimit = creditLimit;
  }

  // getters
  public static double getCreditLimit() {
    return NormalCustomer.creditLimit;
  }

  // getLoan if currentLoan+amount<=creditLimit and update the currentLoan
  public boolean getLoan(double amount) {
    if (super.currentLoan + amount <= creditLimit) {
      super.currentLoan += amount;
      return true;
    }
    return false;
  }
}

class ProCustomer extends BankAcct {
  private static double creditLimit;
  static {
    creditLimit = 1000000;
  }

  // constructor
  public ProCustomer(int id, String name, double currentLoan, long phoneNumber) {
    super(id, name, currentLoan, phoneNumber);
  }

  // copy constructor
  public ProCustomer(ProCustomer acct) {
    super(acct);
  }

  // setters
  public static void setCreditLimit(double creditLimit) {
    ProCustomer.creditLimit = creditLimit;
  }

  // getters
  public static double getCreditLimit() {
    return ProCustomer.creditLimit;
  }

  // getLoan if currentLoan+amount<=creditLimit and update the currentLoan
  public boolean getLoan(double amount) {
    if (super.currentLoan + amount <= creditLimit) {
      super.currentLoan += amount;
      return true;
    }
    return false;
  }

}

public class qs_5_inheritance {
  public static void main(String[] args) {
    NormalCustomer nc = new NormalCustomer(1, "John", 0, 123456789);
    ProCustomer pc = new ProCustomer(2, "Tom", 0, 987654321);

    Boolean f = pc.getLoan(10000000);
    System.out.println(f);

  }
}
