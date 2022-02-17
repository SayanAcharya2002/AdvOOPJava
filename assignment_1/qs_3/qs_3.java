import java.util.*;

public class qs_3 {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int height_in_cm=scanner.nextInt();
    double feet=(int)(height_in_cm/30.5);
    double inch=(double)((height_in_cm-30.5*feet)/2.54);
    System.out.println("The height is:"+feet+" feet and "+inch+" inches");
  }
}
