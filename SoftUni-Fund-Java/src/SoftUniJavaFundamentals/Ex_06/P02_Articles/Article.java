package SoftUniJavaFundamentals.Ex_06.P02_Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String toString() {
        return String.format("%s - %s: %s", title, content, author);
    }

}
