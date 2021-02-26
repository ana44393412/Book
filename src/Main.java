public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("«Палата №6»", "Антон Чехов", 12, 236);
        Book book2 = new Book("«Колыбель для кошки»", "Курт Воннегут");
        Book book3 = new Book("«Бойцовский клуб»");

        Book[] books = {book1, book2, book3};
        Reader reader = new Reader();
        Book currentBook = reader.choiceBook(books);
        reader.readBook(currentBook);
        reader.setMark(currentBook);
    }
}
