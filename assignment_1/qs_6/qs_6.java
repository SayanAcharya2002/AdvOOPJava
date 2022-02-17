public class qs_6 {
  public static void show(int x){
    System.out.println("From int version, the value is: "+x);
  }
  public static void show(double x){
    System.out.println("From double version, the value is: "+x);
  }
  public static void main(String[] args) {
    short x=2;
    qs_6.show(x);
    double y=3.5;
    qs_6.show(y);
  }
}
