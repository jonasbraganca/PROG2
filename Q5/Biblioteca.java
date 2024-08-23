public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
        } else {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }

    public void exibirLivros() {
        if (contador == 0) {
            System.out.println("Nenhum livro disponível na biblioteca.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(livros[i]);
            }
        }
    }
}
