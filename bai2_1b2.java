public class bai2_1b2 {
   private String name;
   private bai2_1 author;
   private double price;
   private int qty=0;
   public bai2_1b2(String name, bai2_1 author, double price){
       this.name=name;
       this.author = author;
       this.price = price;
   }
   public bai2_1b2(String name, bai2_1 author, double price, int pty){
       this.name=name;
       this.author=author;
       this.price=price;
       this.qty=qty;
   }
   public String getName(){
       return name;
   }
   public bai2_1 getAuthor(){
       return  author;
   }
   public double getPrice(){
       return price;
   }
   public int getqty(){
       return qty;
   }

    public void setPrice(double price){
        this.price=price;
    }
    public void setqty(int qty){
        this.qty=qty;
    }
    public String toString (){
       return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }

}
