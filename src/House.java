import java.util.ArrayList;

/**
 * Created by rharris on 2/27/2017.
 */
public class House
{
    // PRIVATE MEMBER VARIABLES
    private ArrayList<Room> rooms;
    private double totalSquareFeet;
    private double totalCarpetCost;

    // CONSTRUCTORS

    // ACCESSORS
    public void displayRooms()
    {
        System.out.println("----------");
        System.out.println("House list of rooms:");

        //  SNIP   SNIP

        System.out.println("----------");
    }

    // MUTATORS
    public void addRoom(String name, double width, double length, double carpetCostPerSQFT)
    {
    }

}
