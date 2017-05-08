/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.goods;

/**
 *
 * @author raghu
 */
public class Chocalate extends Goods{

    @Override
    public void display() {
         System.out.println(+getNumber()+" "+getName()+ ": "+getTotalprice());
    }
    
}
