package Library;
import interf.AddReview;

public class Shop implements AddReview {
    private String name ;
    private String description ;
    private int numDollarSign ;
    private Review review;


    public Shop(String name, String description, int numDollarSign) {
        this.name= name;
        this.description=description;
        this.numDollarSign=numDollarSign;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumDollarSign() {
        return numDollarSign;
    }

    public void setNumDollarSign(int numDollarSign) {
        this.numDollarSign = numDollarSign;
    }

    @Override
    public String toString() {
        return "Shop Details{" +
                "Shpe Name:'" + name + '\'' +
                ", About:'" + description + '\'' +
                ",Number of Dollar signs:" + numDollarSign +
                '}';
    }

    @Override
    public void AddReview(String body, String author, int starsNum) {
        this.review= new Review(body,author,starsNum);

    }



    public Review getReview() {
        return review;
    }

}
