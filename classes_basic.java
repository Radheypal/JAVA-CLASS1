
public class classes_basic {
  // Creating a new datatype
  public static class Student {
    String name;
    int roll;
    double percent;
    final String schoolName = "ABCD";
     static int numberofstudent;

  public int getRoll(){
    return roll;
  }

  public void setRno(int roll){
    this.roll = roll;
  }

  public static int getnumber(){
    return numberofstudent;
  }

  public Student(String name,int roll,double percent){
      this.name = name;
      this.roll = roll;
      this.percent = percent;
      numberofstudent++;
  }
  }


  public static class Car {
    String name;
    String type;
    int price;
  }

  public static void fun(Student x) {
    System.out.println(x.name);
    return;
  }

  public static void change(int x){
    x = 7;
    return;
  }
  public static void main(String args[]) {

    System.out.println(Student.getnumber());

    // Student s1 = new Student("radhey",76,92.1);

    // System.out.println(s1.name);

    // System.out.println(s1.roll);

    // System.out.println(s1.percent);

    // Student s2 = new Student("Rahul",74,0.2);

    // System.out.println(s2.name);

    // System.out.println(s2.roll);

    // System.out.println(s2.percent);

    // System.out.println(s1.numberofstudent);
    // System.out.println(s1.name);

    // System.out.println(s1.percent);
    // s1.roll = 34;
    // System.out.println(s1.roll);

    // System.out.println(s1.getRoll());

    // s1.setRno(76);

    // System.out.println(s1.getRoll());
    // Scanner sc = new Scanner(System.in);
    // int z = sc.nextInt();

    // Car c1 = new Car();
    // c1.name = "Alto";
    // c1.price = 89;
    // c1.type = "Maruti";

    // Student st = new Student(); 
    // st.name = "Radhey Pal";
    // st.roll = 56;
    // st.percent = 92.5;

    // System.out.println(st.name);
    // st.name = "Rahul";
    // System.out.println(st.name);

    // int x = 5;
    // System.out.println(x);
    // change(x);
    // System.out.println(x);

    // sc.close(); 
  }
}
