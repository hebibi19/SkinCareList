import java.util.ArrayList;
import java.util.Random;

/**
 * DB class works as a local database for the program
 * It initializes 4 objects of each type of skin care product
 *
 * Also contains methods to generate a Care List of a certain number of products
 * (genThree(), genFour(), ... etc)
 *
 * Also contains printing methods for all types of products that displays all objects in that array
 */
public class DB {
    // one array per skin care product
    private ArrayList<SkinCare> oilCleanser = new ArrayList<SkinCare>();
    private ArrayList<SkinCare> waterCleanser = new ArrayList<SkinCare>();
    private ArrayList<SkinCare> toner = new ArrayList<SkinCare>();
    private ArrayList<SkinCare> essence = new ArrayList<SkinCare>();
    private ArrayList<SkinCare> serum = new ArrayList<SkinCare>();
    private ArrayList<SkinCare> lotion = new ArrayList<SkinCare>();
    private ArrayList<Sunscreen> sunscreen = new ArrayList<Sunscreen>();
    private ArrayList<SkinCare> exfoliator = new ArrayList<SkinCare>();

    private CareList cl;

    public DB(CareList cl) {
        initializeDB();
        this.cl = cl;
    }

    /**
     * Private method stores all the ArrayList data
     *      It initializes 4 objects of each product type.
     *      it then adds each object to its respective ArrayList.
     */
    private void initializeDB() {

        SkinCare oil1 =  new SkinCare("Sensibio H2O Micellar Water", "Bioderma", 10.89);
        SkinCare oil2 =  new SkinCare("Ginseng Cleansing Oil", "Beauty of Joseon", 12.89);
        SkinCare oil3 =  new SkinCare("Speedy Cleansing OIl", "SoftyMo", 5.49);
        SkinCare oil4 =  new SkinCare("Green Tea Hydrating Cleansing Oil", "innisFree", 24.00);

        oilCleanser.add(oil1);
        oilCleanser.add(oil2);
        oilCleanser.add(oil3);
        oilCleanser.add(oil4);


        SkinCare water1 =  new SkinCare("Hydrating Facial Cleanser", "CeraVe", 11.31);
        SkinCare water2 =  new SkinCare("Low pH Good Morning Cleanser", "COSRX", 6.99);
        SkinCare water3 =  new SkinCare("SoonJung pH 6.5 Whip Cleanser", "Etude House", 5.07);
        SkinCare water4 =  new SkinCare("Senka Perfect Whip Cleansing Cream", "Shiseido", 8.90);

        waterCleanser.add(water1);
        waterCleanser.add(water2);
        waterCleanser.add(water3);
        waterCleanser.add(water4);

        SkinCare toner1 =  new SkinCare("Heartleaf 77% Soothing Toner", "Anua", 23.75);
        SkinCare toner2 =  new SkinCare("AHA/BHA Clarifying Treatment Toner", "COSRX", 8.29);
        SkinCare toner3 =  new SkinCare("AHA BHA PHA 30 Days Miracle Toner", "Some By Mi", 11.50);
        SkinCare toner4 =  new SkinCare("Watermelon Glow PHA + BHA Pore-Tight Toner", "Glow Recipie", 34.00);

        toner.add(toner1);
        toner.add(toner2);
        toner.add(toner3);
        toner.add(toner4);

        SkinCare essence1 =  new SkinCare("Advanced Snail 96 Mucin Power Essence", "COSRX", 12.87);
        SkinCare essence2 =  new SkinCare("Galacto Naicin 97 Power Essence", "PURITO", 15.22);
        SkinCare essence3 =  new SkinCare("Galactomy Niacin Essence", "ma:nyo", 26.10);
        SkinCare essence4 =  new SkinCare("Royal Honey Propolis Enrich Essence", "Skinfood", 22.99);

        essence.add(essence1);
        essence.add(essence2);
        essence.add(essence3);
        essence.add(essence4);

        SkinCare serum1 =  new SkinCare("Lactic Acid 10% + HA", "The Ordinary", 8.90);
        SkinCare serum2 =  new SkinCare("Glow Serum: Proplis + Niacinamide", "Beauty of Joseon", 12.00);
        SkinCare serum3 =  new SkinCare("Hyaluronic Acid Hydrating Serum", "The INKEY List", 9.99);
        SkinCare serum4 =  new SkinCare("Guava Vitamin C Dark Spot Treatment Serum", "Glow Recipie", 45.00);

        serum.add(serum1);
        serum.add(serum2);
        serum.add(serum3);
        serum.add(serum4);

        SkinCare lotion1 =  new SkinCare("Soon Jung 2x Barrier Intensive Cream", "Etude House", 9.49);
        SkinCare lotion2 =  new SkinCare("Toleraine Double Repair Face Moisturizer", "La Roche-Posay", 19.00);
        SkinCare lotion3 =  new SkinCare("Oil Free Ultra Mosturizing Lotion with Birch Sap", "COSRX", 12.79);
        SkinCare lotion4 =  new SkinCare("Dewy Glow Moisturizer with Cherry Blossom & Naiacinamide", "innisfree", 26.00);

        lotion.add(lotion1);
        lotion.add(lotion2);
        lotion.add(lotion3);
        lotion.add(lotion4);

        Sunscreen sunscreen1 =  new Sunscreen(50,"Relief Sun: Rice + Probiotics", "Beauty of Joseon", 12.00);
        Sunscreen sunscreen2 =  new Sunscreen(60,"UV Aqua Rich Watery Essence SPF", "Biore", 8.99);
        Sunscreen sunscreen3 =  new Sunscreen(36,"Daily UV Defense Sunscreen", "innisfree", 16.00);
        Sunscreen sunscreen4 =  new Sunscreen(45,"All Round Safe Block Aqua Sun Gel SPF", "Missha", 10.55);

        sunscreen.add(sunscreen1);
        sunscreen.add(sunscreen2);
        sunscreen.add(sunscreen3);
        sunscreen.add(sunscreen4);

        SkinCare exfol1 =  new SkinCare("AHA 30% + BHA 2% Peeling Solution", "The Ordinary", 9.50);
        SkinCare exfol2 =  new SkinCare("Watermelon Glow PHA + bHA Pre Tight Toner", "Glow Recipe", 34.00);
        SkinCare exfol3 =  new SkinCare("Bio Peel Gauze Peeling Green Tea", "Neogen", 19.99);
        SkinCare exfol4 =  new SkinCare("Peeling Gel", "Pyunkang Yul", 10.59);

        exfoliator.add(exfol1);
        exfoliator.add(exfol2);
        exfoliator.add(exfol3);
        exfoliator.add(exfol4);


    }

    // ADD METHODS
    public void addOil(SkinCare s) {
        oilCleanser.add(s);
    }

    public void addWater(SkinCare s) {
        waterCleanser.add(s);
    }

    public void addToner(SkinCare s) {
        toner.add(s);
    }

    public void addEssence(SkinCare s) {
        essence.add(s);
    }

    public void addSerum(SkinCare s) {
        serum.add(s);
    }

    public void addLotion(SkinCare s) {
        lotion.add(s);
    }

    public void addSunscreen(Sunscreen s) {
        sunscreen.add(s);
    }

    public void addExfoliator(SkinCare s) {
        exfoliator.add(s);
    }

    // GETTER METHODS

    /**
     *  Returns the respective oil Cleanser from the Database
     * @param index
     * @return
     */
    public SkinCare getOil(int index) {
        return oilCleanser.get(index);
    }

    /**
     *  Returns the respective water Cleanser from the Database
     * @param index
     * @return
     */
    public SkinCare getWater(int index) {
        return waterCleanser.get(index);
    }

    /**
     *  Returns the respective toner from the Database
     * @param index
     * @return
     */
    public SkinCare getToner(int index) {
        return toner.get(index);
    }

    /**
     *  Returns the respective essence from the Database
     * @param index
     * @return
     */
    public SkinCare getEssence(int index) {
        return essence.get(index);
    }

    /**
     *  Returns the respective serum from the Database
     * @param index
     * @return
     */
    public SkinCare getSerum(int index) {
        return serum.get(index);
    }

    /**
     *  Returns the respective lotion from the Database
     * @param index
     * @return
     */
    public SkinCare getLotion(int index) {
        return lotion.get(index);
    }

    /**
     *  Returns the respective sunscreen from the Database
     * @param index
     * @return
     */
    public Sunscreen getSunscreen(int index) {
        return sunscreen.get(index);
    }

    /**
     *  Returns the respective exfoliator from the Database
     * @param index
     * @return
     */
    public SkinCare getExfoliator(int index) {
        return exfoliator.get(index);
    }

    // PRINTING METHODS
    /**
     * Method displays all available oilCleansers
     */
    public int printOil(){
        for (int i = 0; i < oilCleanser.size(); i++){
            System.out.println("[" + (i+1) + "] " + oilCleanser.get(i).getName());
        }
        return oilCleanser.size();
    }

    /**
     * Method displays all available waterCleansers
     */
    public int printWater(){
        for (int i = 0; i < waterCleanser.size(); i++){
            System.out.println("[" + (i+1) + "] " + waterCleanser.get(i).getName());
        }
        return waterCleanser.size();
    }

    /**
     * Method displays all available toners
     */
    public int printToner(){
        for (int i = 0; i < toner.size(); i++){
            System.out.println("[" + (i+1) + "] " + toner.get(i).getName());
        }
        return toner.size();
    }

    /**
     * Method displays all available essence
     */
    public int printEssence(){
        for (int i = 0; i < essence.size(); i++){
            System.out.println("[" + (i+1) + "] " + essence.get(i).getName());
        }
        return essence.size();
    }

    /**
     * Method displays all available Serums
     */
    public int printSerum(){
        for (int i = 0; i < serum.size(); i++){
            System.out.println("[" + (i+1) + "] " + serum.get(i).getName());
        }
        return serum.size();
    }

    /**
     * Method displays all available lotion
     */
    public int printLotion(){
        for (int i = 0; i < lotion.size(); i++){
            System.out.println("[" + (i+1) + "] " + lotion.get(i).getName());
        }
        return lotion.size();
    }

    /**
     * Method displays all available sunscreen
     */
    public int printSunscreen(){
        for (int i = 0; i < sunscreen.size(); i++){
            System.out.println("[" + (i+1) + "] " + sunscreen.get(i).getName());
        }
        return sunscreen.size();
    }

    /**
     * Method displays all available oilCleansers
     */
    public int printExfoliator(){
        for (int i = 0; i < exfoliator.size(); i++){
            System.out.println("[" + (i+1) + "] " + exfoliator.get(i).getName());
        }
        return exfoliator.size();
    }

    // GENERATORS

    /**
     * Method updates the Care List with three skin care products
     */
    public void genThree() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());

        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setLotion(lotion.get(rand3));
    }

    /**
     * Method updates the Care List with four skin care products
     */
    public void genFour() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());
        int rand4 = r.nextInt(sunscreen.size());

        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setLotion(lotion.get(rand3));
        cl.setSunscreen(sunscreen.get(rand4));

    }

    /**
     * Method updates the Care List with five skin care products
     */
    public void genFive() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());
        int rand4 = r.nextInt(sunscreen.size());
        int rand5 = r.nextInt(exfoliator.size());

        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setLotion(lotion.get(rand3));
        cl.setSunscreen(sunscreen.get(rand4));
        cl.setExfoliator(exfoliator.get(rand5));

    }

    /**
     * Method updates the Care List with six skin care products
     */
    public void genSix() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());
        int rand4 = r.nextInt(sunscreen.size());
        int rand5 = r.nextInt(exfoliator.size());
        int rand6 = r.nextInt(essence.size());

        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setEssence(essence.get(rand6));
        cl.setLotion(lotion.get(rand3));
        cl.setSunscreen(sunscreen.get(rand4));
        cl.setExfoliator(exfoliator.get(rand5));

    }

    /**
     * Method updates the Care List with seven skin care products
     */
    public void genSeven() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());
        int rand4 = r.nextInt(sunscreen.size());
        int rand5 = r.nextInt(exfoliator.size());
        int rand6 = r.nextInt(essence.size());
        int rand7 = r.nextInt(oilCleanser.size());

        cl.setOilCleanser(oilCleanser.get(rand7));
        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setEssence(essence.get(rand6));
        cl.setLotion(lotion.get(rand3));
        cl.setSunscreen(sunscreen.get(rand4));
        cl.setExfoliator(exfoliator.get(rand5));

    }

    /**
     * Method updates the Care List with eight skin care products
     */
    public void genEight() {
        Random r = new Random();
        int rand1 = r.nextInt(waterCleanser.size());
        int rand2 = r.nextInt(toner.size());
        int rand3 = r.nextInt(lotion.size());
        int rand4 = r.nextInt(sunscreen.size());
        int rand5 = r.nextInt(exfoliator.size());
        int rand6 = r.nextInt(essence.size());
        int rand7 = r.nextInt(oilCleanser.size());
        int rand8 = r.nextInt(serum.size());

        cl.setOilCleanser(oilCleanser.get(rand7));
        cl.setWaterCleanser(waterCleanser.get(rand1));
        cl.setToner(toner.get(rand2));
        cl.setEssence(essence.get(rand6));
        cl.setSerum(serum.get(rand8));
        cl.setLotion(lotion.get(rand3));
        cl.setSunscreen(sunscreen.get(rand4));
        cl.setExfoliator(exfoliator.get(rand5));

    }









}
