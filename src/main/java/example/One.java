package example;

public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
    System.out.println("test test test changes made in releasess");
    System.out.println("security 123ygukyukyuk4s!!!");
    System.out.println("Conflict line!");
    System.out.println("Conflict line!");
  
  }
}
