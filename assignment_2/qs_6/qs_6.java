class Address {
  private int preminseNumber;
  private String street;
  private String city;
  private int pin;
  private String state;
  //constructor
  public Address(int preminseNumber,String street,String city,int pin,String state){
    this.preminseNumber=preminseNumber;
    this.street=street;
    this.city=city;
    this.pin=pin;
    this.state=state;
  }
  //copy constructor
  public Address(Address address){
    this.preminseNumber=address.preminseNumber;
    this.street=address.street;
    this.city=address.city;
    this.pin=address.pin;
    this.state=address.state;
  }
  //getters
  public int getPreminseNumber(){
    return preminseNumber;
  }
  public String getStreet(){
    return street;
  }
  public String getCity(){
    return city;
  }
  public int getPin(){
    return pin;
  }
  public String getState(){
    return state;
  }
  //setters
  public void setPreminseNumber(int preminseNumber){
    this.preminseNumber=preminseNumber;
  }
  public void setStreet(String street){
    this.street=street;
  }
  public void setCity(String city){
    this.city=city;
  }
  public void setPin(int pin){
    this.pin=pin;
  }
  public void setState(String state){
    this.state=state;
  }
  //toString
  public String toString(){
    return "Preminse Number: "+preminseNumber+"\n"+"Street: "+street+"\n"+"City: "+city+"\n"+"Pin: "+pin+"\n"+"State: "+state;
  }
}

//abstract class person containing address,name,phoneNumber,string emailId
abstract class Person {
  protected String name;
  protected long phoneNumber;
  protected String emailId;
  protected Address address;
  //constructor with address as deepcopy
  public Person(String name,long phoneNumber,String emailId,Address address){
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.emailId=emailId;
    this.address=new Address(address);
  }
  //copy constructor
  public Person(Person person){
    this.name=person.name;
    this.phoneNumber=person.phoneNumber;
    this.emailId=person.emailId;
    this.address=new Address(person.address);
  }
  //getters
  public String getName(){
    return name;
  }
  public long getPhoneNumber(){
    return phoneNumber;
  }
  public String getEmailId(){
    return emailId;
  }
  public Address getAddress(){
    return new Address(address);
  }
  //setters
  public void setName(String name){
    this.name=name;
  }
  public void setPhoneNumber(long phoneNumber){
    this.phoneNumber=phoneNumber;
  }
  public void setEmailId(String emailId){
    this.emailId=emailId;
  }
  public void setAddress(Address address){
    this.address=new Address(address);
  }
  //toString
  public String toString(){
    return "Name: "+name+"\n"+"Phone Number: "+phoneNumber+"\n"+"Email Id: "+emailId+"\n"+"Address: "+address;
  }
  //change address preminseNumber
  public void changeAddressPremiseNumber(int preminseNumber){
    address.setPreminseNumber(preminseNumber);
  }
  //change address street
  public void changeAddressStreet(String street){
    address.setStreet(street);
  }
  //change address city
  public void changeAddressCity(String city){
    address.setCity(city);
  }
  //change address pin
  public void changeAddressPin(int pin){
    address.setPin(pin);
  }
  //change address state
  public void changeAddressState(String state){
    address.setState(state);
  }
  //change address
  public void changeAddress(Address address){
    this.address=new Address(address);
  }
}

//student class that extends person and contains int roll and string courseName
class Student extends Person{
  private int roll;
  private String courseName;
  //constructor with address as deepcopy
  public Student(String name,long phoneNumber,String emailId,Address address,int roll,String courseName){
    super(name,phoneNumber,emailId,address);
    this.roll=roll;
    this.courseName=courseName;
  }
  //copy constructor
  public Student(Student student){
    super(student);
    this.roll=student.roll;
    this.courseName=student.courseName;
  }
  //getters
  public int getRoll(){
    return roll;
  }
  public String getCourseName(){
    return courseName;
  }
  //setters
  public void setRoll(int roll){
    this.roll=roll;
  }
  public void setCourseName(String courseName){
    this.courseName=courseName;
  }
  //toString
  public String toString(){
    return super.toString()+"\n"+"Roll: "+roll+"\n"+"Course Name: "+courseName;
  }
}

//faculty class that extends person and contains int id, String department and String specialisation
class Faculty extends Person{
  private int id;
  private String department;
  private String specialisation;
  //constructor with address as deepcopy
  public Faculty(String name,long phoneNumber,String emailId,Address address,int id,String department,String specialisation){
    super(name,phoneNumber,emailId,address);
    this.id=id;
    this.department=department;
    this.specialisation=specialisation;
  }
  //copy constructor
  public Faculty(Faculty faculty){
    super(faculty);
    this.id=faculty.id;
    this.department=faculty.department;
    this.specialisation=faculty.specialisation;
  }
  //getters
  public int getId(){
    return id;
  }
  public String getDepartment(){
    return department;
  }
  public String getSpecialisation(){
    return specialisation;
  }
  //setters
  public void setId(int id){
    this.id=id;
  }
  public void setDepartment(String department){
    this.department=department;
  }
  public void setSpecialisation(String specialisation){
    this.specialisation=specialisation;
  }
  //toString
  public String toString(){
    return super.toString()+"\n"+"Id: "+id+"\n"+"Department: "+department+"\n"+"Specialisation: "+specialisation;
  }
}


public class qs_6 {

  public static void main(String[] args) {
    Address address1=new Address(1,"street1","city1",123456,"state1");
    Address address2=new Address(2,"street2","city2",631451,"state2");
    Student student=new Student("student1",1234567890l,"emailId",address1,1,"course1");
    Faculty faculty=new Faculty("faculty1",9876543210l,"emailId",address2,1,"department1","specialisation1");
    faculty.changeAddressCity("kolkata");
    System.out.println(student);
    System.out.println(faculty);

  }
}
