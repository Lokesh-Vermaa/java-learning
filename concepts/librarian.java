public class librarian {
    public static void main(String[] args) {
       Book record = new Book("harry potter", "jk rowlings", 5832);
       record.borrowbooks(6);
       record.returnbook(9);
       Book.getTotalBooks();
       System.out.printf("your total no of books are %d", Book.getTotalBooks());
    }
}
