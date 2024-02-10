public class Comedy {
    String comedyMovies[] = {"Mr. Bean", "Bench Warmers", "Happy Gilmore", "Dumb and Dumber", "Nacho Libre"};

    String result = comedyMovies[(int) (Math.random() * comedyMovies.length)];

    public void DisplayComedyMovie() {
        System.out.println("");
        System.out.println("A comedy movie you could watch is: " + result);
        System.out.println("");
    }
}
// this class creates an array of comdy movies and option is using math.random to randomly select one from the array
// DisplayComedyMovies prints the option that was selected
