package TransactionList;
import java.util.ArrayList;


public class TransactionList {
  ArrayList<Transaction> arr=new ArrayList<Transaction>();
  public TransactionList(){
    arr=new ArrayList<Transaction>();
  }

  //add a transaction
  public void add_transaction(Transaction transaction){
    arr.add(transaction);
  }
  //get the transaction index with mem_id and book_id
  public int get_index_of_transaction(int mem_id, int book_id){
    for(int i=arr.size()-1;i>=0;--i){
      if(arr.get(i).getMem_id()==mem_id && arr.get(i).getBook_id()==book_id){
        return i;
      }
    }
    return -1;
  }
  public Boolean has_open_transaction(int mem_id,int book_id){
    for(int i=arr.size()-1;i>=0;--i){
      if(arr.get(i).getMem_id()==mem_id && arr.get(i).getBook_id()==book_id){
        return true;
      }
    }
    return false;
  }
  //update_entry
  public void update_entry(int mem_id, int book_id){
    int index=get_index_of_transaction(mem_id, book_id);
    if(index!=-1){
      arr.get(index).setMem_id(-1);//works as xxxx
    }
  }


}
