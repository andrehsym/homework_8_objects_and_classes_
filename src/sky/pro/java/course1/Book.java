package sky.pro.java.course1;

public class Book {
    private String title;
    private int publishingYear;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

}

