/**
 * Created by rharris on 2/27/2017.
 */
public class Room
{
    // PRIVATE MEMBER VARIABLES
    private String name;
    private double width;
    private double length;
    private double carpetCostPerSQFT;

    // CONSTRUCTORS

    public Room()
    {
        name = "";
        width = 0.0;
        length = 0.0;
        carpetCostPerSQFT = 0.0;

    }

    public Room(String name, double width, double length, double carpetCostPerSQFT)
    {
        setName(name);
        setWidth(width);
        setLength(length);
        setCarpetCostPerSQFT(carpetCostPerSQFT);
    }

    // ACCESSORS

    public String getName()
    {
        return name;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public double getCarpetCostPerSQFT()
    {
        return carpetCostPerSQFT;
    }




    // MUTATORS

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setCarpetCostPerSQFT(double carpetCostPerSQFT)
    {
        this.carpetCostPerSQFT = carpetCostPerSQFT;
    }





    public double getSquareFeet()
    {
        return width * length;

    }

    public double getCarpetCost()
    {
        return calcCarpetCost(getSquareFeet(), carpetCostPerSQFT);
    }

    public String toString()
    {
        return String.format("RM - %s: W: %.2f  L: %.2f  SQFT: %.2f Carpet $$/sqft: %.2f  Carpet Cost: $%.2f", name, width, length, getSquareFeet(), carpetCostPerSQFT, getCarpetCost());

    }




    // PRIVATE INTERNAL HELPER METHODS

    private double calcCarpetCost(double getSquareFeet, double carpetCostPerSQFT)
    {

        return getSquareFeet * carpetCostPerSQFT;
    }

}
