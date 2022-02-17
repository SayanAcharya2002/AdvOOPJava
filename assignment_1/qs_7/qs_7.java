class Student{
  private int roll;
  private String name;
  private int score;
  public Student(int roll,String name,int score){
    this.roll=roll;
    this.name=name;
    this.score=score;
  }
  public int getRoll(){
    return roll;
  }
  public String getName(){
    return name;
  }
  public int getScore(){
    return score;
  }
  public void setRoll(int roll){
    this.roll=roll;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setScore(int score){
    this.score=score;
  }
  //copy to another object
  public void copy(Student s){
    s.roll=this.roll;
    s.name=this.name;
    s.score=this.score;
  }
  //to_String
  public String toString(){
    return "Roll: "+roll+" Name: "+name+" Score: "+score;
  }
  
}

public class qs_7 {
  public static void main(String[] args) {
    Student s1=new Student(1,"A",90);
    Student s2=new Student(2,"B",100);
    s1.setName("Someone");
    s1.setScore(80);
    s1.setRoll(2);
    System.out.println(s1.getName()+" "+s1.getScore()+" "+s1.getRoll());
    s1.copy(s2);
    System.out.println(s2);
  }
}
