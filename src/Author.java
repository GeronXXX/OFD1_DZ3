public class Author {
    String author;
    String genre;

    public Author(String author, String genre) {
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
