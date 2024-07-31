package DExerciseFour;

public class Books {
    private String bookName;
    private String author;
    private Double score;

    public Books() {
    }

    public Books(String bookName, String author, Double score) {
        this.bookName = bookName;
        this.author = author;
        this.score = score;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", score=" + score +
                '}';
    }
}
