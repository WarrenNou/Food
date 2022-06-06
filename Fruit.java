/*Name= Warren Noubi
final exam
05/15/2022
print out a cart wiht food types
 */
/*
overloading signiture changes and overrifding signature stay the same. For example i overloaded the contructor fruit and i overwrided the to string method.
 */

public class Fruit extends Food{
    private boolean seeds;
    private static int numFruit=0;

    public static int getNumFruit() {
        return numFruit;
    }
//public Fruit(boolean seeds){
   //     super();
//}Overloading the contructor

    public Fruit(String names, double price, boolean seeds){// constuctor for the fruit
        super(names,price);
        this.seeds = seeds;

    }
    @Override
    public String getType() {
        return "Fruit";
    }

    public boolean getSeeds() {
        return seeds;
    }
    public void getSeeds(boolean seeds) {

    }
    @Override
    public String toString() {

        return  (getName()+"\t"+ getType()+ " ("+getSeeds()+") "+ "\t"+ getPrice());
    }
    public static int counter(){
        return 0;
    }


    @Override
    public int compareTo(Food o) { // overwrite the compare
        return 0;
    }
}
