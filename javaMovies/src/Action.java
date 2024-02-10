public class Action {
    String actionMovies[] = {"Die Hard", "Hungar Games", "Logan Lucky", "Top Gun", "Fast & Furious"};

    String option = actionMovies[(int) (Math.random() * actionMovies.length)];

    public void DisplayActionMovie() {
        System.out.println("An action movie you could watch is: " + option);
        System.out.println("");
    }
}
// this class creates an array of action movies and option is using math.random to randomly select one from the array
// DisplayActionMovies prints the option that was selected
