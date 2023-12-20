package TTTasktwo;

public class Product implements Taxable{
    public  Integer pid;
    public Integer price;
    public Integer quantity;
    public double Finalamount;
    public double productTax;

    public Product(Integer pid,Integer price,Integer quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public void calcTax() {
        productTax=salesTax*price*quantity;
        Finalamount=productTax+price;
        productTax=Math.round(productTax*100.0)/100.0;
        System.out.println("Tax : "+productTax);

        System.out.println("Product price : "+Finalamount);
    }
}
