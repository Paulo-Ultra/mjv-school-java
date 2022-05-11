package javaexplorer.collections;

import javaexplorer.collections.dominio.Manga;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {


        @DisplayName("Teste de Iterator e removeIf")
        @Test
        void testIterator(){

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on titan", 19.90, 0));
        mangas.add(new Manga(1L,"Berserk", 9.50, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2, 0));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99, 0));

        //Forma de percorrer um objto para remover
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade()==0){
//                mangaIterator.remove();
//            }
//        }

        //Programação funcional, o removeIf usa o mesmo Iterator usado anteriormente
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
