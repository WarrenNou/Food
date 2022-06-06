/*Name= Warren Noubi
final exam
05/15/2022
print out a cart wiht food types
 */
// Constructor chanining is when the program automatically know which class the method is supposed to be used from. Overrding the element in that particular method.
// in this it could be used by the method toString which contains element proper to the claas vegetable. So the program will know that i am reffereing to the  sting method places in the vegetable class
public class Vegetable extends Food{
    private String color;
    private static int numVegetable=0;
    public static int counter;
//public Vegetable(String color) {
  //  this.color = color;

//}overloading the constructor
    public Vegetable ( String name, double price, String color ){// intializing the varaible and methods
        super(name, price);
        this.color = color;

    }

    public static int getNumVegetable() {
        return numVegetable;
    }

    public String getColor() {
        return color;
    }
    public void  getColor( String color) {

    }
    @Override
    public String getType(){

        return "Vegetable";
    }
    @Override
    public String toString() {// printing out the values of for the vegetables

        return (getName()+"\t"+ getType()+ " ("+getColor()+") "+ "\t"+ getPrice());
    }

    @Override
    public int compareTo(Food o) {
        return 0;
    }
    public static int counter(){

        return 0;
    }
}
