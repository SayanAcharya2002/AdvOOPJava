
class Instructor{
  private String name;
  private String phoneNumber;
  //constructor
  public Instructor(String name, String phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
  //copy constructor
  public Instructor(Instructor instructor){
    this.name = instructor.name;
    this.phoneNumber = instructor.phoneNumber;
  }
  //setter
  public void setName(String name){
    this.name = name;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  //getter
  public String getName(){
    return name;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  //show
  public void show(){
    System.out.println("Name: " + name);
    System.out.println("Phone Number: " + phoneNumber);
  }
}
class TextBook{
  private String name;
  private String author;
  private String Publisher;
  //constructor
  public TextBook(String name, String author, String Publisher){
    this.name = name;
    this.author = author;
    this.Publisher = Publisher;
  }
  //copy constructor
  public TextBook(TextBook textbook){
    this.name = textbook.name;
    this.author = textbook.author;
    this.Publisher = textbook.Publisher;
  }
  //getter
  public String getName(){
    return name;
  }
  public String getAuthor(){
    return author;
  }
  public String getPublisher(){
    return Publisher;
  }
  //setter
  public void setName(String name){
    this.name = name;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public void setPublisher(String Publisher){
    this.Publisher = Publisher;
  }
  //show
  public void show(){
    System.out.println("Name: " + name);
    System.out.println("Author: " + author);
    System.out.println("Publisher: " + Publisher);
  }

}

class Course{
  private Instructor instructor;
  private TextBook textbook;
  private String courseName;
  //constructor
  public Course(String courseName, Instructor instructor, TextBook textbook){
    this.courseName = courseName;
    this.instructor=new Instructor(instructor);
    this.textbook=new TextBook(textbook);
  }
  //getter
  public String getCourseName(){
    return courseName;
  }
  public Instructor getInstructor(){
    return new Instructor(instructor);
  }
  public TextBook getTextBook(){
    return new TextBook(textbook);
  }
  //setter
  public void setCourseName(String courseName){
    this.courseName = courseName;
  }
  public void setInstructor(Instructor instructor){
    this.instructor = new Instructor(instructor);
  }
  public void setTextBook(TextBook textbook){
    this.textbook = new TextBook(textbook);
  }
  //show
  public void show(){
    System.out.println("Course Name: " + courseName);
    System.out.print("Instructor: ");
    instructor.show();
    System.out.print("Textbook: ");
    textbook.show();
  }
  //show instructor
  public void showInstructor(){
    System.out.print("Instructor: ");
    instructor.show();
  }
  //show textbook
  public void showTextBook(){
    System.out.print("Textbook: ");
    textbook.show();
  }

}


public class qs_11 {
  public static void main(String[] args) {
    TextBook textBook=new TextBook("Java Crash Course","Someone", "SomePublisher");
    Instructor instructor=new Instructor("Someone Good","123456789");
    Course course=new Course("Java",instructor,textBook);
    course.show();
    System.out.println("---------------");
    course.showInstructor();
    System.out.println("---------------");
    course.showTextBook();
  }
}
