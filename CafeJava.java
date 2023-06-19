import java.util.ArrayList;

public class CafeJava {
  public static void main(String[] args) {
    // APP VARIABLES
    
    // APP INTERACTION SIMULATION (Add your code for the challenges below)
    // Example:
    // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    // ** Your customer interaction print statements will go here ** //
    // customer1 "Cindhuri" orders a coffee
    // print order status message
    // System.out.println(isReadyOrder1? customer1 + pendingMessage : );
    // System.out.println(customer1+pendingMessage);
    // System.out.println(generalGreeting + customer1 + (isReadyOrder1 ? readyMessage + displayTotalMessage + String.format("%.2f", dripCoffee) + ".\n" : pendingMessage));
    // // System.out.println(generalGreeting + customer1 + pendingMessage + displayTotalMessage + dripCoffee);
    // System.out.println(generalGreeting + customer4 + (isReadyOrder4 ? readyMessage + displayTotalMessage + String.format("%.2f", cappucino) + ".\n" : pendingMessage));
    
    // System.out.println(generalGreeting + customer2 + (isReadyOrder2 ? readyMessage + displayTotalMessage + String.format("%.2f", latte*2) + ".\n" : pendingMessage));

    // System.out.println(generalGreeting + customer3 + (isReadyOrder3 ? readyMessage + displayTotalMessage + String.format("%.2f", (latte-dripCoffee)) + ".\n" : pendingMessage));


    
    // Lines of text that will appear in the app. 
    String generalGreeting = "Welcome to Cafe Java, ";
    String pendingMessage = ", your order will be ready shortly";
    String readyMessage = ", your order is ready ";
    String displayTotalMessage = "Your total is $";
    
    // Menu variables (add yours below)
    double mochaPrice = 3.75;
    double cappucino = 5.5;
    double latte = 8.5;
    double dripCoffee = 2;

    // Customer name variables (add yours below)
    String customer1 = "Cindhuri";
    String customer2 = "Sam";
    String customer3 = "Jimmy";
    String customer4 = "Noah";

    // Order completions (add yours below)
    boolean isReadyOrder1 = true;
    boolean isReadyOrder2 = true;
    boolean isReadyOrder3 = true;
    boolean isReadyOrder4 = false;

    ArrayList<String> totalItems = new ArrayList<String>();
    Double totalPrice;
    System.out.println("Please input your name...");
    String newCustomer = System.console().readLine();
    System.out.println("What can we get for you today?");
    String orderItem = System.console().readLine();  
    totalItems.add(orderItem);
    

    switch(newCustomer) {
      case "Cindhuri":              
        System.out.println(generalGreeting + customer1 + (isReadyOrder1 ? readyMessage + displayTotalMessage + String.format("%.2f", dripCoffee) + ".\n" : pendingMessage));
        break;  
      case "Sam":
        System.out.println(generalGreeting + customer2 + (isReadyOrder2 ? readyMessage + displayTotalMessage + String.format("%.2f", latte*2) + ".\n" : pendingMessage));
        break;
      case "Jimmy":
        System.out.println(generalGreeting + customer3 + (isReadyOrder3 ? readyMessage + displayTotalMessage + String.format("%.2f", (latte-dripCoffee)) + ".\n" : pendingMessage));
        break;
      case "Noah":
        System.out.println(generalGreeting + customer4 + (isReadyOrder4 ? readyMessage + displayTotalMessage + String.format("%.2f", cappucino) + ".\n" : pendingMessage));
        break;
      default :             
        System.out.println(newCustomer+pendingMessage);            
        break;       
      } 
  }
}
