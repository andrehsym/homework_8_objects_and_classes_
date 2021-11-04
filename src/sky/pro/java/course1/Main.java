package sky.pro.java.course1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА ЛЕГКАЯ

        Author kathy = new Author("Kathy", "Sierra");
        Book javaHeadFirst = new Book("Java Head First", 2010, kathy);
        System.out.println("Название первой книги - " + javaHeadFirst.getTitle() + ". Год издания: " + javaHeadFirst.getPublishingYear() +
                ". Автор - " + kathy.getName() + " " + kathy.getSecondName());
        javaHeadFirst.setPublishingYear(2015);
        System.out.println("Новый год издания первой книги " + javaHeadFirst.getPublishingYear());
        Author john = new Author("John", "Malkovich");
        Book herlockSholms = new Book("Herlock Sholms", 1999, john);
        System.out.println("Название второй книги - " + herlockSholms.getTitle() + ". Год издания - " + herlockSholms.getPublishingYear() +
                ". Автор - " + john.getName() + " " + john.getSecondName());
        Author stKing = new Author("Steven", "King");
        Book stand = new Book("The Stand", 1978, stKing);

        //ЗАДАЧА СРЕДНЯЯ
        System.out.println(" ");

        Book[] shelf = new Book[5];
        createLibrary(shelf, javaHeadFirst);
        createLibrary(shelf, herlockSholms);
        createLibrary(shelf, stand);
        printLibrary(shelf, javaHeadFirst, kathy);
        printLibrary(shelf, herlockSholms, john);
        printLibrary(shelf, stand, stKing);
    }

    public static Book[] createLibrary(Book[] library, Book Book) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = Book;
            }
        }
        return library;
    }

    public static Book[] printLibrary(Book[] library, Book Book, Author Author) {
        for (int j = 0; j < library.length - 1; j++) {
//            if (library[j] != library[j + 1]) {
            System.out.println(Author.getName() + " " + Author.getSecondName() + ": " +
                    Book.getTitle() + ": " + Book.getPublishingYear());
            break;
//            }
        }
        return library;
    }
}
