package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_3 {
    // 3.1 Declare one instance and one static variable.
    String name = "Sandip"; // Instance variable
    static String surname = "Patel"; // Static variable

    // 3.2 Declare one instance method.
    public void instanceMethod() {
        //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
        System.out.println(name); // Instance call
        System.out.println(Programme_3.surname); // Static call // Programme_3 is not need

    }

    //3.3 Declare one static method.
    public static void staticMethod() {
        // 3.4 Call both instance and static variables into both instance and static methods inside the print statements.
        Programme_3 programme_3 = new Programme_3(); // Instance call
        System.out.println(programme_3.name);
        System.out.println(surname); // Static call
    }

    //3.5 Declare the Main method
    // 3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
      Programme_3 programme_3 = new Programme_3(); // object created
      programme_3.instanceMethod(); // Instance call
      staticMethod(); // Static call
    }
}
