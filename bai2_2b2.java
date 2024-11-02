public class bai2_2b2 {
    private String name;
    private bai2_2[] author;
    private double price;
    private int qty=0;
    public bai2_2b2(String name, bai2_2[] author, double price ){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public bai2_2b2(String name, bai2_2[] author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;

    }

    public bai2_2[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
