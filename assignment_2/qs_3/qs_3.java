class StringOperation{
  private String str;
  //constructor
  public StringOperation(String str){
    this.str = str;
  }
  //set_string
  public void setString(String str){
    this.str = str;
  }
  //how many times 'a' appears
  public int howManyA(){
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'a'){
        count++;
      }
    }
    return count;
  }
  //how many times "and" appears in the String
  public int howManyAnd(){
    int count = 0;
    String keyword="and";
    int keyword_length = keyword.length();
    for(int i = 0; i < str.length()-keyword_length+1; i++){
      if(str.substring(i, i+3).equals("and")){
        count++;
      }
    }
    return count;
  }
  //does it start with "the"
  public boolean startsWithThe(){
    if(str.length()<3){
      return false;
    }
    if(str.substring(0,3).equals("the")){
      return true;
    }
    else{
      return false;
    }
  }
  //put the string into an array of chars
  public char[] toCharArray(){
    char[] array = new char[str.length()];
    for(int i = 0; i < str.length(); i++){
      array[i] = str.charAt(i);
    }
    return array;
  }
  //tokenize the string
  public String[] tokenize(String splitter){
    String[] array = str.split(splitter);
    return array;
  }


}


public class qs_3 {
  public static void main(String[] args) {
    StringOperation so=new StringOperation("the quick brown fox and the lazy dog");
    //tokenize
    String[] array = so.tokenize(" ");
    //print tokens
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
    //print demarcation
    System.out.println("-----------------------------------------------------");
    //print how many times 'a' appears
    System.out.println(so.howManyA());
    System.out.println("-----------------------------------------------------");
    //print how many times "and" appears
    System.out.println(so.howManyAnd());
    System.out.println("-----------------------------------------------------");
    //print if it starts with "the"
    System.out.println(so.startsWithThe());

  }
}
