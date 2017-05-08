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
public class ImportedtaxBehavior implements TaxBehavior {

    private float tax;
    private float price;
    private float totaltax;
       
    @Override
    public void caclculateTax(float price,String name) {
        this.price = price;
        totaltax = (price*getTax())/100;
        System.out.println("The tax for this "+name+" is " +totaltax);
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getTax() {
        return tax;
    }

    @Override
    public float getTotalPrice() {
        return price+totaltax;
    }
   
    
}
