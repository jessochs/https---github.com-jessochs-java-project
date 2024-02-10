public class Romcom {
    String romcomMovies[] = {"While You Were Sleeping", "Return to Me", "You've Got Mail", "How to Lose a Guy In 10 Days", "Notting Hill", "10 Things I hate About You"};

    String recomendation = romcomMovies[(int) (Math.random() * romcomMovies.length)];

    public void DisplayRomCom() {
        System.out.println("A romantic comedy we recommend is: " + recomendation);
        System.out.println("");
    }
}
// this class creates an array of romantic comedy movies and option is using math.random to randomly select one from the array
// DisplayRomCom prints the option that was selected
