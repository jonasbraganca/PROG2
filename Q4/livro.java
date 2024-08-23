public class livro {
  private String titulo;
  private String autor;
  private int numeropaginas;
  

    public livro (String titulo, String autor, int numeropaginas) {
      this.titulo=titulo;
      this.autor=autor;
      this.numeropaginas=numeropaginas;


    public String getTitulo(){
      return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumeropaginas(){
        return numeropaginas;
    }

public void exibirdetalhes(){
    System.out.println("titulo: "+titulo);
    System.out.println("autor: "+autor);
    System.out.println("numeropaginas: "+numeropaginas);
}
     
}
