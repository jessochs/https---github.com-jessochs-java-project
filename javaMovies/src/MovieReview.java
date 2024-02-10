import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MovieReview { throws FileNotFoundException
    public String _review;

    public MovieReview() {}
    public MovieReview(String review) {
        _review = review;
    }

    File file = new File("review.txt");

    PrintWriter writer = new PrintWriter(file);


    
    public LinkedList<String> entries = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);


    public void AddMovieReview() {
        // ReviewEntry review = new ReviewEntry();
        System.out.println("Write you movie review below. Please include the movie title in the review.");
        _review = scanner.next();
        this.entries.add(_review);
    }

    public void DisplayReview() {
        for (String e : entries) {
                System.out.println(e);
            
        } 
        
    }

    public void Save() {
        System.out.println("What is the name of your file? (review.txt)");
        String filename = scanner.next();
        File file = new File(filename);
        Scanner scan = new Scanner(file); 

        System.out.println(scan);
        // throwfilenotfound exception somehow or try catch, but it doesnt have that as an option
    }

    public void Load() {
        entries.clear();
        System.out.println("What is the name of your file? (review.txt)");
    }


    
}
