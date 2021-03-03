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
        int range = 5;
        int rate = book.title.length() + book.author.length() - book.number + book.pageCount;

        if (book.title.isEmpty())
            rate -= random.nextInt(range);
        if (book.author.isEmpty())
            rate -= random.nextInt(range);
        if (book.number == 0)
            rate -= random.nextInt(range);
        if (book.pageCount == 0)
            rate -= random.nextInt(range);

        System.out.println("Оценка для книги \'" + book.title + "\': " + rate);
    }

}
