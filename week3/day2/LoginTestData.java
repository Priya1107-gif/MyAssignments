package week3.day2;

public class LoginTestData extends TestData { 
	// Method 1 in subclass
    public void enterUsername() {
        System.out.println("Entering username...");
    }

    // Method 2 in subclass
    public void enterPassword() {
        System.out.println("Entering password...");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create object of subclass
        LoginTestData login = new LoginTestData();

        // Call methods from the superclass
        login.enterCredentials();      // Inherited method
        login.navigateToHomePage();    // Inherited method

        // Call methods from the subclass
        login.enterUsername();         // Own method
        login.enterPassword();         // Own method
    }
}