package exercicio2.model;

import exercicio2.interfaces.Printable;

public class Livro implements Printable {

    private String authorName;
    private String title;
    private String type;
    private int pages;

    public Livro(String authorName, String title, String type, int pages) {
        this.authorName = authorName;
        this.title = title;
        this.type = type;
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
