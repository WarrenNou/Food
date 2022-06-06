/*Name= Warren Noubi
final exam
05/15/2022
print out a cart wiht food types
 */
import java.util.Scanner;
// depending on how the object is declsred if declared with the class fruit it will use the to string placed in fruit, if declared with the vegetable will use to srting in vegetable.
public class FoodTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Food[] groceryCart = new Food[16];
        groceryCart[0] = new Vegetable("Romaine", 1.09, "Green");
        groceryCart[1] = new Fruit("Mango", 3.79, true);
        groceryCart[2] = new Vegetable("Brussel Sprouts", 4.56, "Green");
        groceryCart[3] = new Fruit("Blueberry", 0.89, false);
        groceryCart[4] = new Vegetable("Purple Carrots", 1.56, "Purple");
        groceryCart[5] = new Vegetable("Spinach", 2.32, "Green");
        groceryCart[6] = new Vegetable("Carrots", 1.45, "Orange");
        groceryCart[7] = new Vegetable("Potatoes", 3.99, "Red");
        groceryCart[8] = new Vegetable("Broccoli", 5.21, "Green");
        groceryCart[9] = new Vegetable("Turnip", .99, "White");
        groceryCart[10] = new Vegetable("Onions", 1.99, "Yellow");
        groceryCart[11] = new Fruit("Apples", 5.79, true);
        groceryCart[12] = new Fruit("Banana", .78, false);
        groceryCart[13] = new Fruit("Kiwi", 2.65, true);
        groceryCart[14] = new Fruit("Strawberry", 4.79, true);
        groceryCart[15] = new Fruit("Watermelon", 6.32, false);

        System.out.println("Items in your cart\n");
        display(groceryCart);

        sortByPrice(groceryCart);

        System.out.println("Cart sorted by price\n");
        display(groceryCart);

        int search = getInt(scan);
        scan.nextLine(); //clearing the scanner of a new line character

        for (int i = 0; i < search; i++) {
            System.out.println("What item would you like to search for? ");
            String searchName = scan.nextLine();
            searchByName(groceryCart, searchName);
        }

        checkOut(groceryCart);
    }

    public static int getInt(Scanner s) {
        boolean loopNeeded = true;
        int num = 0;
        do {
            System.out.println("How many items would you like to search for? ");
            if (s.hasNextInt()) {
                num = s.nextInt();
                if (num > 0) {
                    loopNeeded = false;
                } else {
                    System.out.println("Enter a num greater than 0");
                }
            } else {
                System.out.println("not a number");
                s.nextLine();
            }
        } while (loopNeeded);
        return num;
    }

    public static void checkOut(Food[] cart) {// checkinh out the cost
        int y = 0;
        double totA = 0;
        for (int i = 0; i < cart.length; i++) {
            double price = cart[i].getPrice();
            while (y < i) {
                y++;
                totA = (price + totA);
                break;
            }

        }
        System.out.printf("total Cost %.2f\n", totA);
        System.out.printf("Average cost for item in your cart is %.2f\n",(totA / cart.length));
    }

    public static void display(Food[] list) {// displaying the food using the toString method
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
    }

    public static void sortByPrice(Food[] list) {// searching by price
        int max;
        for (int i = 0; i < list.length - 1; i++) {
            max = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[max].getPrice() > list[i].getPrice()) {
                    max = j;
                }
                if (i != max) {
                    Food temp = list[i];
                    list[i] = list[max];
                    list[max] = temp;
                }

            }
        }
    }

    public static Food searchByName(Food[] list, String name) { // searching by name
        int max;
        for (int i = 0; i < list.length - 1; i++) {
            max = 0;
            for (int j = 0; j < list.length; j++) {
                if (name.equals((list[i].getName()).toLowerCase())) {
                    max = j;
                }else{
                    System.out.println("item not found");
                    break;
                }
                if (i != max) {
                    Food temp = list[i];
                    list[i] = list[max];
                    list[max] = temp;
                }
            }
        }
        return null;
    }
}