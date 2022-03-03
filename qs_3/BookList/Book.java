// package assignment_2_extra.qs_3.BookList;
package BookList;

public class Book {
  private int book_id;
  private String book_title;
  private int copy_number;
  private int available_copy_number;

  public Book(){
    this.book_id=-1;
    this.book_title="";
    this.copy_number=0;
    this.available_copy_number=0;
  }

  //copy constructor
  public Book(Book book){
    this.book_id=book.book_id;
    this.book_title=book.book_title;
    this.copy_number=book.copy_number;
    this.available_copy_number=book.available_copy_number;
  }

  //parameterized constructor
  public Book(int book_id, String book_title, int copy_number, int available_copy_number){
    this.book_id=book_id;
    this.book_title=book_title;
    this.copy_number=copy_number;
    available_copy_number=Math.min(available_copy_number, copy_number);
    this.available_copy_number=available_copy_number;
  }

  //getter and setter methods
  public int getBook_id(){
    return book_id;
  }
  public void setBook_id(int book_id){
    this.book_id=book_id;
  }
  public String getBook_title(){
    return book_title;
  }
  public void setBook_title(String book_title){
    this.book_title=book_title;
  }
  public int getCopy_number(){
    return copy_number;
  }
  public void setCopy_number(int copy_number){
    this.copy_number=copy_number;
  }
  public int getAvailable_copy_number(){
    return available_copy_number;
  }
  public void setAvailable_copy_number(int available_copy_number){
    this.available_copy_number=available_copy_number;
  }
  public Boolean issue_book(int how_many){
    if(available_copy_number>=how_many){
      available_copy_number-=how_many;
      return true;
    }
    else{
      return false;
    }
  }

  public Boolean take_back_book(int how_many){
    if(how_many+available_copy_number<=copy_number){
      available_copy_number+=how_many;
      return true;
    }
    else{
      return false;
    }
  }
  //toString method
  public String toString(){
    return "Book ID: "+book_id+"\nBook Title: "+book_title+"\nCopy Number: "+copy_number+"\nAvailable Copy Number: "+available_copy_number;
  }


}
