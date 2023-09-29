/**
 * Sunscreen Class inherits from SkinCare class.
 * Adds additional data fields [spf].
 */
public class Sunscreen extends SkinCare {
   private int spf;
    /**
     * Class constructor takes in the following variables.
     * All are String objects, except for price, which takes in a double
     *
     * @param name
     * @param brand
     * @param price
     */
    public Sunscreen(int spf, String name, String brand, double price) {
        super(name, brand, price);
        this.spf = spf;
    }

    /**
     * Getter for a sunscreen's spf level
     */
    public int getSpf() {
        return spf;
    }

    @Override
    public String toString() {
        String result = "";
        result += super.toString();
        result += "SPF: \t\t" + getSpf() + "\n";
        return result;
    }
}
