import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        int x = 7;
        float f = 42.3f;
        double d = 42.3;

        // execute the function called "pluralize"

        int dogCount = 2;
        String animal="dog";
        pluralize(animal,dogCount);

        // this is Flipping Coins function calls
        int headNum= 2;

        flipNHeads(headNum);
        // execute clock () cutrrent time
        clock ();

    }

    public  static void pluralize (String word, int numb){
        if (numb==1) {
            System.out.println ("I own "+numb+ " " +word+".");
        }else{
            System.out.println ("I own "+numb+ " " +word+"s .");
        }
    }

    public static void flipNHeads(int n){
        boolean checker = true;
        Random random= new Random();
        int counter = 0;
        int numHeader=0;
         while (checker){
             counter +=1;
             float randNum = random.nextFloat();
             if (randNum < .5){
                 System.out.println ("tails");
                 numHeader =0;

             }else{
                 System.out.println ("heads");
                 numHeader +=1;
             }
             if (numHeader ==  n){
                 System.out.println("It took "+ counter+ " flips to flip " +n+ " heads in a row.");
                 checker = false;
             }

         }


    }

    public static void clock (){
        int secPrevioue =0;
        while (true) {
        LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            if (second != secPrevioue){
                System.out.println(hour+":"+minute+":"+second);

            }
            secPrevioue= second;
        }


    }


}