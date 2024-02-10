public class ReviewEntry {
    
    public String _response;
    public String _moviePrompt;

    public ReviewEntry() {};

    public ReviewEntry(String response, String moviePrompt) {
       _response = response;
       _moviePrompt = moviePrompt;
    }

    public void Display() {
        System.out.println(_response);
    }

}
