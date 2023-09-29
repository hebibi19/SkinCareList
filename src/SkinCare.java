/**
 * Class is the parent/superclass of all types of skincare
 * It models the absolute basics of each type of skincare product.
 *
 * In order to construct a SkinCare object
 * SkinCare ___ = new SkinCare(parameters);
 *
 * Class contains getters for each data field and one constructor.
 */
public class SkinCare {

    /**
     * Data fields
     */
    private String name;
    private String brand;
    private double price;

    /**
     *Class constructor takes in the following variables.
     * All are String objects, except for price, which takes in a double
     */
    public SkinCare(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    /**
     * getters ( no setters )
     */
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }


    /**
     * Generates neatly formatted data to be displayed
     */
    @Override
    public String toString() {
       String result = "";
       result += "Name: \t\t" + getName() + "\n";
       result += "Brand: \t\t" + getBrand() + "\n";
       result += "Price: \t\t" + getPrice() + "\n";
        return result;
    }
}
