
import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;

    // Constructor
    public Book(String title, String author, String userRating, String reviews, String price, String year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getUserRating() {
        return userRating;
    }

    public String getReviews() {
        return reviews;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: $" + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println(); // Add a newline for better readability between books
    }

    public int numberOfBookByAuthor(List<Book> livros, String author) {
        int count = 0;

        for (Book book : livros) {
            if(book.getAuthor().equals(author)) {
                count++;
            }
        }
        return count;
    }
    public List<String> listaAutores(List<Book> livros){
        List<String> lista_Autores = new ArrayList<>();

        for(Book book : livros){
                if(!lista_Autores.contains(book.getAuthor())){
                    lista_Autores.add(book.getAuthor());
                }
            }
        return lista_Autores;
    }

    public List<String> livrosAutor (List<Book> livros, String author){
        List<String> lista_Livros = new ArrayList<>();

        for(Book book  : livros){
            if(book.getAuthor().equals(author)){
                    if(!lista_Livros.contains(book.getTitle())){
                        lista_Livros.add(book.getTitle());
                    }
                }
            }
        return lista_Livros;
    }

    public List<String> livrosAvalicoes(List<Book> livros, String avaliacao){
        List<String> lista_Avaliacoes = new ArrayList<>();

        for(Book book : livros){

            if(book.getUserRating().equals(avaliacao)){
                String resultado = book.getTitle() + " de " + book.getAuthor();

                if(!lista_Avaliacoes.contains(resultado)){
                    lista_Avaliacoes.add(resultado);
                }
            }
        }
        return lista_Avaliacoes;
    }

    public List<String> precoLivros(List<Book> livros, String autor){
        List<String> lista_PrecoLivros = new ArrayList<>();

        for(Book book : livros){
            if(book.getAuthor().equals(autor)){
                String resultado = book.getTitle() + " - " + book.getPrice();

                if(!lista_PrecoLivros.contains(resultado)){
                    lista_PrecoLivros.add(resultado);
                }
            }
        }
        return lista_PrecoLivros;
    }
}