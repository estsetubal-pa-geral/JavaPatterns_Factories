package javapatterns.factories.model;

/**
 * APA bibliography style for a Book:
 *
 *  - [author] ([year]). [title]. [publisher].
 *
 * @author brunomnsilva
 */
public class APABookCitation implements Citation {

    protected String author;
    protected String title;
    private String place;
    private String publisher;
    private String year;

    public APABookCitation(String author, String title, String place, String publisher, String year) {
        this.author = author;
        this.title = title;
        this.place = place;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toStringFormatted() {
        //[author] ([year]). [title]. [publisher].
        return "//TODO: apply citation style format";
    }

    @Override
    public String getAuthors() {
        return author;
    }

    @Override
    public String getYear() {
        return year;
    }
}
