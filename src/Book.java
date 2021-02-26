public class Book {
    String name;
    String author;
    int serialNumber;
    int numberOfPages;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int serialNumber, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String str = "Book: name: " + name;
        if (author != null) {
            str = str + ", author: " + author;
        }
        if (serialNumber != 0) {
            str = str + ", serial number: " + serialNumber;
        }
        if (numberOfPages != 0) {
            str = str + ", number of pages: " + numberOfPages;
        }
        return str;
    }
}

