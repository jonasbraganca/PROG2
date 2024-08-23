public class Main {
    public static void main(String[] args) {
    
        Biblioteca biblioteca = new Biblioteca(5);
      
        biblioteca.adicionarLivro(new Livro("PROG1", "GUSTAVO", "300"));
        biblioteca.adicionarLivro(new Livro("PROG2", "GUSTAVO", "350"));
        biblioteca.adicionarLivro(new Livro("PROG3", "GUSTAVO", "310"));

        System.out.println("Livros disponíveis na biblioteca:");
        biblioteca.exibirLivros();

        String tituloBusca = "PROG1";
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo(tituloBusca);
        if (livroEncontrado != null) {
            System.out.println("\nLivro encontrado: " + livroEncontrado);
        } else {
            System.out.println("\nLivro com o título '" + tituloBusca + "' não encontrado.");
        }
    }
}
