public class testbook {
    public static void main(String[] args) {
        authour author = new authour("John Doe", "john.doe@example.com");
        book book = new book("123456789", "Learning Java", author, 29.99, 100);
        System.out.println(book);
        book.setPrice(34.99);
        book.setQty(150);
        System.out.println(book);
    }
}
