import Library.Restaurant;
import Library.Review;
import Library.Theater;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public  static void main(String[] args) {
        System.out.println("hello word");
        Review review = new Review("the resturant is good","Ahmad Ali",3);
        System.out.println(review);
        Restaurant capital= new Restaurant("Capital Restaurant",2,"dollar",review);
        System.out.println(capital.toString());
        // Theater class
        ArrayList<String> movies = new ArrayList<>( Arrays.asList("Lord of the Ring", "Gladiator", "Joker"));

        Theater theater = new Theater("Irbid Cenima",movies);
        System.out.println(theater.toString());
         theater.removeMovie("Joker");
        System.out.println(theater.toString());
        theater.addMovie("Matrix");
        theater.AddReview("it is beatiful movie ", "Ahmad Ali",4,"Joker" );
        System.out.println(theater.toString());
    }
}
