import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Fantasy fant1 = new Fantasy();
        Action act1 = new Action();
        Romcom rom1 = new Romcom();
        Pixar pixar1 = new Pixar();
        Comedy comedy1 = new Comedy();
        // instantiate one of each class

        System.out.println("Hello, Welcome to the movie generator!");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        // I'm using the scanner to read input from the user


        boolean choice = false;

        while(!choice) {
            System.out.println("What kind of movies do you prefer? Choose a number 1-5:");
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
                    comedy1.DisplayComedyMovie();
                    System.out.println("");
                    break;
                case 2:
                    fant1.DisplayFanstasyMovie();
                    System.out.println("");
                    break;
                case 3:
                    act1.DisplayActionMovie();
                    System.out.println("");
                    break;
                case 4:
                    rom1.DisplayRomCom();
                    
                    System.out.println("");
                    break;
                case 5:
                    pixar1.DisplayPixarMovie();
                    System.out.println("");
                    break;
                case 6:
                    return;
                    // breaks out of the loop
            }
            scan.close();
            // close the scanner

        }

    }
}
