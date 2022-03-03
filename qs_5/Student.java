
class StudentClass {
  private int roll;
  private int score;
  private String name;
  
  public StudentClass (int roll, int score, String name) {
    this.roll = roll;
    validate_score(score);
    this.score = score;
    this.name = name;
  }
  //copy constructor
  public StudentClass(StudentClass s) {
    this.roll = s.roll;
    validate_score(s.score);
    this.score = s.score;
    this.name = s.name;
  }
  public int getRoll() {
    return roll;
  }
  public void setRoll(int roll) {
    this.roll = roll;
  }
  public int getScore() {
    return score;
  }
  //validate score<=100 else throw IllegalArgumentException
  public static void validate_score(int score){
    if(score>100)
      throw new IllegalArgumentException("Score should be less than or equal to 100");
  }

  public void setScore(int score) {
    validate_score(score);
    this.score = score;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  //toString
  public String toString() {
    return "Student [roll=" + roll + ", score=" + score + ", name=" + name + "]";
  }
}

public class Student{
  public static void main(String[] args) {
    StudentClass s1 = new StudentClass(1, 99, "John");
    try{
      StudentClass s2 = new StudentClass(2, 101, "Jane");
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }
}