package ibikunle.tolani;

/**
 * Created by tolaniibikunle on 1/18/17.
 */
public class Product {
    private double price;
    private String id;
    private String quantityOnHand;


    public Product(double price, String id, String quantityOnHand){
        this.price = price;
        this.id = id;
        this.quantityOnHand = quantityOnHand;

    }

    public double getPrice() {
        return price;
    }


    public String getId() {
        return id;
    }


    public String getQuantityOnHand() {
        return quantityOnHand;
    }




}
