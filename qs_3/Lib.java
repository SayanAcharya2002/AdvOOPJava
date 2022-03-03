// import assignment_2_extra.qs_3.BookList.*;
import BookList.*;
import MemberList.*;
import TransactionList.*;

interface LibInterface {
  void add_book(Book book);
  Boolean search_book(int book_id);
  void view_all_books();
  void add_member(Member member);
  Boolean search_member(int mem_id);
  void view_all_members();
  Boolean issue_book(int mem_id, int book_id);
  Boolean return_book(int mem_id, int book_id);

}

class Library implements LibInterface {
  private BookList book_list;
  private MemberList member_list;
  private TransactionList transaction_list;

  public Library() {
    book_list = new BookList();
    member_list = new MemberList();
    transaction_list = new TransactionList();
  }

  public void add_book(Book book) {
    book_list.add_book(book);
  }
  public Boolean search_book(int book_id){
    return book_list.is_there_book_with_id(book_id);
  }
  public void view_all_books(){
    book_list.display_info_for_all_books();
  }
  public void add_member(Member member){
    member_list.add_member(member);
  }
  public Boolean search_member(int mem_id){
    return member_list.is_there_member_with_id(mem_id);
  }
  public void view_all_members(){
    member_list.view_all_members();
  }
  public Boolean issue_book(int mem_id,int book_id){
    if(member_list.is_there_member_with_id(mem_id) && book_list.is_there_book_with_id(book_id)){
      if(book_list.get_book_with_id(book_id).getAvailable_copy_number()>0 && member_list.get_member_with_id(mem_id).get_book_size()<Member.get_limit()){
        transaction_list.add_transaction(new Transaction(mem_id, book_id));
        // book_list.get_book_with_id(book_id).setAvailable_copy_number(book_list.get_book_with_id(book_id).getAvailable_copy_number()-1);
        book_list.increase_available_copy_number(book_id, -1);
        member_list.add_book_to_member(mem_id, book_id);
        return true;
      }
    }
    return false;
  }
  public Boolean return_book(int mem_id, int book_id){
    if(transaction_list.has_open_transaction(mem_id, book_id)){
      transaction_list.update_entry(mem_id, book_id);
      book_list.increase_available_copy_number(book_id, 1);
      member_list.delete_book_from_member(mem_id, book_id);
      return true;
    }
    return false;
  }

  public void view_member_with_id(int mem_id){
    member_list.display_member(mem_id);
  }
}

public class Lib {

   public static void demark(){
      System.out.println("------------------------------------------------------");
   }
   public static void main(String[] args) {
      // BookList bookList=new BookList();
      // bookList.add_book(new Book(1,"Harry Potter",10,10));
      // bookList.add_book(new Book(2,"The Alchemist",10,10));
      // bookList.display_info_for_all_books();
      Library lib=new Library();
      lib.add_book(new Book(1,"Harry Potter",10,10));
      lib.add_book(new Book(2,"The Alchemist",10,10));
      lib.add_book(new Book(3,"The New book",10,10));
      lib.add_book(new Book(4,"The old book",10,10));
      lib.add_member(new Member(1,"John","10/02/2002"));
      lib.add_member(new Member(2,"Jane","11/01/2001"));
      demark();
      lib.view_all_members();
      demark();
      lib.issue_book(1,1);
      lib.issue_book(2,2);
      Boolean b=lib.issue_book(1,2);
      System.out.println(b);
      demark();
      b=lib.issue_book(1,3);
      System.out.println(b);
      demark();
      lib.view_all_books();
      demark();
      lib.view_member_with_id(1);
      demark();
      lib.return_book(1,1);
      demark();
      lib.view_all_books();
      demark();
    } 
}
