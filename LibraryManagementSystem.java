import java.util.ArrayList;
import java.util.Scanner;

// Book Class
class Book {
    int bookId;
    String bookName;
    String authorName;

    // Constructor
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Display Method
    void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author Name : " + authorName);
        System.out.println("---------------------------");
    }
}

// Main Class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, name, author));

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No Books Available!");
                    } else {
                        System.out.println("\n--- Book Details ---");
                        for (Book b : books) {
                            b.displayBook();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {
                        if (b.bookId == searchId) {
                            System.out.println("\nBook Found:");
                            b.displayBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Program Exited Successfully!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
} 