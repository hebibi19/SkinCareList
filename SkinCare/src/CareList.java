/**
 * Care List object contains all the chosen skin care products
 * This list will be returned at the end when the user chooses the
 * 'print' option
 */
public class CareList {
    private SkinCare oilCleanser;
    private SkinCare waterCleanser;
    private SkinCare toner;
    private SkinCare essence;
    private SkinCare serum;
    private SkinCare lotion;
    private Sunscreen sunscreen;
    private SkinCare exfoliator;

    // Constructor
    public CareList() {
        this.oilCleanser = null;
        this.waterCleanser = null;
        this.toner = null;
        this.essence = null;
        this.serum = null;
        this.lotion = null;
        this.sunscreen = null;
        this.exfoliator = null;
    }

    // GETTERS
    public SkinCare getOilCleanser() {
        return oilCleanser;
    }

    public SkinCare getWaterCleanser() {
        return waterCleanser;
    }

    public SkinCare getToner() {
        return toner;
    }

    public SkinCare getEssence() {
        return essence;
    }

    public SkinCare getSerum() {
        return serum;
    }

    public SkinCare getLotion() {
        return lotion;
    }

    public Sunscreen getSunscreen() {
        return sunscreen;
    }

    public SkinCare getExfoliator() {
        return exfoliator;
    }

    // SETTERS
    public void setOilCleanser(SkinCare oilCleanser) {
        this.oilCleanser = oilCleanser;
    }

    public void setWaterCleanser(SkinCare waterCleanser) {
        this.waterCleanser = waterCleanser;
    }

    public void setToner(SkinCare toner) {
        this.toner = toner;
    }

    public void setEssence(SkinCare essence) {
        this.essence = essence;
    }

    public void setSerum(SkinCare serum) {
        this.serum = serum;
    }

    public void setLotion(SkinCare lotion) {
        this.lotion = lotion;
    }

    public void setSunscreen(Sunscreen sunscreen) {
        this.sunscreen = sunscreen;
    }

    public void setExfoliator(SkinCare exfoliator) {
        this.exfoliator = exfoliator;
    }

    /**
     * Methods figures out how many skin care products the user has chosen and then
     * prints out the ones that are stored inside the Care List object
     *
     * Methods also returns a count (of products) that is used in the Main class
     */
    public int printCurrent(){
        int count = 0;
        System.out.print(oilCleanser == null ? "" : "[" + (++count) + "] " + "Oil Cleanser: " + oilCleanser.getName() + "\n");
        System.out.print(waterCleanser == null ? "" : "[" + (++count) + "] " + "Water Cleanser: " + waterCleanser.getName() + "\n");
        System.out.print(toner == null ? "" : "[" + (++count) + "] " + "Toner: " + toner.getName() + "\n");
        System.out.print(essence == null ? "" : "[" + (++count) + "] " + "Essence: " + essence.getName() + "\n");
        System.out.print(serum == null ? "" : "[" + (++count) + "] " + "Serum: " + serum.getName() + "\n");
        System.out.print(lotion == null ? "" : "[" + (++count) + "] " + "Moisturizer: " + lotion.getName() + "\n");
        System.out.print(sunscreen == null ? "" : "[" + (++count) + "] " + "Sunscreen: " + sunscreen.getName() + "\n");
        System.out.print(exfoliator == null ? "" : "[" + (++count) + "] " + "Exfoliator: " + exfoliator.getName() + "\n");

        return count;
    }

    /**
     * Calculates how much the care list is worth depending on the
     * number of products inside the list
     */
    public void printTotal(){
        double total = 0;
        total += oilCleanser == null ? 0 : oilCleanser.getPrice();
        total += waterCleanser == null ? 0 : waterCleanser.getPrice();
        total += toner == null ? 0 : toner.getPrice();
        total += essence == null ? 0 : essence.getPrice();
        total += serum == null ? 0 : serum.getPrice();
        total += lotion == null ? 0 : lotion.getPrice();
        total += sunscreen == null ? 0 : sunscreen.getPrice();
        total += exfoliator == null ? 0 : exfoliator.getPrice();

        System.out.printf("Total\t\t\t\t\t\t\t\t\t\t\t\t\t\t $%.2f", total);
    }

    /**
     * Method formats the Care List object into a 'receipt'
     * and returns the result to the user for them to view
     *
     * @return String result
     */
    @Override
    public String toString() {
        String result = "";
        result += "------------------------- Skin Care Product Receipt -----------------------------\n\n";
        result += oilCleanser == null ? "" : "Oil Cleanser...................................................$" + oilCleanser.getPrice() + "\nName: " + oilCleanser.getName() + "\nBrand" + oilCleanser.getBrand() + "\n\n";
        result += waterCleanser == null ? "" : "Water Cleanser ................................................$" + waterCleanser.getPrice() + "\nName: " + waterCleanser.getName() + "\nBrand: " + waterCleanser.getBrand() + "\n\n";
        result += toner == null ? "" : "Toner .........................................................$" + toner.getPrice() + "\nName: " + toner.getName() + "\nBrand: " + toner.getBrand() + "\n\n";
        result += essence == null ? "" : "Essence .......................................................$" + essence.getPrice() + "\nName: " + essence.getName() + "\nBrand: " + essence.getBrand() + "\n\n";
        result += serum == null ? "" : "Serum .......................................................$" + serum.getPrice() + "\nName: " + serum.getName() + "\nBrand: " + serum.getBrand() + "\n\n";
        result += lotion == null ? "" : "Moisturizer ...................................................$" + lotion.getPrice() + "\nName: " + lotion.getName() + "\nBrand: " + lotion.getBrand() + "\n\n";
        result += sunscreen == null ? "" : "Sunscreen .....................................................$" + sunscreen.getPrice() + "\nName: " + sunscreen.getName() + "\nBrand: " + sunscreen.getBrand() + "\nSPF: " + sunscreen.getSpf() + "\n\n";
        result += exfoliator == null ? "" : "Exfoliator ....................................................$" + exfoliator.getPrice() + "\nName: " + exfoliator.getName() + "\nBrand: " + exfoliator.getBrand() + "\n\n";
        result += "--------------------------------------------------------------------------------";


        return result;
    }
}
