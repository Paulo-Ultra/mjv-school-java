package javaexplorer.collections;

import javaexplorer.collections.dominio.Manga;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {

    @DisplayName("Teste Set - HashSet e LinkedHashSet")
    @Test
    void setTest() {

        //Usando LinkedHashSet se mantém a ordem de inserção
//        Set<Manga> mangas = new LinkedHashSet<>();
        //Usando HashSet a ordem será pelas comparações colocadas ou geradas pelo hash
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L,"Attack on titan", 19.90, 0));
        mangas.add(new Manga(1L,"Berserk", 9.50, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99, 0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
