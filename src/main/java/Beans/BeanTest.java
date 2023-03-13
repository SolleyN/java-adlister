package Beans;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {


        Album album1 = new Album(1, "Thriller", "Michael Jackson", 1982);
        Album album2 = new Album(2, "Back in Black", "AC/DC", 1980);



        Author author1 = new Author(1, "William Shakespeare", "English playwright and poet");
        Author author2 = new Author(2, "Oscar Wilde", "Irish playwright, novelist, and poet");
        Author author3 = new Author(3, "Albert Einstein", "German-born theoretical physicist");
        Author author4 = new Author(4, "Napoleon Bonaparte", "French military and political leader");


        Quote quote1 = new Quote(1, "To be or not to be, that is the question.", author1);
        Quote quote2 = new Quote(2, "Be yourself; everyone else is already taken.", author2);
        Quote quote3 = new Quote(3, "I have nothing to declare except my genius.", author3);
        Quote quote4 = new Quote(4, "In this life we are either kings or pawns, emperors and fools", author4);

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);


        for (Quote quote : quotes) {
            System.out.println("Beans.Quote: " + quote.getContent());

            System.out.println("Beans.Author: " + quote.getAuthor().getName());

        }
    }

}

