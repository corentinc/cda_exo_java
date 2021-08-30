package exo.list;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Author pinkFloyd = new Author("Pink Floyd");
        Author amyWinehouse = new Author("Amy Winehouse");
        Author davidBowie = new Author("David Bowie");

        Disc darkSideOfTheMoon = new Disc(1, "Dark side of the moon", 1973, pinkFloyd);
        Disc backToBlack = new Disc(2, "Back to black", 2005, amyWinehouse);
        Disc alladinSane = new Disc(3, "Alladin Sane", 1973, davidBowie);

        List<Disc> myDiscs = new ArrayList<>();
        myDiscs.add(darkSideOfTheMoon);
        myDiscs.add(backToBlack);
        myDiscs.add(alladinSane);

        searchByReleaseYear(myDiscs, 1973)
                .forEach(Disc::displayInfo);
        searchByAuthorName(myDiscs, "David Bowie").forEach(Disc::displayInfo);

        Map<Integer, Disc> mapFromDiscList = createMapFromDiscList(myDiscs);
        System.out.println("Seasch disc with id=3");
        findByDiscId(mapFromDiscList, 3)
                .displayInfo();
    }

    public static Map<Integer, Disc> createMapFromDiscList(List<Disc> discList) {
        // old way - java 7
        Map<Integer, Disc> result = new HashMap<>();
        for (Disc disc : discList) {
            result.put(disc.getId(), disc);
        }

        // new way - java 8
        return discList
                .stream()
                .collect(Collectors.toMap(Disc::getId, disc -> disc));
    }

    public static Disc findByDiscId(Map<Integer, Disc> discMap, int discId) {
        return discMap.get(discId);
    }

    public static List<Disc> searchByReleaseYear(List<Disc> discs, int year) {
        // odl way : java 7
        List<Disc> result = new ArrayList<>();
        for (Disc disc : discs) {
            if (disc.getYear() == year) {
                result.add(disc);
            }
        }

        // new way : java 8
        return discs.stream()
                .filter(disc -> disc.getYear() == year)
                .collect(Collectors.toList());
    }

    public static List<Disc> searchByAuthorName(List<Disc> discs, String authorName) {
        return discs.stream()
                .filter(disc -> disc.getAuthor().getName().equals(authorName))
                .collect(Collectors.toList());
    }

}