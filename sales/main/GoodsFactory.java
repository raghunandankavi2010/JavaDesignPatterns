/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.main;

import sales.goods.Books;
import sales.goods.Chocalate;
import sales.goods.Goods;

/**
 *
 * @author raghu
 */
public class GoodsFactory {
    
    public Goods getGoods(String type)
    {
        if(type.equals("Book"))
        {
            return new Books();
        }
         if(type.equals("Chocolate"))
        {
            return new Chocalate();
        }
         return null;
    }
}
