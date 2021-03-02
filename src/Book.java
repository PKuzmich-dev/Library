public class Book {
    String title = "";
    String author = "";
    int number;
    int pageCount;

    Book(String title){
        this.title = title;
    }

    Book(String title, int pageCount){
        this.title = title;
        this.pageCount = pageCount;
    }

    Book(String title, int pageCount, String author){
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

    Book(String title, int pageCount, String author, int number){
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", number=" + number +
                ", pageCount=" + pageCount +
                '}';
    }
}
