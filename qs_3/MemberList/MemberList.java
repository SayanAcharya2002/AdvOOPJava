package MemberList;
import java.util.ArrayList;

public class MemberList {
  private ArrayList<Member> arr=new ArrayList<Member>();

  public MemberList(){
    arr=new ArrayList<Member>();
  }
  //copy constructor
  public MemberList(MemberList memberList){
    arr=new ArrayList<Member>();
    for(int i=0;i<memberList.arr.size();i++){
      arr.add(new Member(memberList.arr.get(i)));
    }
  }

  //is_there_member_with_id
  public Boolean is_there_member_with_id(int mem_id){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getMem_id()==mem_id){
        return true;
      }
    }
    return false;
  }

  //get_member_index
  public int get_index_of_member(int mem_id){
    for(int i=0;i<arr.size();i++){
      if(arr.get(i).getMem_id()==mem_id){
        return i;
      }
    }
    return -1;
  }

  //add a member if not present
  public void add_member(Member member){
    if(! is_there_member_with_id(member.getMem_id())){
      arr.add(member);
    }
  }

  //view_all_members
  public void view_all_members(){
    for(int i=0;i<arr.size();i++){
      System.out.println(arr.get(i).toString());
    }
  }

  public void add_book_to_member(int mem_id, int book_id){
    int index=get_index_of_member(mem_id);
    if(index!=-1){
      arr.get(index).add_book(book_id);
    }
  }

  public void delete_book_from_member(int mem_id, int book_id){
    int index=get_index_of_member(mem_id);
    if(index!=-1){
      arr.get(index).delete_book(book_id);
    }
  }

  public Boolean has_book_member(int mem_id,int book_id){
    int index=get_index_of_member(mem_id);
    if(index!=-1){
      return arr.get(index).has_book(book_id);
    }
    return false;
  }

  public Member get_member_with_id(int mem_id){
    int index=get_index_of_member(mem_id);
    if(index!=-1){
      Member new_member =new Member(arr.get(index));
      return new_member;
    }
    return null;
  }

  public void display_member(int mem_id){
    int index=get_index_of_member(mem_id);
    if(index!=-1){
      System.out.println(arr.get(index));
    }
  }
}
