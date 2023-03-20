public class BookMain {
    int pages;
    int numberChapters;
    String name;
    String binding;

    public BookMain(int pages, int numberChapters, String name, String binding) {
        this.pages = pages;
        this.numberChapters = numberChapters;
        this.name = name;
        this.binding = binding;

    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "BookMain{" +
                "pages=" + pages +
                ", numberChapters=" + numberChapters +
                ", name='" + name + '\'' +
                ", binding='" + binding + '\'' +
                '}';
    }

}