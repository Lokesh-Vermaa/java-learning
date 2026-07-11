public class Book {
    static int totalBooks = 100;
    String title;
    String author;
    int isbn;
    Book(String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    public int borrowbooks(int noofbooksborrow){
        totalBooks -= noofbooksborrow;
        System.out.println("no of books is: "+noofbooksborrow);
        return noofbooksborrow;
    }
    public int returnbook(int noofbooksreturned){
        totalBooks += noofbooksreturned;
        System.out.println("the no of books returned are: "+noofbooksreturned);
        return noofbooksreturned;
    }


    static int getTotalBooks(){
        return totalBooks;
        }
}
