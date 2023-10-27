package homework_week_6;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static method inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both Instance and Static method into the Manin method and run the programme.
 */

public class Programme_4 {
    //4.1 Declare two instance and two static variables.
    // Instance Variables
    String Name = "Sandip";    //Instance Variable
    String Surname = "Patel";  //Instance Variable
    // static Variables
    static boolean a = true;   //static Variable
    static boolean b = false;  // static Variable

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static method inside the print statement.
    public void instanceMethod(){
        System.out.println(Name); // instance call
        System.out.println(Surname); // instance call
        System.out.println(Programme_4.a); // static call // programme 4 not needed
        System.out.println(Programme_4.b); // static call // programme 4 not needed
    }
    //4.3 Declare one static method
    //4.4 Call all four instance and static variables into both instance and static method inside the print statement.
    public static void staticMethod(){
        Programme_4 programme_4 = new Programme_4(); // object created
        System.out.println(programme_4.Name); // instance call
        System.out.println(programme_4.Surname); // instance call
        System.out.println(a); // static call
        System.out.println(b); // static call

    }
    //4.5 Declare the Main Method.
    //4.6 Call both instance and static method into the Main method and run the programme.
    public static void main(String[] args){
        Programme_4 programme_4 = new Programme_4(); // object in main method
        programme_4.instanceMethod(); // call instance via object
        staticMethod(); // call static method
    }

}
