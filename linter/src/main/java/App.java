import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        try{
            File myFile = new File("index.js");
            Scanner myReader = new Scanner(myFile);
            int counter =0;
            while (myReader.hasNextLine()){
                String line = myReader.nextLine();
//                System.out.println(line);
                if (line=="" || line.contains("{")|| line.contains("}")|| line.contains("if") || line.contains("else")){
                    continue;
                }else if( line.endsWith(";")) {
                    continue;
                } else {
                    System.out.println("Line "+counter+" : Missing semicolon.");

                }
                counter +=1;
            }
            myReader.close();

        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
