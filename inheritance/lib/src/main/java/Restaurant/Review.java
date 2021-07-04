package Restaurant;

public class Review {
    private String body;
    private String author;
    private int starsNum;


  public Review(String body, String author, int starsNum  ) {
      this.body=body;
      this.author=author;
      this.starsNum= starsNum;
  }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStarsNum() {
        return starsNum;
    }

    public void setStarsNum(int starsNum) {
        this.starsNum = starsNum;
    }

    @Override
    public String toString() {
        return "Review on the Restaurant Service: {" +
                "comment='" + body + '\'' +
                ", By:'" + author + '\'' +
                ", Evaluation Stars Num=" + starsNum +
                '}';
    }

}
