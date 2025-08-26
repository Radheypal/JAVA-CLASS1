// Final keyword ka use: variable, method, class me restriction lagane ke liye hota hai.

class Single { // Agar ise final kar doge -> "class Single" ko extend nahi kar sakte
    int em_id;
    final String Organisation = "KIET"; // Final variable = constant (change nahi hoga)

    void details() { // Agar ise final kar doge -> override nahi hoga
        System.out.println("Id: " + em_id + "  Organisation: " + Organisation);
    }
}

class Faculty extends Single {
    // yaha parent ka method override kar rahe hain
 
    void details() {
        System.out.println("Welcome to child class");
    }

    public static void main(String[] args) {
        // Parent class ka object
        Single p = new Single();
        p.em_id = 123;
        p.details(); // Parent class ka method chalega

        // Child class ka object
        Faculty c = new Faculty();
        c.details(); // Child class ka override method chalega
    }
}
