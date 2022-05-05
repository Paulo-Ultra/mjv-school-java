package javaexplorer.collections.dominio;

import java.util.Objects;

public class Manga implements  Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "Id não pode ser Nulo");
        Objects.requireNonNull(nome, "Nome não pode ser Nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(manga.preco, preco) == 0 && id.equals(manga.id) && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }


    @Override
    public int compareTo(Manga outroManga) {
        // Retorna negativo se o this < outroManga
        //Se this == outroManga, return 0
        //Retorna positivo se o this > outroManga
//        if (this.id < outroManga.getId()){
//            return -1;
//        }
//        if (this.id.equals((outroManga.getId()))){
//            return 0;
//        } else
//            return 1;
        //O Wrapper já tem o método compareTo então para o Id:
//        return id.compareTo(outroManga.getId());
        //Para nome
        return nome.compareTo(outroManga.getNome());

        //Tipos primitivos teria que chamar o Wharpper para poder usar o método
        //return Double.compare(preco, outroManga.getPreco());
        //Ou assim
        //return Double.valuOf(preco).compareTo(outroManga.getPreco());
    }
}
