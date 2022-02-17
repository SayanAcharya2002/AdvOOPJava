class Student {
  private String name;
  private int roll;
  private int score;

  public Student(int roll, String name, int score) {
    this.roll = roll;
    this.name = name;
    this.score = score;
  }

  public Student(int roll) {
    this.roll = roll;
    this.name = "";
    this.score = 0;
  }

  public Student(int roll, String name) {
    this.roll = roll;
    this.name = name;
    this.score = 0;
  }

  public Student() {
    this.name = "";
    this.roll = -1;
    this.score = 0;
  }

  public Student(Student s) {
    this.name = s.name;
    this.roll = s.roll;
    this.score = s.score;
  }

  public int getRoll() {
    return roll;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(int score) {
    this.score = score;
  }

  // copy to another object
  public void copy(Student s) {
    s.roll = this.roll;
    s.name = this.name;
    s.score = this.score;
  }

  // to_String
  public String toString() {
    return "Roll: " + roll + " Name: " + name + " Score: " + score;
  }

}

public class qs_8 {
  public static void main(String[] args) {
    Student s1 = new Student(1, "A", 90);
    Student s2 = new Student(s1);
    s1.setName("abcd");
    s1.setScore(1000);
    // output s1 and s2
    System.out.println(s1);
    System.out.println(s2);
  }
}