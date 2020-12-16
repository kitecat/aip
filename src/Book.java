public class Book extends PrintEdition {
    private String author;
    private int year;

    public Book() {
        super();
        author = "";
        year = 0;
    }

    public Book(String name, int edition, String author, int year) {
        super(name, edition);
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга " +
                "название = '" + getName() + '\'' +
                ", тираж = '" + getEdition() + '\'' +
                ", автор = '" + author + '\'' +
                ", год = " + year;
    }
}