import java.io.*;
import java.util.*;

public class PropertiesFileExample {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();

            props.setProperty("db.user", "Radhey");
            props.setProperty("db.password", "secret");

            // Save to a file
            FileOutputStream fos = new FileOutputStream("config.properties");
            props.store(fos, "Database Configuration"); // Comment added inside file
            fos.close();

            System.out.println("Properties saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
