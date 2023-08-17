package AdvancdJava.LibraryManagementSystem;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;
import static java.lang.System.exit;


class Books {
    ArrayList<Books> books = new ArrayList<>();
    String name, author, issuedTo = "", issuedOn = "";
}

class Library extends Books{
    public byte displayOptions() {
        System.out.println("1. Add book\n2. Display book\n3. Issue book\n4. return book\n5. Exit");
        System.out.print("Enter your choice: ");
        Scanner inputChoice = new Scanner(System.in);
        return inputChoice.nextByte();
    }

    public void addBook() {
        Books newBook = new Books();
        Scanner inputBookDetails = new Scanner(System.in);

        System.out.print("Enter book name: ");
        newBook.name = inputBookDetails.nextLine();

        System.out.print("Enter Authors name: ");
        newBook.author = inputBookDetails.nextLine();

        System.out.println(newBook.name + " has been added to the library");

        books.add(newBook);
    }
    public void displayBook() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).name);
        }
    }
    public void displayBookWithDetails() {
        for (int i = 0; i < books.size(); i++) {
            if (!Objects.equals(books.get(i).issuedTo, "")) {
                System.out.println((i + 1) + ". " + books.get(i).name + " issued by " + books.get(i).issuedTo + " on " + books.get(i).issuedOn);
            } else {
                System.out.println((i + 1) + ". " + books.get(i).name);
            }
        }
    }

    public void issueBook() {
        displayBook();

        LocalDate date = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter the number of book that you want to issue: ");

        Scanner bookChoice = new Scanner(System.in);
        int issuedBookIndex = bookChoice.nextInt() - 1;
        if (issuedBookIndex > books.size() || issuedBookIndex < 0) {
            System.out.println("You entered wrong choice");
            return;
        }

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String issuerName = inputName.nextLine();

        books.get(issuedBookIndex).issuedTo = issuerName;
        String issuedBook = books.get(issuedBookIndex).name;

        books.get(issuedBookIndex).issuedOn = date.format(df);

        System.out.println(issuedBook + " by " + books.get(issuedBookIndex).author + " is issued by " + issuerName + " on " + books.get(issuedBookIndex).issuedOn);
    }

    public void returnBook() {
        Scanner inputBookName = new Scanner(System.in);
        System.out.println("Enter the name of the book which you want to return: ");
        String bookName = inputBookName.nextLine();
        for (Books book : books) {
            if (book.name.equals(bookName)) {
                book.issuedTo = "";
                book.issuedOn = "";
                System.out.println(bookName + " has been returned");
                displayBookWithDetails();
                return;
            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Welcome to library");
        while (true) {
            byte choice = library.displayOptions();
            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.displayBookWithDetails();
                case 3 -> library.issueBook();
                case 4 -> library.returnBook();
                case 5 -> exit(0);
            }
        }
    }
}


/*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
*/
