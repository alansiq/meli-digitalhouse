package exercicio2.model;

import exercicio2.interfaces.Printable;

public class Report implements Printable {
    private String author;
    private String content;
    private int pages;
    private String reviewer;

    public Report(String author, String content, int pages, String reviewer) {
        this.author = author;
        this.content = content;
        this.pages = pages;
        this.reviewer = reviewer;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Report{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", pages=" + pages +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
