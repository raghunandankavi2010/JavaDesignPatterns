/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.goods;


import sales.taxbehavior.TaxBehavior;

/**
 *
 * @author raghu
 */
public abstract class Goods {
    
    int number;
    float price;
    float totalprice;
    String name;
    
    TaxBehavior taxBehavior;
   
    public abstract void display();

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setTaxBehavior(TaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior;
    }
    
    public void calculateTax()
    {
        taxBehavior.caclculateTax(price,getName());
    }

    public float getTotalprice() {
        return taxBehavior.getTotalPrice();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
