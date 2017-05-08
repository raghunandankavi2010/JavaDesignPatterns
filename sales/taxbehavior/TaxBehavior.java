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
public interface TaxBehavior {
    
    public void caclculateTax(float price,String name);
    public float getTotalPrice();
}
