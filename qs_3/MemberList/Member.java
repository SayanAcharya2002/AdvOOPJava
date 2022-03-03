package MemberList;
import java.util.ArrayList;

public class Member{
  private static int max_limit;
  static{
    max_limit=2;
  }
  private int mem_id;
  private String mem_name;
  private String date_of_birth;
  private ArrayList<Integer> cur_books=new ArrayList<Integer>();

  public Member(){
    this.mem_id=-1;
    this.mem_name="";
    this.date_of_birth="";
    cur_books=new ArrayList<Integer>();
  }

  public static int get_limit(){
    return max_limit;
  }

  //copy constructor
  public Member(Member member){
    this.mem_id=member.mem_id;
    this.mem_name=member.mem_name;
    this.date_of_birth=member.date_of_birth;
    cur_books=new ArrayList<Integer>();
    for(int i=0;i<member.cur_books.size();i++){
      cur_books.add(member.cur_books.get(i));
    }
  }

  //parameterized
  public Member(int mem_id, String mem_name, String date_of_birth){
    this.mem_id=mem_id;
    this.mem_name=mem_name;
    this.date_of_birth=date_of_birth;
    cur_books=new ArrayList<Integer>();
  }


  public Boolean has_book(int book_id){
    Integer id=book_id;
    return cur_books.contains(id);
  }

  public void delete_book(int book_id){
    Integer id=book_id;
    cur_books.remove(id);
  }

  public void add_book(int book_id){
    Integer id=book_id;
    if(!cur_books.contains(id)){
      if(cur_books.size()<=max_limit){
        cur_books.add(id);
      }
    }
  }

  //get book_size
  public int get_book_size(){
    return cur_books.size();
  }

  //getters and setters
  public int getMem_id(){
    return mem_id;
  }
  public void setMem_id(int mem_id){
    this.mem_id=mem_id;
  }
  public String getMem_name(){
    return mem_name;
  }
  public void setMem_name(String mem_name){
    this.mem_name=mem_name;
  }
  public String getDate_of_birth(){
    return date_of_birth;
  }
  public void setDate_of_birth(String date_of_birth){
    this.date_of_birth=date_of_birth;
  }
  public ArrayList<Integer> getCur_books(){
    ArrayList<Integer> new_cur=new ArrayList<Integer>();
    for(int i=0;i<cur_books.size();i++){
      new_cur.add(Integer.valueOf(cur_books.get(i).intValue()));
    }
    return cur_books;
  }
  public void setCur_books(ArrayList<Integer> cur_books){
    this.cur_books=cur_books;
  }

  //toString
  public String toString(){
    return ""+mem_id+" "+mem_name.toString()+" "+date_of_birth.toString();
  }
}
