package javapatterns.factories.model;

/**
 * APA bibliography style for a Book Chapter:
 *
 *  - [author] ([year]). [title]. In [editor] (Eds.), [book_title]. (pp. [pages]). [publisher].
 *
 * @author brunomnsilva
 */
public class APABookChapterCitation implements Citation {

    protected String author;
    protected String title;
    private String book_title;
    private String editor;
    private String place;
    private String publisher;
    private String page_numbers;
    private String year;

    public APABookChapterCitation(String author, String title, String book_title, String editor,
                                  String place, String publisher, String page_numbers, String year) {
        this.author = author;
        this.title = title;
        this.book_title = book_title;
        this.editor = editor;
        this.place = place;
        this.publisher = publisher;
        this.page_numbers = page_numbers;
        this.year = year;
    }

    @Override
    public String toStringFormatted() {
        //[author] ([year]). [title]. In [editor] (Eds.), [book_title]. (pp. [pages]). [publisher].
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
