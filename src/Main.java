public class Main {

    public static void main(String[] args) {
	// write your code here
        Book[] arrBook = new Book[5];

        arrBook[0] = new Book("Колобок");
        arrBook[1] = new Book("Мастер и Маргарита", 300, "Булгаков");
        arrBook[2] = new Book("Сталкер", 200, "Петров", 1);
        arrBook[3] = new Book("Пьяный Сталкер", 100, "Иванов", 2);
        arrBook[4] = new Book("Война и мир", 2300, "Толстой");

        Reader reader = new Reader();
        Book selectedBook = reader.choiceBook(arrBook);
        reader.readBook(selectedBook);
        reader.rateBook(selectedBook);
    }
}
