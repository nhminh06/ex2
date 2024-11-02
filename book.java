public class book {
    private String isbn;
    private String name;
    private authour author;
    private double price;
    private int qty=0;
    public book (String isbn, String name, authour author, double price ){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public book (String isbn, String name, authour author, double price, int qty ){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public authour getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String getAuthourname(){
       return author.getName();
    }
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
