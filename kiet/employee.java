

public class employee{


  public static class Student{
    public int id;             // Public 
    private String name;       // Private
    protected double salary;   // protected
    String organization;       // Default
  }
public static void info(Student m1){
  System.out.println(m1.name);
  System.out.println(m1.id);
  System.out.println(m1.salary);
  System.out.println(m1.organization);
}
  public static void main(String[] args) {
      Student m1 = new Student();
      m1.name = "Rdahey";
      m1.id = 1234;
      m1.salary = 9034.489;
      m1.organization = "abcd";
      info(m1);
  }
}