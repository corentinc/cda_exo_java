package exo.list;

import java.util.Objects;
import java.util.UUID;

public class Disc {
    private int id;
    private String name;
    private int year;
    private Author author;

    public Disc(int id, String name, int year, Author author) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disc disc = (Disc) o;
        return id == disc.id && year == disc.year && Objects.equals(name, disc.name) && Objects.equals(author, disc.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, author);
    }
}
