public class Fantasy {
    String[] fantasyMovies  = {"Harry Potter", "Lord of the Rings", "Spirited Away", "Princess Bride", "Charlie and the Chocolate Factory" };

    String switched = fantasyMovies[(int) (Math.random() * fantasyMovies.length)];

    
    public void DisplayFanstasyMovie() {
        System.out.println("A fantasy movie we reccommend is: " + switched);
        System.out.println("");

    }
}
// this class creates an array of fantasy movies and option is using math.random to randomly select one from the array
// DisplayFantasyMovies prints the option that was selected
