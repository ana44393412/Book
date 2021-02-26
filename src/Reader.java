import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {
        Random random = new Random();
        int pos = random.nextInt(books.length);
        return books[pos];
    }

    public void readBook(Book book) {
        System.out.println("I read: " + book.toString());
    }

    public void setMark(Book book) {
        int nameLength = book.name.length();
        int authorLength;
        int serialNumber = book.serialNumber;
        int numberOfPages = book.numberOfPages;


        if (nameLength == 0) {
            nameLength = getRandom();
        }
        if (book.author == null) {
            authorLength = getRandom();
        } else{
            authorLength = book.author.length();
        }
        if (serialNumber == 0) {
            serialNumber = getRandom();
        }
        if (numberOfPages == 0) {
            numberOfPages = getRandom();
        }

        int mark = nameLength + authorLength + serialNumber + numberOfPages;

        System.out.println("The book " + book.name + " has mark " + mark);

    }

    int getRandom() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}

