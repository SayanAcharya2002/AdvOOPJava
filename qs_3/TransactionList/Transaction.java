package TransactionList;

public class Transaction {
  private int book_id;
  private int mem_id;

  public Transaction(){
    this.book_id=-1;
    this.mem_id=-1;
  }

  //copy constructor
  public Transaction(Transaction transaction){
    this.book_id=transaction.book_id;
    this.mem_id=transaction.mem_id;
  }

  //parameterized constructor
  public Transaction(int book_id, int mem_id){
    this.book_id=book_id;
    this.mem_id=mem_id;
  }

  //getter and setter methods
  public int getBook_id(){
    return book_id;
  }
  public void setBook_id(int book_id){
    this.book_id=book_id;
  }
  public int getMem_id(){
    return mem_id;
  }
  public void setMem_id(int mem_id){
    this.mem_id=mem_id;
  }
  
}
