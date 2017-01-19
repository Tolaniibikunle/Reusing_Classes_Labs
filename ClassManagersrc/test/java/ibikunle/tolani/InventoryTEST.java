package ibikunle.tolani;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by tolaniibikunle on 1/18/17.
 */
public class InventoryTEST {
    Product product1;
    Inventory inventory;

    @Before
    public void setup(){
       product1 = new Product(10.20, "toy1", "2");
       inventory = new Inventory();
       inventory.addProduct(product1);
    }

    @Test
    public void countProductsSumTest(){
        double expected = 10.2;
        double actual = inventory.countProductsSumOf();
        assertEquals(expected, actual);
    }

}
