

public class qs_5 {
  // private static class temp{
  //   int x;
  //   double y;
  //   public temp(int x,double y){
  //     this.x=x;
  //     this.y=y;
  //   }
  //   public Boolean equals(temp t){
  //     return this.x==t.x && this.y==t.y;
  //   }
  // }
  public static void main(String[] args) {
    String x="sayan";
    String y="sayan";
    System.out.println(x==y);
    System.out.println(x.equals(y));
    System.out.println(x.hashCode());
    System.out.println(y.hashCode());

    // temp t1=new qs_5.temp(1,2.4);
    // temp t2=new qs_5.temp(1,2.4);
    // System.out.println(t1.hashCode());
    // System.out.println(t2.hashCode());
    // System.out.println(t2==t1);
    // System.out.println(t2.equals(t1));
  }
}
