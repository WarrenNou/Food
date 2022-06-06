/*Name= Warren Noubi
final exam
05/15/2022
print out a cart wiht food types
 */
// Food is declared as abstract becuase it contains methods that will be override in the child classes.
// Get type is abstract first becuase it is in italique and fruit has it type, vegetable is another type .That is why it needs to be abstract
public abstract class Food implements Comparable<Food> {
  private String name;
  private double price;
  private  static int numFood=0;

  protected Food(String name, double price){
      this.name = name;
      this.price = price;
  }

    public static int getNumFood() {
        return numFood;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract String getType();
  public String toString() {

      return null;
  }
    public boolean equals(Object o){
        if (o instanceof Food){
            Food ba = (Food) o;
            return name == ba.getName();
        }
        return false;
    }
    public int compareTo(Food f){
        if(price == f.getPrice())
            return 0;
        else if(price > f.getPrice())
            return 1;
        else
            return -1;
    }

}
