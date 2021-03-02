import java.util.Random;

public class Reader {
    final Random random = new Random();

    Book choiceBook(Book[] arrBook){
        return arrBook[random.nextInt(arrBook.length-1)];
    }

    void readBook(Book book){
        System.out.println(book);
    }

    void rateBook(Book book){
        int rate = book.title.length() + book.author.length() - book.number + book.pageCount;

        if (book.title.isEmpty())
            rate -= random.nextInt(5);
        if (book.author.isEmpty())
            rate -= random.nextInt(5);
        if (book.number == 0)
            rate -= random.nextInt(5);
        if (book.pageCount == 0)
            rate -= random.nextInt(5);

        System.out.println("Оценка для книги \"" + book.title + "\": " + rate);
    }

}
