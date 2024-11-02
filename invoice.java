public class invoice {
    private int id;
    private customer Customer;
    private double amount;
    public invoice(int id, customer Customer, double amount){
        this.id=id;
        this.Customer=Customer;
        this.amount=amount;
    }
    public int getId(){
        return id;
    }
    public customer getCustomer(){
        return Customer;
    }
    public  void setCustomer(){
        this.Customer=Customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerid(){
        return Customer.getId();

    }
    public String getcustomername(){
        return Customer.getName();
    }
    public double getamountafterDiscout(){
        return Customer.getDiscount();
    }
    public String toString (){
        return "invoice[id="+id+","+Customer.toString()+","+"amount="+amount;
    }
}
