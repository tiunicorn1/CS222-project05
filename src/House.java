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


    public House()
    {
        rooms = new ArrayList<Room>();
        totalSquareFeet = 0;
        totalCarpetCost = 0.0;
    }

    // ACCESSORS
    public void displayRooms()
    {
        System.out.println("----------");
        System.out.println("House list of rooms:");

        for(Room item : rooms)
        {
            System.out.println(item.toString());
        }

        System.out.println(String.format("Total SQ FT: %.2f", totalSquareFeet));
        System.out.println(String.format("Total Carpet Cost: $%.2f", totalCarpetCost));

        System.out.println("----------");
    }

    // MUTATORS
    public void addRoom(String name, double width, double length, double carpetCostPerSQFT)
    {
        Room item = new Room(name, width, length, carpetCostPerSQFT);
        rooms.add(item);

        totalSquareFeet += item.getSquareFeet();
        totalCarpetCost += item.getCarpetCost();
    }

}
