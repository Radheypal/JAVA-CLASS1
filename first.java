



public class first {
    int salary;
    String name;

    first(){
        System.out.println("Details are: " + salary + " " + name); 
    }
    first(int salary,String name){
        this.salary = salary;
        this.name = name;
    }
    public void display() {
        System.out.println("Details are: " + salary + " " + name + "\n"); // USER-defined function
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);

        // // Create object
        first m1 = new first();

        m1.salary = 101;
        m1.name = "radhey";
        // System.out.print("Enter a salary: ");
        // m1.salary = sc.nextInt();
        // sc.nextLine(); // Clear the newline left by nextInt()
    
        // System.out.print("Enter a name: ");
        // m1.name = sc.nextLine();

        m1.display();

        first m2 = new first();
        m2.salary = 102;
        m2.name = "Radhey Pal";
        m2.display();

        first m3 = new first(1008,"Pal ji");
        m3.display();
    }
}
