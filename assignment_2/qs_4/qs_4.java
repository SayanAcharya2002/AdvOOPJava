// class Numeric{
//   long x;
//   public Object toObject(){
//     return new Object(this);
//   }
//   static Numeric toNumeric(Object o){
    
//   }


// }

public class qs_4 {
  public static void main(String[] args) {
    int i=123;
    Integer integer=Integer.valueOf(i);
    int j=integer.intValue();
    String s=String.valueOf(i);
    Integer integer1=Integer.parseInt(s);
    String new_s=Integer.toString(i);
    System.out.println(i);
    System.out.println(integer);
    System.out.println(j);
    System.out.println(integer1);
    System.out.println(s);
    System.out.println(new_s);
  }
}
