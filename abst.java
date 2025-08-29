abstract class college {
  // Abstract methods (must be implemented by subclasses)
  abstract void register();
  abstract void infrastructure();
  abstract void student();
  abstract void staff();

  // Concrete method (already implemented, optional to override in subclass)
  void medical() {
    System.out.println("Medical Facilities are optional");
  }
}

class KIETT extends college{
  void register(){
    System.out.println("Kiet is registered with AKTU");
  }

  void infrastructure(){
     System.out.println("KIET has digital classroom and labs");
  }

  void student(){
     System.out.println("Admission throuugh counselling");
  }

  void staff(){
     System.out.println("Kiet has well trained staff");
  }

  void medical(){
     System.out.println("Kiet has owned hospital inside campus");
  }
}

public class abst{
  public static void main(String[] args) {
      college c1 = new KIETT();
      c1.register();
      c1.infrastructure();
      c1.staff();
      c1.student();
      c1.medical();
  }
}