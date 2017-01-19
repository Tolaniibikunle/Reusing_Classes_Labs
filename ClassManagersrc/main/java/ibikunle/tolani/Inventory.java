package ibikunle.tolani;

import java.util.ArrayList;

/**
 * Created by tolaniibikunle on 1/18/17.
 */
public class Inventory {

    private ArrayList<Product> inventory = new ArrayList<Product>();

    public double countProductsSumOf(){
        double sum =0;
        for (int i = 0; i < inventory.size(); i++) {
          sum+= getProductByIndex(i).getPrice();
        }
        return sum;
    }
    public void addProduct(Product product){
        inventory.add(product);
    }

    public Product getProductByIndex(int index){
        return inventory.get(index);
    }

}
