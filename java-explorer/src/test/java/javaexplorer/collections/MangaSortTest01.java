package javaexplorer.collections;

import javaexplorer.collections.dominio.Manga;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
public class MangaSortTest01 {
    @DisplayName("Testes Comparable e Comparator")
    @Test
    void sortTest() {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan", 19.90));
        mangas.add(new Manga(1L,"Berserk", 9.50));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L,"Pokemon", 11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));

        //Ordem de inserção
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("----------------------------");
        //Usando o compareTo
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("----------------------------");
        //Usando o compareTo
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
