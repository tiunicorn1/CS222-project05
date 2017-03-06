import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        House genericHouse = new House();
        int roomCount = 0;
        String name;
        double width;
        double length;
        double costPerSquareFoot;




        System.out.print("Enter the number of rooms the house contains: ");
        roomCount = scannerIn.nextInt();

        for (int i = 0; i < roomCount; i++) {
            System.out.print("Enter the room name (one word): ");
            name = scannerIn.next();
            System.out.print("Enter the room width: ");
            width = scannerIn.nextDouble();
            System.out.print("Enter the room length: ");
            length = scannerIn.nextDouble();
            System.out.print("Enter the room's carpet cost per square foot: ");
            costPerSquareFoot = scannerIn.nextDouble();

            genericHouse.addRoom(name, width, length, costPerSquareFoot);

        }

        genericHouse.displayRooms();
    }
}
