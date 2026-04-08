import java.util.List;

public class Driver {
    public static void main(String[] args) {
        DatasetReader datasetReader = new DatasetReader();
        List<Book> books = datasetReader.readDataset("src/data.csv");
        Book bookInstance = new Book(null, null, null, null, null, null, null);
        int countB = bookInstance.numberOfBookByAuthor(books, "J.K. Rowling");
        // Print details of all Book objects
        System.out.println("Número de livros de J.K. Rowling: " + countB);
        System.out.println(" ");



        List<String> listaAutores = bookInstance.listaAutores(books);
        System.out.println("LISTA DE AUTORES");
        System.out.println(" ");

        for(String autor : listaAutores){
            System.out.println(autor);
        }
        System.out.println(" ");



        List<String> livrosAutor = bookInstance.livrosAutor(books, "J.K. Rowling");
        System.out.println("LIVROS POR AUTOR: J.K. Rowling");
        System.out.println(" ");


        for(String livro : livrosAutor){
            System.out.println(livro);
        }
        System.out.println(" ");



        List<String> livrosAvaliacao = bookInstance.livrosAvalicoes(books, "4");
        System.out.println("LIVROS COM AVALIÇÃO 4.0 ");
        System.out.println(" ");


        for(String avaliacao : livrosAvaliacao){
            System.out.println(avaliacao);
        }
        System.out.println(" ");



        List<String> livrosPrecoAutor = bookInstance.precoLivros(books, "George R. R. Martin");
        System.out.println("VALOR DOS LIVROS DE: George R. R. Martin");
        System.out.println(" ");

        for(String preco : livrosPrecoAutor) {
            System.out.println(preco);
        }
    }
}