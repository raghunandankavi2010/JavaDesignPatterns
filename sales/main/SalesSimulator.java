/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.main;


import sales.goods.Books;
import sales.goods.Chocalate;
import sales.goods.Goods;
import sales.taxbehavior.ExemptedTaxBehavior;
import sales.taxbehavior.ImportedtaxBehavior;

/**
 *
 * @author raghu
 */
public class SalesSimulator {
    
    
    public static void main(String args[])
    {
        
          GoodsFactory goodsFactory = new GoodsFactory();
//        Goods book = goodsFactory.getGoods("Book");
//        book.setNumber(1);
//        book.setPrice(12.9f);
//        book.setTaxBehavior(new ExemptedTaxBehavior());
//        book.calculateTax();
        
        //1 box of imported chocolates at 11.25
        Goods chGoods = goodsFactory.getGoods("Chocolate");
        chGoods.setName("imported box of chocolates");
        chGoods.setNumber(1);
        chGoods.setPrice(11.25f);
        ImportedtaxBehavior importedtaxBehavior = new ImportedtaxBehavior();
        importedtaxBehavior.setTax(5);
        chGoods.setTaxBehavior(importedtaxBehavior);
        chGoods.calculateTax();
        chGoods.display();
    }
}
