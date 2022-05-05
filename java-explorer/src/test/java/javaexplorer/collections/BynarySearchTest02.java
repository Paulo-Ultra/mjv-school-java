package javaexplorer.collections;

import javaexplorer.collections.dominio.Manga;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest02 {
    @DisplayName("Teste para verificar funcionamento do método")
    @Test
    void bynarySearchTest() {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan", 19.90));
        mangas.add(new Manga(1L,"Berserk", 9.50));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L,"Pokemon", 11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"Dragon Ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
