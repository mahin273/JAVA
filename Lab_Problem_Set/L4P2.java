import java.util.Scanner;

class Book implements Comparable<Book> {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        this.count = 0;
    }

    public Book() {
        this.count = 0;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Book Title: " + bookTitle + ", Number of Pages: " + numberOfPages + ", Count: "
                + count;
    }

    @Override
    public int compareTo(Book otherBook) {
        if (this.numberOfPages > otherBook.numberOfPages) {
            return 1;
        } else if (this.numberOfPages == otherBook.numberOfPages) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class L4P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("ISBN: ");
            int ISBN = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Book Title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Number of Pages: ");
            int numberOfPages = scanner.nextInt();
            books[i] = new Book(ISBN, bookTitle, numberOfPages);
        }
        displayAll(books);
        System.out.println("Comparing Book 1 and Book 2 based on number of pages: " + books[0].compareTo(books[1]));
        scanner.close();
    }

    public static void displayAll(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
