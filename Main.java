import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void ExploreHallWay() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("you walk in the halway...");
        Thread.sleep(2000);
        System.out.println("you see three doors.");
    }

    static void CheckInventory(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What you want to see in your inventory: ");
        String item = scanner.next();
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("flashlight");
        inventory.add("Old key");
        inventory.add("Strange Note");

        System.out.println("What item you looking for: ");

        if (inventory.contains(item)){
            System.out.println("you have a " + item);
        } else {
            System.out.println("you dont have that item.");
        }

    }

    static void tryFrontDoor() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        System.out.println("you walk toward the front door..");
        Thread.sleep(2000);
        System.out.println("you grab the handle and try to open it.");
        System.out.println("the door iss locked.");
        Thread.sleep(2000);
        System.out.println("TRY TO BREAK THE DOOR? [y/n] ");
        String Choice = scanner.next();

        if (Choice.equalsIgnoreCase("y")){
            Thread.sleep(2000);
            System.out.println("you try to break the door...");
            Thread.sleep(2000);
            System.out.println("it's too strong");

        } else {
            System.out.println("you step away from the door.");
        }

    }

    static void StartingScreen(){
        Scanner scanner = new Scanner(System.in);

        String ASCII = """
                
                                      ______
                                     |******|
                                     |**/\\**|
                                     |*//\\\\*|
                                    /*||__||*\\
                                   /__________\\
                                   \\__________/
                                    | .----. |
                                    | |    | |        ____
                                    | |    | |_______|.--.|___
                                    | |    | |^ ^ ^ ^||  ||^ ^\\
                              _     | |====| | ^ ^ ^ ||  || ^ ^\\
                       \\     // __  |_|----|_|^ ^ ^ ^||  ||^ ^ ^\\
                        |    ||/   /__________\\^-^-^-||__||-^-^-^\\
                  _     |    ||  .`____________`._________________\\
                   \\    |    || \\_ ----------- _/-/-/-/-/-/-/-/-/-|
                __  |___|_   ||   \\___________/ ------------------|
                  \\/.----.\\  //   | ________ |--- _____---_____ --|    _
                  //      \\\\||    ||  |  |  ||   |o___o| |o___o|  |    \\
                           \\||    ||__|__|__||---|o___o|-|     |--|    //
                     _      ||    ||  |  |  ||   | \\ / | |_____|  |.__//
                     \\`__   ||    ||__|__|__||---|\\ \\ /|-|o___o|-_|`-//\\\\
                      `-\\\\  //    ||  |  |  ||   | \\ \\ | |_____| \\\\  \\\\//
                         \\\\//     ||__|__|__||---|/_\\_\\|-|o__o_|-//   ||
                  ___     //     / /  /  \\  \\ \\  \\ \\  \\ \\ \\ \\ \\\\   ||
                 `--\\\\___/ |    /__|__|__|__|__\\--\\_\\_\\_\\_\\_\\_\\_\\_\\|  //
                     `---| |      || | __ | ||    _____   _____   || //
                         | |      || ||  || ||---|\\o\\/o|-| |o| |--||//
                         \\ \\      || ||__|| ||   | \\/ /| |_| |_|  |\\\\
                          \\ \\     || |   o| ||---| / /\\|-|_| |_|--| \\\\
                           \\ \\    ||_|    |_||   |/o/\\o| | |o| |  | //
                            | |   |__|____|__|---|_/__\\|-|_|_|_|--|//
                            | |   |__________|                   _//
                            |  \\ /____________\\-----------------/ /
                            |   |______________|_______________//\\\\ 
                ------------------------------------------------
      
                
                """;

        System.out.println(ASCII);

        System.out.print("Type [P] to start: ");
        String Start = scanner.next();

        if (Start.equalsIgnoreCase("P")){
            System.out.println("Game Beginned!");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        StartingScreen();

        Thread.sleep(2000);
        System.out.println("[Player Wakes up]: Shit i don't know how i got here");

        Thread.sleep(2000);
        System.out.println("(SEE HALL WAY FRONT YOU)");

        Thread.sleep(2000);

        while (true) {

            System.out.println("what would you like to do?");

            Thread.sleep(2000);

            System.out.println("""
                    
                    1. Explore the hallway
                    2. Check your inventory
                    3. try the front door
                    4. Quit
                
                    """);

            System.out.println("Choose: ");
            String Choose = scanner.next();

            if (Choose.equalsIgnoreCase("1")){
                ExploreHallWay();

            } else if (Choose.equalsIgnoreCase("2")) {
                CheckInventory();

            } else if (Choose.equalsIgnoreCase("3")) {
                tryFrontDoor();

            } else if (Choose.equalsIgnoreCase("4")) {
                System.out.println("Game Over.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

