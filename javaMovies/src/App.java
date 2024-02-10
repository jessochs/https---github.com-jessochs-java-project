import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, Welcome to the movie generator!");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        // I'm using the scanner to read input from the user


        boolean choice = false;

        while(!choice) {
            System.out.println("What kind of movie do you feel like watching? Choose a number 1-5:");
            System.out.println("1. Funny");
            System.out.println("2. Whimsical");
            System.out.println("3. Action");
            System.out.println("4. Romantic Comedy");
            System.out.println("5. Animated");
            System.out.println("6. Exit program");
            // set up the menu 

            int response = scan.nextInt();
            // scans the user's response
            // using a switch case to display all the options

            switch(response) {
                case 1:
                    Comedy comedy1 = new Comedy();
                    // the class is instantiated here so if the same option is chosen 
                    // twice it won't keep giving the same answer everytime.
                    // You will still get repeat movies since there aren't 
                    // man option in the array, but it should change
                    comedy1.DisplayComedyMovie();
                    System.out.println("");
                    break;
                case 2:
                    Fantasy fant1 = new Fantasy();
                    fant1.DisplayFanstasyMovie();
                    System.out.println("");
                    break;
                case 3:
                    Action act1 = new Action();
                    act1.DisplayActionMovie();
                    System.out.println("");
                    break;
                case 4:
                    Romcom rom1 = new Romcom();
                    rom1.DisplayRomCom();
                    
                    System.out.println("");
                    break;
                case 5:
                    Pixar pixar1 = new Pixar();
                    pixar1.DisplayPixarMovie();
                    System.out.println("");
                    break;
                case 6:
                    return;
                    // breaks out of the loop
            }

        }

    }
}
