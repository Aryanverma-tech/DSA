import java.util.*;

class Coffee {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        
        
        char mainMenu = sc.next().toLowerCase().charAt(0);
        int subMenuIndex = sc.nextInt();

        
        String[] c = {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"};
        String[] t = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"};
        String[] s = {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"};
        String[] b = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"};

        
        String selectedItem = null;

       
        if (mainMenu == 'c' && subMenuIndex >= 1 && subMenuIndex <= c.length) {
            selectedItem = "Welcome to CCD!\nEnjoy your " + c[subMenuIndex - 1] + "!";
        } else if (mainMenu == 't' && subMenuIndex >= 1 && subMenuIndex <= t.length) {
            selectedItem = "Welcome to CCD!\nEnjoy your " + t[subMenuIndex - 1] + "!";
        } else if (mainMenu == 's' && subMenuIndex >= 1 && subMenuIndex <= s.length) {
            selectedItem = "Welcome to CCD!\nEnjoy your " + s[subMenuIndex - 1] + "!";
        } else if (mainMenu == 'b' && subMenuIndex >= 1 && subMenuIndex <= b.length) {
            selectedItem = "Welcome to CCD!\nEnjoy your " + b[subMenuIndex - 1] + "!";
        }

        if (selectedItem != null) {
            System.out.println(selectedItem);
        } else {
            System.out.println("Invalid input");
        }

        
    }
}
