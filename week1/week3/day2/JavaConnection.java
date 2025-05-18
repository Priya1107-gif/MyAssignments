package week3.day2;

public class JavaConnection implements DatabaseConnection { // Implementing connect() method
    public void connect() {
        System.out.println("Connected to the Java database.");
    }

    // Implementing disconnect() method
    public void disconnect() {
        System.out.println("Disconnected from the Java database.");
    }

    // Implementing executeUpdate() method
    public void executeUpdate() {
        System.out.println("Executed update on the Java database.");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create object of the concrete class
        JavaConnection db = new JavaConnection();

        // Call all implemented methods
        db.connect();
        db.executeUpdate();
        db.disconnect();
    }
}