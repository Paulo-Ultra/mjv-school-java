package javaexplorer.collections;

import javaexplorer.collections.dominio.Manga;
import javaexplorer.collections.dominio.Smartphone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//Caso não tenha um compareTo é necessário criar um Comparator
class SmatphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {

    @DisplayName("Teste NavigableSet")
    @Test
    void NavigableSetTest() {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmatphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on titan", 19.90, 0));
        mangas.add(new Manga(1L,"Berserk", 9.50, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L,"Aaragon", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
