/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.taxbehavior;

/**
 *
 * @author raghu
 */
public class ExemptedTaxBehavior implements TaxBehavior {

    private float price;
    @Override
    public void caclculateTax(float price,String name) {
        this.price = price;
        System.out.println("The price of this "+name+" is "+price);
    }

    @Override
    public float getTotalPrice() {
       return price;
    }

  
    
}
