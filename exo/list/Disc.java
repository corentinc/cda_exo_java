package exo.list;

public class Disc {
    private String name;
    private int year;
    private Author author;

    public Disc(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println(author + " a sorti '" + name + "' en " + year);
    }
}
