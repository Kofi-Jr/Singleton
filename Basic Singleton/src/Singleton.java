public class Singleton {
    // Step 1: Create a private static instance of the class (eager initialization)
    private static final Singleton INSTANCE = new Singleton();

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        // Optional: Initialization code
    }

    // Step 3: Public method to provide access to the instance
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }

    // Main method to test the Singleton pattern
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance();

        // Call a method on the singleton instance
        singletonInstance.showMessage();

        // Verify that only one instance is created
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println("Are both instances equal? " + (singletonInstance == anotherInstance));
    }
}
