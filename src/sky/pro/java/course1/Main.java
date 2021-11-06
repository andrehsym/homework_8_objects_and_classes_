package sky.pro.java.course1;

public class Main {

    private static Book[] shelf;

    public static void main(String[] args) {

        //ЗАДАЧА ЛЕГКАЯ

        Author kathy = new Author("Kathy", "Sierra");
        Book javaHeadFirst = new Book("Java Head First", 2010, kathy);
        System.out.println("Название первой книги - " + javaHeadFirst.getTitle() + ". Год издания: " + javaHeadFirst.getPublishingYear() +
                ". Автор - " + javaHeadFirst.author.getName() + " " + javaHeadFirst.author.getSecondName());
        javaHeadFirst.setPublishingYear(2015);
        System.out.println("Новый год издания первой книги " + javaHeadFirst.getPublishingYear());

        Author joanne = new Author("John", "Malkovich");
        Book harryPotter = new Book("Harry Potter", 1999, joanne);
        System.out.println("Название второй книги - " + harryPotter.getTitle() + ". Год издания - " + harryPotter.getPublishingYear() +
                ". Автор - " + harryPotter.author.getName() + " " + harryPotter.author.getSecondName());

        Author stKing = new Author("Steven", "King");
        Book stand = new Book("The Stand", 1978, stKing);

        //ЗАДАЧА СРЕДНЯЯ
        System.out.println(" ");

        shelf = new Book[5];

        addBook(javaHeadFirst);
        addBook(harryPotter);
        addBook(stand);
        printLibrary(javaHeadFirst, kathy);
        printLibrary(harryPotter, joanne);
        printLibrary(stand, stKing);



    }

    public static void addBook(Book book) {

        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == null) {
                shelf[i] = book;
            }
        }

        return ;
    }

    public static void printLibrary(Book Book, Author Author) {
        for (int j = 0; j < shelf.length - 1; j++) {
//            if (library[j] != library[j + 1]) {
            System.out.println(Author.getName() + " " + Author.getSecondName() + ": " +
                    Book.getTitle() + ": " + Book.getPublishingYear());
            break;
//            }
        }
        return;
    }
}
