import Restaurant.Restaurant;
import Restaurant.Review;

public class Main {
    public  static void main(String[] args) {
        System.out.println("hello word");
        Review review = new Review("the resturant is good","Ahmad Ali",3);
        System.out.println(review);
        Restaurant capital= new Restaurant("Capital Restaurant",2,"dollar",review);
        System.out.println(capital.toString());



    }
}
