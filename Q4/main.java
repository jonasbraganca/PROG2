public class Main {
  public static void main(String[] args) {

    livro livro1 = new livro ("Programação 2", "Gustavo", 100);

    System.out.println(livro1.getAutor()+ " "+ livro1.getTitulo()+ " "+ livro1.getNumeropaginas());
  }
