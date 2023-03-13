
import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
// Instantiate some Album objects
        Album album1 = new Album(1, "Thriller", "Michael Jackson", 1982);
        Album album2 = new Album(2, "Back in Black", "AC/DC", 1980);

        // Instantiate some Author objects
        Author author1 = new Author(1, "William Shakespeare", "English playwright and poet");
        Author author2 = new Author(2, "Oscar Wilde", "Irish playwright, novelist, and poet");
        Author author3 = new Author(3, "Albert Einstein", "German-born theoretical physicist");

        // Instantiate some Quote objects
        Quote quote1 = new Quote(1, "To be or not to be, that is the question.", author1);
        Quote quote2 = new Quote(2, "Be yourself; everyone else is already taken.", author2);
        Quote quote3 = new Quote(3, "I have nothing to declare except my genius.", author3);

        // Store multiple instances of Quote in an ArrayList
        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        // Iterate over the ArrayList and print out the content and author name of each Quote
        for (Quote quote : quotes) {
            System.out.println("Quote: " + quote.getContent());

            System.out.println("Author: " + quote.getAuthor().getName());

        }
    }

}

