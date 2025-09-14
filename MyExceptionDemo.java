public class MyExceptionDemo {
  public static void main(String args[]) {
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);

    try {
      System.out.println(5/0);   // error (divide by zero)
    }
    catch(Exception e) {         // ✅ Exception with capital E
      System.out.println(e);     // handle karega
    }

    System.out.println(6);      
  }
}
