

class DistanceConversion{
  private static double mileToKm=1.5;
  public static double MileToKm(double miles){
    return miles*mileToKm;
  }
  public static double KmToMile(double km){
    return km/mileToKm;
  }
}

public class qs_10 {
  public static void main(String[] args) {
    System.out.println(DistanceConversion.MileToKm(100));
    System.out.println(DistanceConversion.KmToMile(100));
  }
}
