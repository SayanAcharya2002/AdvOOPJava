// package assignment_2_extra.qs_3.BookList;
package BookList;
import java.util.ArrayList;

public class BookList {
  private ArrayList<Book> arr=new ArrayList<Book>();

  public BookList(){
    arr=new ArrayList<Book>();
  }
  //copy constructor
  public BookList(BookList bookList){
    arr=new ArrayList<Book>();
    for(int i=0;i<bookList.arr.size();i++){
      arr.add(new Book(bookList.arr.get(i)));
    }
  }

  //is_there_book_with_id
  public Boolean is_there_book_with_id(int book_id){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getBook_id()==book_id){
        return true;
      }
    }
    return false;
  }


  //add a book to book_list
  public void add_book(Book book){
    if(! is_there_book_with_id(book.getBook_id())){
      arr.add(book);
    }
  }

  //increase copies purchased for a book
  public void increase_copies_purchased(int book_id, int how_many){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getBook_id()==book_id){
        arr.get(i).setCopy_number(arr.get(i).getCopy_number()+how_many);
        return ;
      }
    }
  }

  //increase available_copy_number for a book
  public void increase_available_copy_number(int book_id, int how_many){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getBook_id()==book_id){
        arr.get(i).setAvailable_copy_number(arr.get(i).getAvailable_copy_number()+how_many);
        return ;
      }
    }
  }

  //get index of a book with book_id
  public int get_index_of_book_with_id(int book_id){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getBook_id()==book_id){
        return i;
      }
    }
    return -1;
  }

  //display info for a book with book_id
  public void display_info_for_book_with_id(int book_id){
    int index=get_index_of_book_with_id(book_id);
    if(index!=-1){ 
      System.out.println(arr.get(index));
    }
  }

  //display info for all books
  public void display_info_for_all_books(){
    for(int i=0;i<arr.size();i++){
      System.out.println(arr.get(i));
    }
  }

  public Book get_book_with_id(int book_id){
    int index=get_index_of_book_with_id(book_id);
    if(index!=-1){
      Book new_book=new Book(arr.get(index));
      return new_book;
    }
    else{
      return null;
    }
  }
  


}
