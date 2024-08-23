public class Livro {
  private String titulo;
  private String autor;
  private int numeropaginas;

  public Livro(String titulo, String autor, int numeropaginas){
    this.titulo=titulo;
    this.autor=autor;
    this.numeropaginas=numeropaginas;
  }

  public String getTitulo(){
    return titulo;
  }
  public String getAutor(){
    return autor;
  }
  public int getNumeropaginas(){
    return numeropaginas;
  }

  public String livros(){
    return "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeropaginas;
  }



}
