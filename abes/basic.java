// File: abes/Basic.java
 // import करना ज़रूरी है
 package abes;
import kiet.Student;  
public class basic {

  public class abc extends Student {
    public void showInfo() {
        System.out.println("Derived class accessing Student:");
        display();  // parent class ka method
    }

    public static void main(String[] args) {
        Student obj = new Basic();
        obj.id = 101;
        obj.name = "Radhey";
        obj.showInfo();
    }
}

}
