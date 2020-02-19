package Exercicio03;

public class Livro {

    private String titulo;
    private String autor;
    private int numPaginas;

    /*public String getTitulo() {
        return titulo;*/


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;


    }

}
