public class Pixar {
    String pixarMovies[] = {"Finding Nemo", "Toy Story", "Monsters Inc", "Luca", "Up"};

    String choice = pixarMovies[(int) (Math.random() * pixarMovies.length)];

    public void DisplayPixarMovie() {
        System.out.println("");
        System.out.println("A Pixar movie you could watch is: " + choice);
        System.out.println("");
    }
}
// this class creates an array of pixar movies and option is using math.random to randomly select one from the array
// DisplayPixarMovies prints the option that was selected
